name := "scala-playground"

scalaVersion :="2.10.3"

version := "1.0"

resolvers += "spray repo" at "http://repo.spray.io"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "cascalding" at "http://repo.springsource.org/libs-release-remote"

libraryDependencies += "io.spray" % "spray-routing" % "1.3.1"

libraryDependencies += "io.spray" % "spray-can" % "1.3.1"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.0"

libraryDependencies += "org.specs2" %% "specs2" % "2.3.11" % "test"

libraryDependencies += "com.twitter" % "scalding-core_2.10" % "0.9.1"

libraryDependencies += "org.apache.hadoop" % "hadoop-core" % "0.20.2"