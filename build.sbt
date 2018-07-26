//val dep = "package.name" % "name" %"version"

lazy val commonSettings = Seq(
  organization := "shemer.dynamicpubsub",
  scalaVersion := "2.12.3",
  version := "0.1-SNAPSHOT"
)
lazy val root  = (project in file("."))
  .settings(
    name := "A1",
    commonSettings,
//    libraryDependencies+=dep
  )