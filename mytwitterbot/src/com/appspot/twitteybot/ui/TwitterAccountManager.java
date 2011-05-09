package com.appspot.twitteybot.ui;

import com.appspot.twitteybot.datastore.ApplicationProperty;
import com.appspot.twitteybot.datastore.PMF;
import com.appspot.twitteybot.datastore.TwitterAccount;
import com.appspot.twitteybot.datastore.TwitterStatus;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserServiceFactory;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.http.AccessToken;
import twitter4j.http.RequestToken;

public class TwitterAccountManager extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final String COOKIE_TOKEN = "token";
	private static final String COOKIE_TOKEN_SECRET = "token_secret";
	private static final Logger log = Logger.getLogger(TwitterAccountManager.class.getName());

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter(Pages.PARAM_ACTION);

		if (action == null) {
			resp.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
			return;
		}

		Twitter twitter = new Twitter();
		twitter.setOAuthConsumer(ApplicationProperty.read(ApplicationProperty.CONSUMER_KEY), ApplicationProperty
				.read(ApplicationProperty.CONSUMER_SECRET));
		log.warning("action="+action+", Using consumer key " + ApplicationProperty.read(ApplicationProperty.CONSUMER_KEY)+", isTesting()="+ApplicationProperty.isTesting());
		try {
		    if(ApplicationProperty.isTesting() && action.equalsIgnoreCase(Pages.PARAM_ACTION_ADD)) {
		        saveToken("token", "tokenSecret", "papaya");
		        resp.sendRedirect(Pages.PAGE_MAIN);
		    }
		    else if (action.equalsIgnoreCase(Pages.PARAM_ACTION_ADD)) {
				RequestToken requestToken = twitter.getOAuthRequestToken();
				log.warning("requestToken="+requestToken+", token="+requestToken.getToken()+", secret="+requestToken.getTokenSecret()+", url="+requestToken.getAuthorizationURL());
				resp.addCookie(new Cookie(COOKIE_TOKEN, requestToken.getToken()));
				resp.addCookie(new Cookie(COOKIE_TOKEN_SECRET, requestToken.getTokenSecret()));
				resp.sendRedirect(requestToken.getAuthorizationURL());
			} else if (action.equalsIgnoreCase(Pages.PARAM_OAUTH)) {
				String token = null, tokenSecret = null;
				Cookie[] cookies = req.getCookies();
                log.warning("back from twitter, req="+req.getQueryString());				
				for (Cookie cookie : cookies) {
					if (cookie.getName().equals(COOKIE_TOKEN)) {
						token = cookie.getValue();
					}
					if (cookie.getName().equals(COOKIE_TOKEN_SECRET)) {
						tokenSecret = cookie.getValue();
					}
				}
				AccessToken accessToken = twitter.getOAuthAccessToken(token, tokenSecret);
				if(accessToken==null) {
				    log.warning("twitter token cann't be retrieved for token="+token+", secret="+tokenSecret);
				}
				this.saveToken(accessToken);
				resp.sendRedirect(Pages.PAGE_MAIN);
			} else if (action.equalsIgnoreCase(Pages.PARAM_ACTION_DELETE)) {
				this.deleteToken(req.getParameter(Pages.PARAM_SCREENNAME));
				resp.getWriter().write("Delete Successful");
			} else {
				resp.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
			}
		} catch (TwitterException e) {
			e.printStackTrace(resp.getWriter());
		} catch (Exception e) {
		    e.printStackTrace(resp.getWriter());
		}
	}
	
	private void saveToken(AccessToken token) {
	    saveToken(token.getToken(), token.getTokenSecret(), token.getScreenName());
	}
	private void saveToken(String token, String tokenSecret, String screenName) {
		TwitterAccount twitterAccount = new TwitterAccount();
		twitterAccount.setUser(UserServiceFactory.getUserService().getCurrentUser());
		twitterAccount.setToken(token);
		twitterAccount.setSecret(tokenSecret);
		twitterAccount.setTwitterScreenName(screenName);
		PersistenceManager pm = PMF.get().getPersistenceManager();
		pm.makePersistent(twitterAccount);
		pm.close();
	}

	private void deleteToken(String screenName) {
		User user = UserServiceFactory.getUserService().getCurrentUser();
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query query = pm.newQuery(TwitterAccount.class);
		query.setFilter("twitterScreenName == screenVar && user == userVar");
		query.declareParameters("String screenVar,  com.google.appengine.api.users.User userVar");
		@SuppressWarnings("unchecked")
		List<TwitterAccount> twitterAccounts = (List<TwitterAccount>) query.execute(screenName, user);
		pm.deletePersistentAll(twitterAccounts);
		query.closeAll();

		query = pm.newQuery(TwitterStatus.class);
		query.setFilter("twitterScreenName == screenVar && user == userVar");
		query.declareParameters("String screenVar,  com.google.appengine.api.users.User userVar");
		@SuppressWarnings("unchecked")
		List<TwitterStatus> twitterStatus = (List<TwitterStatus>) query.execute(screenName, user);
		pm.deletePersistentAll(twitterStatus);

		query.closeAll();
		pm.close();
	}
}