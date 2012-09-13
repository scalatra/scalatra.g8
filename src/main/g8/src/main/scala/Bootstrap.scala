import $package$._
import org.scalatra._
import javax.servlet.ServletContext

class Bootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new $servlet_name$, "/*")
  }
}
