
name := "scalapact-scalatest"

organization := "com.itv"

version := "0.1.3"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test",
  "org.json4s" %% "json4s-native" % "3.3.0" % "test",
  "com.github.tomakehurst" % "wiremock" % "1.56",
  "org.scalaj" %% "scalaj-http" % "1.1.5",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0",
  "ch.qos.logback" % "logback-classic" % "1.0.3",
  "com.itv" % "scalapact-core_2.11" % "0.1.3"
)

publishTo := {
  val artifactory = "https://itvrepos.artifactoryonline.com/itvrepos/oasvc-ivy"
  if (isSnapshot.value)
    Some("Artifactory Realm" at artifactory)
  else
    Some("Artifactory Realm" at artifactory + ";build.timestamp=" + new java.util.Date().getTime)
}

resolvers += "Artifactory" at "https://itvrepos.artifactoryonline.com/itvrepos/oasvc-ivy/"