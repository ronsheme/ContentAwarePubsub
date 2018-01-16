lazy val myTask = taskKey[Unit]("my task")
lazy val root  = (project in file("."))
  .settings(
    name := "A1",
    organization := "shemer.dynamicpubsub",
    scalaVersion := "2.12.3",
    version := "0.1-SNAPSHOT",
    myTask := {println("running my task")}
  )