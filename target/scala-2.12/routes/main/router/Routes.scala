
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/sandbox/opensource/play-jwt-scaffolding/conf/routes
// @DATE:Tue Sep 12 02:14:16 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:18
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:18
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signUp/""" + "$" + """email<[^/]+>/""" + "$" + """password<[^/]+>""", """controllers.HomeController.signUp(email:String, password:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signIn/""" + "$" + """email<[^/]+>/""" + "$" + """password<[^/]+>""", """controllers.HomeController.signIn(email:String, password:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authCheck""", """controllers.HomeController.access"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userCreatedTest/""" + "$" + """email<[^/]+>/""" + "$" + """password<[^/]+>""", """controllers.HomeController.getCurrentUserForTest(email:String, password:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_signUp1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUp/"), DynamicPart("email", """[^/]+""",true), StaticPart("/"), DynamicPart("password", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_signUp1_invoker = createInvoker(
    HomeController_0.signUp(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signUp",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """signUp/""" + "$" + """email<[^/]+>/""" + "$" + """password<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_signIn2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signIn/"), DynamicPart("email", """[^/]+""",true), StaticPart("/"), DynamicPart("password", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_signIn2_invoker = createInvoker(
    HomeController_0.signIn(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signIn",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """signIn/""" + "$" + """email<[^/]+>/""" + "$" + """password<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_access3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authCheck")))
  )
  private[this] lazy val controllers_HomeController_access3_invoker = createInvoker(
    HomeController_0.access,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "access",
      Nil,
      "GET",
      this.prefix + """authCheck""",
      """authentication test""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_getCurrentUserForTest4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userCreatedTest/"), DynamicPart("email", """[^/]+""",true), StaticPart("/"), DynamicPart("password", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_getCurrentUserForTest4_invoker = createInvoker(
    HomeController_0.getCurrentUserForTest(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getCurrentUserForTest",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """userCreatedTest/""" + "$" + """email<[^/]+>/""" + "$" + """password<[^/]+>""",
      """Auth less data access""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_HomeController_signUp1_route(params) =>
      call(params.fromPath[String]("email", None), params.fromPath[String]("password", None)) { (email, password) =>
        controllers_HomeController_signUp1_invoker.call(HomeController_0.signUp(email, password))
      }
  
    // @LINE:8
    case controllers_HomeController_signIn2_route(params) =>
      call(params.fromPath[String]("email", None), params.fromPath[String]("password", None)) { (email, password) =>
        controllers_HomeController_signIn2_invoker.call(HomeController_0.signIn(email, password))
      }
  
    // @LINE:12
    case controllers_HomeController_access3_route(params) =>
      call { 
        controllers_HomeController_access3_invoker.call(HomeController_0.access)
      }
  
    // @LINE:15
    case controllers_HomeController_getCurrentUserForTest4_route(params) =>
      call(params.fromPath[String]("email", None), params.fromPath[String]("password", None)) { (email, password) =>
        controllers_HomeController_getCurrentUserForTest4_invoker.call(HomeController_0.getCurrentUserForTest(email, password))
      }
  
    // @LINE:18
    case controllers_Assets_versioned5_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
