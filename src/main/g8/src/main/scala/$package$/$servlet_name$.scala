package $package$

import org.scalatra._

class $servlet_name$ extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }
  
}
