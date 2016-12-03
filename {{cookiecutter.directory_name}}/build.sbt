organization := "{{cookiecutter.organization}}"

name := "{{cookiecutter.directory_name}}"

version := "0.1-SNAPSHOT"

scalaVersion := "{{cookiecutter.scala_version}}"

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.1.7",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)
