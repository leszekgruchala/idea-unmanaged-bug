import sbtprotoc.ProtocPlugin.autoImport.PB

name := "idea-unmanaged-bug"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies += "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion % "protobuf"
Compile / unmanagedSourceDirectories += sourceManaged.value / "main"
Compile / PB.targets := Seq(
  scalapb
    .gen(grpc = false, singleLineToProtoString = true, lenses = false) -> (sourceManaged in Compile).value
)
