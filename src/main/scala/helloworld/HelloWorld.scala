package helloworld

import portals.api.dsl.DSL.*
import portals.system.Systems

object HelloWorld extends App:
  val app = PortalsApp("HelloWorld"):

    val generator = Generators.fromList[String](List("Hello, World!"))

    val workflow = Workflows[String, String]()
      .source(generator.stream)
      .map(_.toUpperCase)
      .logger()
      .sink()
      .freeze()

  val system = Systems.test()
  system.launch(app)
  system.stepUntilComplete()
  system.shutdown()
