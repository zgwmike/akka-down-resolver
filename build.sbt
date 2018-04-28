import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "org.guangwenz",
      scalaVersion := "2.12.4",
      version      := "1.0.0"
    )),
    name := "akka-down-resolver",
    libraryDependencies += akkaCluster,
    libraryDependencies ++= akkaClusterTest,
    libraryDependencies += scalaTest % Test
  )
  .enablePlugins(MultiJvmPlugin)
  .configs(MultiJvm)

jvmOptions in MultiJvm := Seq("-Xmx256M")