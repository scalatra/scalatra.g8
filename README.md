# Scalatra sbt project #

![Scala CI](https://github.com/scalatra/scalatra.g8/workflows/Scala%20CI/badge.svg)


[g8](https://github.com/foundweekends/giter8) template to get a Scalatra web service up and running quickly.

## Use this template ##

- [Install sbt](http://www.scala-sbt.org/1.x/docs/Setup.html), version 1.x or higher
- run:

```sh
$ sbt new scalatra/scalatra.g8
$ cd <name-of-app>
$ sbt
> warStart
```

- Open [http://localhost:8080/](http://localhost:8080/) in your browser.

## Modify this template ##

- Fork [scalatra/scalatra.g8](https://github.com/scalatra/scalatra.g8) on GitHub to your account.
Let's assume your account is "foo".
- Clone it.

```sh
$ git clone git@github.com:foo/scalatra.g8.git
```

- Now make your desired changes.
- Do a local deploy of your modified template and try it out.

```sh
$ sbt
> g8Test # must result in SUCCESS
> exit
$ cd target/sbt-test/scalatra-g8/scripted
$ sbt
> Jetty/start
> browse # starts browser for you, or manually open http://localhost:8080 to verify
```

- If you like your new template, push it to GitHub.

```sh
$ cd /path/to/scalatra.g8.git
$ git push
```

- You can now access your modified template using g8.

```sh
$ cd
$ sbt new foo/scalatra.g8
```

- If you'd like to share your changes, send a pull request.
