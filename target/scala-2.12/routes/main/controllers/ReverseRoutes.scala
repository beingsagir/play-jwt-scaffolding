
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/sandbox/opensource/play-jwt-scaffolding/conf/routes
// @DATE:Tue Sep 12 02:14:16 IST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def signIn(email:String, password:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signIn/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("email", email)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("password", password)))
    }
  
    // @LINE:15
    def getCurrentUserForTest(email:String, password:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userCreatedTest/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("email", email)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("password", password)))
    }
  
    // @LINE:7
    def signUp(email:String, password:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signUp/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("email", email)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("password", password)))
    }
  
    // @LINE:12
    def access(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "authCheck")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:18
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
