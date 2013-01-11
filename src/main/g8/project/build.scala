import sbt._
import Keys._

object $name;format="Camel"$Build extends Build {
  val Organization = "$organization$"
  val Name = "$name$"
  val Version = "$version$"
  val ScalaVersion = "$scala_version$"
  val ScalatraVersion = "2.2.0-SNAPSHOT"

  import java.net.URL
  import com.github.siasia.PluginKeys.port
  import com.github.siasia.WebPlugin.{container, webSettings}

  lazy val project = Project (
    "$name;format="norm"$",
    file("."),
    settings = Defaults.defaultSettings ++ webSettings ++ Seq(
      organization := Organization,
      name := Name,
      version := Version,
      scalaVersion := ScalaVersion,
      classpathTypes += "orbit",
      resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/",
      scalatraCrossVersion <<= (scalaVersion) {
        case v if v startsWith "2.9." => CrossVersion.Disabled
        case _ => CrossVersion.binary
      },
      libraryDependencies <<= (libraryDependencies, scalatraCrossVersion) {
        (libs, scalatraCV) => libs ++ Seq(
          "org.scalatra" % "scalatra" % ScalatraVersion cross scalatraCV,
          "org.scalatra" % "scalatra-scalate" % ScalatraVersion cross scalatraCV,
          "org.scalatra" % "scalatra-specs2" % ScalatraVersion % "test" cross scalatraCV,
          "ch.qos.logback" % "logback-classic" % "1.0.6" % "runtime",
          "org.eclipse.jetty" % "jetty-webapp" % "8.1.7.v20120910" % "container",
          "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "container;provided;test" artifacts (Artifact("javax.servlet", "jar", "jar"))
        )
      },
      browseTask
    )
  )

  val scalatraCrossVersion = SettingKey[CrossVersion]("scalatra-cross-version", "cross build strategy for Scalatra")

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
}
