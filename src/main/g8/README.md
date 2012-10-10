# $name$ #

## Build & Run ##

```sh
\$ cd \$name__snake\$
\$ ./sbt
> container:start
> browse
```

If `browse` doesn't launch your browser, manually open [http://localhost:8080/](http://localhost:8080/) in your browser.

## Deploy to Heroku ##

- Sign up for a free account on [Heroku](http://www.heroku.com/).
- Install the [Heroku Toolbelt](https://toolbelt.herokuapp.com/).
- If you haven't initialized the project as a git repo, do so.

```
\$ cd \$name__snake\$
\$ git init
\$ git add .
\$ git commit -m 'first commit'
```

- Log in.

```
\$ heroku login
```

- Now create your Heroku endpoint and deploy to it.

```sh
\$ cd \$name__snake\$
\$ heroku create --stack cedar
\$ git push heroku master
```

- After a couple minutes of streaming output, the last few lines will look like this:

```
-----> Discovering process types
       Procfile declares types -> web
-----> Compiled slug size: 43.4MB
-----> Launching... done, v5
       http://polar-atoll-9149.herokuapp.com deployed to Heroku

To git@heroku.com:polar-atoll-9149.git
* [new branch]      master -> master
```

Open your browser to to the URL provided right before `deployed to Heroku` in the output.
