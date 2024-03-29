jsx3.require("jsx3.lang.Exception");

if(!tibco) {
/**
 * The top-level package.
 */
jsx3.lang.Package.definePackage("tibco", function(tibco) {
});
}

if(!tibco.uxcore) {
/**
 * The root package for all ActiveMatrix Admin UI classes.
 */
jsx3.lang.Package.definePackage("tibco.uxcore", function(admin) {
});
}

/**
 * A special exception type thrown when a namespace used for resolving URIs is not valid.
 */
jsx3.Class.defineClass("tibco.uxcore.exception.InvalidNamespaceException", jsx3.lang.Exception, null, function(ex, ex_prototype) {

  /**
   * The instance initializer.
   * @param strMsg {String} the message for this exception
   * @param objCause {jsx3.lang.Exception} the exception that caused this eror (optional)
   */
  ex_prototype.init = function(strMsg, objCause) {
      var message = "InvalidNamespaceException";
      if(strMsg) {
          message += ": " + strMsg;
      }
      this.jsxsuper(message, objCause);
  };
});
