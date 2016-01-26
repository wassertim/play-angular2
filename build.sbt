name := """play-angular2"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala, SbtWeb)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test,
  "org.webjars.npm" % "es6-shim" % "0.34.1",
  "org.webjars.npm" % "systemjs" % "0.19.6",
  "org.webjars.npm" % "angular2" % "2.0.0-beta.0",
  "org.webjars.npm" % "typescript" % "1.7.5",
  "org.webjars.npm" % "rxjs" % "5.0.0-beta.1",
  "org.webjars.npm" % "bootstrap-sass" % "3.3.6"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
resolvers += "Madoushi sbt-plugins" at "https://dl.bintray.com/madoushi/sbt-plugins/"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

TypescriptKeys.moduleKind in Assets := "system"
TypescriptKeys.sourceMap in Assets := true
TypescriptKeys.experimentalDecorators in Assets := true

JsEngineKeys.engineType := JsEngineKeys.EngineType.Node
