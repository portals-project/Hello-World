package helloworld

import portals.api.dsl.DSL.*
import portals.system.Systems

object HelloWorlds extends App:
  // A Portals Application with the name "HelloWorld"
  val app = PortalsApp("HelloWorld"):

    // A generator for generating a single event: "Hello, World!"
    val generator = Generators.fromList[String](List("Hello, World!"))

    // A workflow that processes the generated event stream
    val workflow = Workflows[String, String]()
      // Set the generated event stream as a source
      .source(generator.stream)
      // Map the events to upper case
      .map(_.toUpperCase)
      // Log the events
      .logger()
      // Put the events in the sink
      .sink()
      // Freeze and build the workflow
      .freeze()

  // Launch and run the application on the Portals test system
  val system = Systems.test()
  system.launch(app)
  system.stepUntilComplete()
  system.shutdown()
