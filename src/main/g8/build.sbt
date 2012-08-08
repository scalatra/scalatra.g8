organization := "$organization$"

name := "$name$"

version := "$version$"

scalaVersion := "$scala_version$"

seq(webSettings :_*)

libraryDependencies ++= Seq(
  "org.scalatra" % "scalatra" % "2.1.0-RC3",
  "org.scalatra" % "scalatra-scalate" % "2.1.0-RC3",
  "org.scalatra" % "scalatra-specs2" % "2.1.0-RC3" % "test",
  "ch.qos.logback" % "logback-classic" % "1.0.6" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.5.v20120716" % "container",
  "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided;container"
)

ivyXML := <dependencies>
      <exclude org="org.eclipse.jetty.orbit" name="javax.servlet" />
    </dependencies>
