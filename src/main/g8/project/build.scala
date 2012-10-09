import sbt._
import Keys._

object $name__Camel$Build extends Build {

  import java.net.URL
  import com.github.siasia.PluginKeys.port
  import com.github.siasia.WebPlugin.container

  val browse = TaskKey[Unit]("browse", "open web browser to localhost on container:port")
  val browseTask = browse <<= (streams, port in container.Configuration) map { (streams, port) =>
    import streams.log
    val url = new URL("http://localhost:%s" format port)
    try {
      log info "Launching browser."
      java.awt.Desktop.getDesktop.browse(url.toURI)
    }
    catch {
      case _ => {
        log info { "Could not open browser, sorry. Open manually to %s." format url.toExternalForm }
      }
    }
  }

  lazy val project = Project (
    "project",
    file("."),
    settings = Defaults.defaultSettings ++ Seq(browseTask)
  )
}
