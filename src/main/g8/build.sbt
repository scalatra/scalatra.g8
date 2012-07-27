organization := "$organization$"

name := "$name$"

version := "$version$"

scalaVersion := "$scala_version$"

seq(webSettings :_*)

libraryDependencies ++= Seq(
  "org.scalatra" % "scalatra" % "2.1.0-RC1",
  "org.scalatra" % "scalatra-scalate" % "2.1.0-RC1",
  "org.scalatra" % "scalatra-specs2" % "2.1.0-RC1" % "test",
  "ch.qos.logback" % "logback-classic" % "1.0.6" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.3.v20120416" % "container",
  "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided;container"
)

resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

ivyXML := <dependencies>
      <exclude org="org.eclipse.jetty.orbit" />
    </dependencies>
