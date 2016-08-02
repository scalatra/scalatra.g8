import sbt._
import Keys._
import org.scalatra.sbt._
import org.scalatra.sbt.PluginKeys._
import com.earldouglas.xwp.JettyPlugin
import com.mojolly.scalate.ScalatePlugin._
import ScalateKeys._

object $name;format="Camel"$Build extends Build {
  val Organization = "$organization$"
  val Name = "$name$"
  val Version = "$version$"
  val ScalaVersion = "$scala_version$"
  val ScalatraVersion = "$scalatra_version$"

  lazy val commonDeps = Seq(
    "commons-lang" % "commons-lang" % "2.6"
  )

  lazy val commonSettings = Seq (
    organization := Organization,
    name := Name,
    version := Version,
    scalaVersion := ScalaVersion,
    resolvers += Classpaths.typesafeReleases,
    resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases",
    libraryDependencies ++= commonDeps
  )


  lazy val Common =
    Project(
      id = "Common",
      base = file("Common"))
      .settings(commonSettings: _*)

  lazy val DataTier =
    Project(
      id = "DataTier",
      base = file("DataTier"))
      .settings(commonSettings: _*)
      .dependsOn(
        Common
      )


  lazy val DomainTier =
    Project(
      id = "DomainTier",
      base = file("DomainTier"))
      .settings(commonSettings: _*)
      .dependsOn(
        DataTier,
        Common
      )

  lazy val webApp = Project (
    "$name;format="norm"$",
  file("."),
  settings = ScalatraPlugin.scalatraSettings ++ scalateSettings ++ Seq(
    libraryDependencies ++= Seq(
      "org.scalatra" %% "scalatra" % ScalatraVersion,
      "org.scalatra" %% "scalatra-scalate" % ScalatraVersion,
      "org.scalatra" %% "scalatra-specs2" % ScalatraVersion % "test",
      "ch.qos.logback" % "logback-classic" % "1.1.5" % "runtime",
      "org.eclipse.jetty" % "jetty-webapp" % "9.2.15.v20160210" % "container",
      "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided"
    ),
    scalateTemplateConfig in Compile <<= (sourceDirectory in Compile){ base =>
      Seq(
        TemplateConfig(
          base / "webapp" / "WEB-INF" / "templates",
          Seq.empty,  /* default imports should be added here */
          Seq(
            Binding("context", "_root_.org.scalatra.scalate.ScalatraRenderContext", importMembers = true, isImplicit = true)
          ),  /* add extra bindings here */
          Some("templates")
        )
      )
    }
  )
  )
  .settings(commonSettings: _*)
    .enablePlugins(JettyPlugin)
}