import $package$._
import org.scalatra._
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    try {
      context.mount(new $servlet_name$, "/*")
    } catch {
      case t: Throwable => t.printStacktrace()
    }
  }
}
