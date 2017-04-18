# Scalatra sbt project #

[![Build Status](https://secure.travis-ci.org/scalatra/scalatra-sbt.g8.png)](http://travis-ci.org/scalatra/scalatra-sbt.g8)


Use [g8](http://github.com/n8han/giter8) template to get a Scalatra web service up and running quickly.

## About this template ##

This template is forked from :  [scalatra/scalatra.g8](https://github.com/scalatra/scalatra-sbt.g8). If you would like to refer to original project, please check that link as well.

## What was changed ##

1. After forked, I added sub projects (domainTier, dataTier, common) three layers.

The purpose of layering is to separate the presentation layer out of the project.
We should have better domain/data layer to avoid cross reference in project as well.

2. Use jetty for sandbox testing. In Jetty, configure it to run in debug mode, listen on port 5005.

## Use this template ##

[g8](httphttps://github.com/foundweekends/giter8) template to get a Scalatra web service up and running quickly.

## Use this template ##

- [Install giter8 (g8)](https://github.com/foundweekends/giter8) (NOTICE: 0.6.8 or higher required)

- Get the g8 template and run it:

```sh
$ g8 scalatra/scalatra-sbt
$ cd <name-of-app>
$ ./sbt
> jetty:start
```

- Open [http://localhost:8080/](http://localhost:8080/) in your browser.

## Modify this template ##

- [Install sbt](http://www.scala-sbt.org/), version 0.13.0 or higher.
- Fork [RHome/scalatra-sbt.g8](https://github.com/RHome/scalatra-sbt.g8) on GitHub to your account.
Let's assume your account is "foo".
- Clone it.

```sh
$ git clone git@github.com:foo/scalatra-sbt.g8.git
```

- Now make your desired changes.
- Do a local deploy of your modified template and try it out.

```sh
$ sbt
> g8Test # must result in SUCCESS
> exit
$ cd target/sbt-test/rhome-g8/scripted
$ sbt
$ jetty:start
$ browse # starts browser for you, or manually open http://localhost:8080 to verify
```

- If you like your new template, push it to GitHub.

```sh
$ cd /path/to/scalatra-sbt.g8.git
$ git push
```

- You can now access your modified template using g8.

```sh
$ cd
$ g8 foo/scalatra-sbt.g8
```

- If you'd like to share your changes, send a pull request.
