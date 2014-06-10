name := "Katas"

version := "1.0"

scalaVersion :="2.10.4"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"

resolvers += "Typesafe repository releases" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "org.reactivemongo" %% "reactivemongo" % "0.10.0"
)

