# $name$ #

## Build & Run ##

```sh
\$ cd $name;format="snake"$
\$ ./sbt
> jetty:start
> browse
```

If `browse` doesn't launch your browser, manually open [http://localhost:8080/](http://localhost:8080/) in your browser.

Note: for sandbox run, the jetty debug was always turn on at port 5005. After start jetty:start, you should be able to attach java remote debugger to port 5005.
For the setting, please see build.sbt file. For more setting, you can refer to [xsbt-web-plugin](https://github.com/earldouglas/xsbt-web-plugin/blob/master/docs/2.0.md).

