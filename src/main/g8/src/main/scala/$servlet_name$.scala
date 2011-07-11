import org.scalatra._
import java.net.URL

class $servlet_name$ extends ScalatraFilter with ScalatraAction {
  
  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

  get("/ping") {
    contentType = "text/plain"
    scaml("pong")
  }

  notFound {
    val templatePath = viewTemplateFor("scaml", requestPath)
    servletContext.getResource(templatePath) match {
      case url: URL =>
        contentType = "text/html"
        templateEngine.layout(templatePath)
      case _ =>
        filterChain.doFilter(request, response)
    }
  }
}
