sample-jvm-agent
================

Hi,

this is where all code to related to my blog post on "Developing a JVM Agent for bytecode instrumentation with JavassistPart 1" will be hosted.


The full source code listed in the post is available agent-pt1-source-code

The compiled JAR for the agent is available at jars/sample-agent-pt1.jar

The dummy app (that just opens a connection to google.com) to test out the agent is also available at jars/dummy-jar.jar

To run it with the agent, simply do: java -javaagent:sample-agent-pt1.jar -jar dummy-app.jar

For full instructions on how to create a bytecode instrumentation agent refer to the original blog post (part one here, and part two yet to be published)

rafael oltra
