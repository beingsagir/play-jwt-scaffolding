
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/sandbox/opensource/play-jwt-scaffolding/conf/routes
// @DATE:Tue Sep 12 02:14:16 IST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def signIn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signIn",
      """
        function(email0,password1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signIn/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("email", email0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("password", password1))})
        }
      """
    )
  
    // @LINE:15
    def getCurrentUserForTest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getCurrentUserForTest",
      """
        function(email0,password1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userCreatedTest/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("email", email0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("password", password1))})
        }
      """
    )
  
    // @LINE:7
    def signUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signUp",
      """
        function(email0,password1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signUp/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("email", email0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("password", password1))})
        }
      """
    )
  
    // @LINE:12
    def access: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.access",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authCheck"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
