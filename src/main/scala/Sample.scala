object Sample {

  //BUG: protobuf classes are generated at
  //  sourceManaged / main which is `target/scala_2.13/src_managed/main`
  // In the project configuration (cmd + ,) IDEA sees this directory, but is not shown on the project pane on the left.
  // So the code goes red.

  new test.TestObject("test") //SBT compiles, but IDEA shows code as red
}
