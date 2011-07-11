import org.scalatra._
import scalate.ScalateSupport

trait ScalatraAction extends ScalateSupport {
  protected def scaml(name:String) = 
    templateEngine.layout(viewTemplateFor("scaml", name))

  protected def viewTemplateFor(ext:String, name:String) = {
    val base = name match {
      case s if s.endsWith("/") => s + "index"
      case s => s
    }
    "/WEB-INF/scalate/templates/%s.%s".format(base, ext)
  }
}

