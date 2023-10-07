val ScalatraVersion = "$scalatra_version$"

ThisBuild / scalaVersion := "$scala_version$"
ThisBuild / organization := "$organization$"

lazy val hello = (project in file("."))
  .settings(
    name := "$name$",
    version := "$version$",
    libraryDependencies ++= Seq(
      "org.scalatra" %% "scalatra-jakarta" % ScalatraVersion,
      "org.scalatra" %% "scalatra-scalatest-jakarta" % ScalatraVersion % "test",
      "ch.qos.logback" % "logback-classic" % "1.4.11" % "runtime",
      "org.eclipse.jetty" % "jetty-webapp" % "$jetty_version$" % "container",
      "jakarta.servlet" % "jakarta.servlet-api" % "5.0.0" % "provided"
    ),
  )

enablePlugins(SbtTwirl)
enablePlugins(JettyPlugin)

containerLibs in Jetty := Seq("org.eclipse.jetty" % "jetty-runner" % "$jetty_version$" intransitive())
