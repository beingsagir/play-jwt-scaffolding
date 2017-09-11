
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/sandbox/opensource/play-jwt-scaffolding/conf/routes
// @DATE:Tue Sep 12 02:14:16 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
