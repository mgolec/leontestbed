<html>
    <head>
        <title>Time2Tweet :: Schedule your tweets</title>
        <link rel="stylesheet" type=text/css href="/css/main.css"/>
    </head>
    <body>
    <#include "logo.ftl"/>
    <a href="/">Back to Home</a>
    <div>
        <form action="/user?action=signup" method="post">
           <div>
               <span>User Name</span>
               <input type='text' name='sign_up_name' value='${userName!""}'/>
               <span style="color:#ff0000">${errorMessage!""}<span>
           </div>
           <div>    
               <span>Password</span>
               <input type='password' name='sign_up_password' value='${password!""}'/>
           </div>
           <div>    
               <span>Repeat Password</span>
               <input type='password' name='repeat_sign_up_password' value=''/>
           </div>           
           <input type='button' name="a" value="signup" onclick="javascript: onSubmit();"/>
        </form>
    </div>
    </body>
    
<script>
    function onSubmit() {
    		if( document.forms[0].sign_up_password.value!=document.forms[0].repeat_sign_up_password.value) {
    			alert('password not match!');
    			return false;
    		}else {
    			document.forms[0].submit();
    		}
    }
</script>