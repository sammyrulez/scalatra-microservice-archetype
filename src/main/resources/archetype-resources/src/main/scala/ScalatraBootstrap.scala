import javax.servlet.ServletContext

import org.scalatra._
import ${package}.{${artifactId}Swagger, MainServlet, ResourcesApp}

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {

    implicit val swagger = new ${artifactId}Swagger
    // Mount servlets.
    context.mount(new MainServlet, "/api/*")
    context.mount (new ResourcesApp, "/api-docs")

  }
}
