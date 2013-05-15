sample-jvm-agent
================

Hi,

this is where all code to related to my blog post on "Developing a JVM Agent for bytecode instrumentation with JavassistPart 1" will be hosted.


The full source code listed in the post is available [here](agent-pt1/src).

The compiled JAR for the agent is available [here](jars/sample-agent-pt1.jar).

The dummy app (that just opens a connection to google.com) to test out the agent is also available [here](jars/dummy-app.jar).

To run it with the agent, simply: 
```
java -javaagent:sample-agent-pt1.jar -jar dummy-app.jar
```

For full instructions on how to create a bytecode instrumentation agent refer to the original blog post - part one [here](http://www.rafaeloltra.com), and part two yet to be published)

rafael oltra
(http://www.rafaeloltra.com)
(http://www.linkedin.com/in/rafaeloltra)
