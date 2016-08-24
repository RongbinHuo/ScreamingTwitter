name := "ScreamingTwitter"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.0.0",
  "org.apache.spark" % "spark-streaming_2.11" % "2.0.0",
  "org.apache.spark" % "spark-streaming-twitter_2.11" % "1.6.2",
  "com.typesafe" % "config" % "1.2.1",
  "org.elasticsearch" % "elasticsearch-spark_2.10" % "2.3.4",
  "org.json4s" %% "json4s-native" % "3.2.11",
  "joda-time" % "joda-time" % "2.7",
  "org.joda" % "joda-convert" % "1.2"
)

resolvers ++= Seq(
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Akka Repository" at "http://repo.akka.io/releases/"
)

mainClass in (Compile, run) := Some("com.spark.streaming.TwitterTransmitter")
