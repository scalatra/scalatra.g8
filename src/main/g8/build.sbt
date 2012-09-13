organization := "$organization$"

name := "$name$"

version := "$version$"

scalaVersion := "$scala_version$"

seq(webSettings :_*)

classpathTypes ~= (_ + "orbit")

libraryDependencies ++= Seq(
  "org.scalatra" % "scalatra" % "2.1.0",
  "org.scalatra" % "scalatra-scalate" % "2.1.0",
  "org.scalatra" % "scalatra-specs2" % "2.1.0" % "test",
  "ch.qos.logback" % "logback-classic" % "1.0.6" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.7.v20120910" % "container",
  "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "container;provided;test" artifacts (Artifact("javax.servlet", "jar", "jar"))
)
