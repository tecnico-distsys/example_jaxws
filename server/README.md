# JAX-WS example server

This is a simple Java Web Service

The service is defined by the Java code with annotations
(code-first approach, also called bottom-up approach).

The service runs in a standalone HTTP server.

## Instructions for using Maven

To compile and run the server:

```
mvn compile exec:java
```

When running, the web service awaits connections from clients.
You can check if the service is running using your web browser to see the generated WSDL file:

    http://localhost:8080/hello-ws/endpoint?WSDL

This address is defined in `HelloMain` when the `publish()` method is called.

To call the service you will need a web service client, including code generated from the WSDL.

## To configure the Maven project in Eclipse

'File', 'Import...', 'Maven'-'Existing Maven Projects'

'Select root directory' and 'Browse' to the project base folder.

Check that the desired POM is selected and 'Finish'.

----

[SD Faculty](mailto:leic-sod@disciplinas.tecnico.ulisboa.pt)
