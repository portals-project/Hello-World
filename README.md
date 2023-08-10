# Hello World

This is a sample project using the Portals framework. For more information, go to the [Portals Website](https://portals-project.org/), or the [Portals Project](https://github.com/portals-project) on GitHub. You can also check out the [Tutorial](https://portals-project.org/tutorial) which includes this example.

To compile and run the example using SBT, run the following commands:

```bash
sbt compile;
sbt run;
```

> **Note**
> Portals has not yet been published to Maven Central. The Portals Project can be published locally using the `sbt publishLocal` command. To use Portals in your project, import the local snapshot instead: `libraryDependencies += "org.portals-project" %% "portals-core" % "0.1.0-SNAPSHOT"`.
