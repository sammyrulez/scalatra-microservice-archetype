package ${package}

import org.scalatest.FunSuiteLike
import org.scalatra.test.scalatest.ScalatraSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner]) // makes test run with Maven Surefire
class MainServletTest extends ScalatraSuite with FunSuiteLike {


  implicit val swagger = new ${artifactId}Swagger

  mount(new MainServlet, "/*")

  test("simple get") {
    get("/") {
      status should equal (200)
      body should include ("Rose")
    }
  }

}
