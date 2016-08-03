package ${package}

import org.scalatra.ScalatraServlet
import org.json4s.{DefaultFormats, Formats}
import org.scalatra.json._
import org.scalatra.swagger.{Swagger, SwaggerSupport}

class MainServlet(implicit val swagger: Swagger)  extends ScalatraServlet  with JacksonJsonSupport with SwaggerSupport{



  protected implicit lazy val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription = "The flowershop API. It exposes operations for browsing and searching lists of flowers, and retrieving single flowers."

  val getFlowers =
    (apiOperation[List[Tuple2[String,String]]]("getFlowers")
      summary "Show all flowers"
      notes "Shows all the flowers in the flower shop. You can search it too."
      parameter queryParam[Option[String]]("name").description("A name to search for"))


  before() {
    contentType = formats("json")
  }

  get("/", operation(getFlowers)) {
    List(
      ("yellow-tulip", "Yellow Tulip"),
      ("red-rose", "Red Rose"),
      ("black-rose", "Black Rose"))  }
}