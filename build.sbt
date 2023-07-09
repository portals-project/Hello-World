ThisBuild / scalaVersion := "3.3.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "helloworld",
    libraryDependencies += "org.portals-project" %% "portals-core" % "0.1.0-SNAPSHOT"
  )
