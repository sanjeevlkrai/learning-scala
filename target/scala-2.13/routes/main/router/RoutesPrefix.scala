// @GENERATOR:play-routes-compiler
// @SOURCE:/home/rai04/project/scala_project/first-web-project/firstproject/conf/routes
// @DATE:Thu Nov 07 16:16:49 IST 2019


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
