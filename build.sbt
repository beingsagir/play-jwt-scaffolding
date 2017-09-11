name := """play-framework-jwt-scaffolding"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.2"

libraryDependencies += guice

// https://mvnrepository.com/artifact/com.auth0/java-jwt
libraryDependencies += "com.auth0" % "java-jwt" % "3.2.0"
