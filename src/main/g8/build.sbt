val ScalatraVersion = "$scalatra_version$"

ThisBuild / scalaVersion := "$scala_version$"
ThisBuild / organization := "$organization$"

lazy val hello = (project in file("."))
  .settings(
    name := "$name$",
    version := "$version$",
    libraryDependencies ++= Seq(
      "org.scalatra" %% "scalatra" % ScalatraVersion,
      "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test",
      "ch.qos.logback" % "logback-classic" % "1.2.3" % "runtime",
      "org.eclipse.jetty" % "jetty-webapp" % "$jetty_version$" % "container",
      "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided"
    ),
  )

enablePlugins(SbtTwirl)
enablePlugins(JettyPlugin)
