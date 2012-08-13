# Scalatra project

[g8](http://github.com/n8han/giter8) template to get a Scalatra web service up and running quickly. The template generates a project that uses SBT 0.12.x. The project will build under SBT 0.10.x with minor changes. The project will not build under 0.7.x versions of SBT.

## Usage

Install giter8 (g8) - [readme](http://github.com/n8han/giter8#readme) for more information.

Install SBT 0.12.x - [Setup](https://github.com/harrah/xsbt/wiki/Getting-Started-Setup) for more information.

In a shell, run the following:

```
g8 scalatra/scalatra-sbt
cd <name-of-app>
sbt
> container:start
```
    
You should be able to browse to a [test resource](http://localhost:8080/)

