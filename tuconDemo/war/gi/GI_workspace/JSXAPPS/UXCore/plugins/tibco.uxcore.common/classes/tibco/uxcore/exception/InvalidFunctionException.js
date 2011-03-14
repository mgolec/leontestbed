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
 * A special exception type thrown when a callback function is not valid.
 */
jsx3.Class.defineClass("tibco.uxcore.exception.InvalidFunctionException", jsx3.lang.Exception, null, function(ex, ex_prototype) {

  /**
   * The instance initializer.
   * @param strMsg {String}  the message for this exception
   * @param objCause {jsx3.lang.Exception} the exception that caused this exception (optional)
   */
  ex_prototype.init = function(strMsg, objCause) {
      var message = "InvalidFunctionException";
      if(strMsg) {
          message += ": " + strMsg;
      }
      this.jsxsuper(message, objCause);
  };
});