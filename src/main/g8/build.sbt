organization := "$organization$"

name := "$name$"

version := "$version$"

scalaVersion := "$scala_version$"

seq(webSettings :_*)

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.0.1",
  "org.scalatra" %% "scalatra-scalate" % "2.0.1",
  "org.eclipse.jetty" % "jetty-webapp" % "7.4.5.v20110725" % "container",
  "javax.servlet" % "servlet-api" % "2.5" % "provided"
)

resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
