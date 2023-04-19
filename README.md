# CS-5800: Adapter Pattern Quiz

This repository contains a basic adapter design pattern implementation for a quiz in CS-5800 (Advanced Software Engineering).
Essentially, a series of payment gateway APIs are simulated and the adapter design pattern is utilized to communicate with
these APIs, without needing to modify the core `PaymentProcessor`.
The `driver` package implements a basic program demonstrating the instantiation of the different classes implemented here. 
An example of its output can be found in the `output.png` file.

## Build & Run

To build with Maven, simply navigate to the project root in the command line and run:

```shell
mvn package
```

Alternatively, IDEs such as IntelliJ should be able to build the source files using their standard build utilities.

Once built, the project can be run using the `driver` package:

```shell
java -cp ./target/adapter-pattern-quiz-1.0-SNAPSHOT.jar driver.Main
```