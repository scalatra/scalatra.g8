organization := "$organization$"

name := "$name$"

version := "$version$"

scalaVersion := "$scala_version$"

seq(webSettings :_*)

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.1.0-SNAPSHOT",
  "org.scalatra" %% "scalatra-scalate" % "2.1.0-SNAPSHOT",
  "org.scalatra" %% "scalatra-specs2" % "2.1.0-SNAPSHOT" % "test",
  "ch.qos.logback" % "logback-classic" % "1.0.0" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.0.v20120127" % "container",
  "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided"
)

resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
