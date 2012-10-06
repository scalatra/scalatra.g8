# Scalatra sbt project #

[g8](http://github.com/n8han/giter8) template to get a Scalatra web service up and running quickly.

## Use this template ##

- [Install giter8 (g8)](https://raw.github.com/ymasory/scalatra-sbt.g8/master/src/main/g8/sbt)
- Get the g8 template and run it:

```sh
$ g8 scalatra/scalatra-sbt
$ cd <name-of-app>
$ ./sbt
> container:start
```

- Open the [default website](http://localhost:8080/) in your browser.

## Modify this template ##

- Fork [scalatra/scalatra-sbt.g8](https://github.com/scalatra/scalatra-sbt.g8) on GitHub to your account.
Let's assume your account is "foo".
- Clone it.

```sh
$ git clone git@github.com:foo/scalatra-sbt.g8.git
```

- Now make your desired changes.
- Do a local deploy of your modified template and try it out.

```sh
$ ./sbt
> ????
> exit
$ ???
```

- If you like your new template, push it to GitHub.

```sh
$ cd /path/to/scalatra-sbt.git.git
$ git push
```

- You can now access your modified template using g8.

```sh
$ cd
$ g8 foo/scalatra-sbt.g8
```

- If you'd like to share your changes, send a pull request.
