package $package$

import org.scalatra._

class $servlet_name$ extends $name;format="Camel"$Stack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }
  
}
