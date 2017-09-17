package $package$

import org.scalatra.test.scalatest._
import org.scalatest.FunSuiteLike

class $servlet_name$Tests extends ScalatraSuite with FunSuiteLike {
  
  addServlet(classOf[$servlet_name$], "/*")
    
  test("GET / on $servlet_name$ should return status 200"){
    get("/"){
      status should equal (200)
    }
  }
  
}
