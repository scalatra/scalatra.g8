package $package$

import org.scalatra._
import org.scalatra.metrics.MetricsSupport

class $servlet_name$ extends $name;format="Camel"$Stack with MetricsSupport{

  get("/") {
    metrics.timer("HomePage").time {
      <html>
        <body>
          <h1>
            Hello, world!
          </h1>
          Say <a href="hello-scalate"> hello to Scalate </a>.
        </body>
      </html>
    }
  }
  
}
