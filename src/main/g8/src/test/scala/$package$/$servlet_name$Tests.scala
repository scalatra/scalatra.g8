package $package$

import org.scalatra.test.scalatest._

class $servlet_name$Tests extends ScalatraFunSuite {
  
  addServlet(classOf[$servlet_name$], "/*")
    
  test("GET / on $servlet_name$ should return status 200") {
    get("/") {
      status should equal (200)
    }
  }
  
}
