package ${package}

import org.scalatra.ScalatraServlet
import org.scalatra.swagger.{ApiInfo, NativeSwaggerBase, Swagger}


class ResourcesApp(implicit val swagger: Swagger) extends ScalatraServlet with NativeSwaggerBase {

}


class ${artifactId}Swagger extends Swagger(Swagger.SpecVersion, "1.0.0", ${artifactId}SwaggerInfo)

object ${artifactId}SwaggerInfo extends ApiInfo(
    "The Flowershop API",
    "Docs for the Flowers API",
    "http://scalatra.org",
    "apiteam@scalatra.org",
    "MIT",
    "http://opensource.org/licenses/MIT")
