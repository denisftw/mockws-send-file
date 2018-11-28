name := """mockws-send-file"""
version := "1.0-SNAPSHOT"
scalaVersion := "2.12.7"

lazy val root = (project in file(".")).enablePlugins(PlayScala)
pipelineStages := Seq(digest)

libraryDependencies ++= Seq(
  jdbc,
  ehcache,
  ws,
  guice,
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test,
  "org.scalamock" %% "scalamock" % "4.1.0" % Test,
  "de.leanovate.play-mockws" %% "play-mockws" % "2.6.2" % Test
)

resolvers += "sonatype-snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"