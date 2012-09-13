organization := "$organization$"

name := "$name$"

version := "$version$"

scalaVersion := "$scala_version$"

seq(webSettings :_*)

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.0.4",
  "org.scalatra" %% "scalatra-scalate" % "2.0.4",
  "org.scalatra" %% "scalatra-specs2" % "2.0.4" % "test",
  "ch.qos.logback" % "logback-classic" % "1.0.0" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "7.6.7.v20120910" % "container",
  "javax.servlet" % "servlet-api" % "2.5" % "provided;container"
)

resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

ivyXML := <dependencies>
      <exclude org="org.eclipse.jetty.orbit" />
    </dependencies>