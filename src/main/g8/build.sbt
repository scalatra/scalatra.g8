
enablePlugins(JettyPlugin)

containerLibs in Jetty := Seq("org.eclipse.jetty" % "jetty-runner" % "9.3.13.v20161014" intransitive())

containerMain in Jetty := "org.eclipse.jetty.runner.Runner"

javaOptions in Jetty ++= Seq(
  "-Xdebug",
  "-Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005"
)
