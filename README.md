# OCC Name score calculator

A command line utility that will compute a score for a list of names.

## How to use
* Navigate to the project folder.
* Run the `run.sh` script 
    * It does accept one argument i.e. the file path
    * If no arguments are provided there will be a user prompt requesting one.
* The calculated score would be printed on the console.

### Requirements
* Java 8

### Implementation details
* `Compute.java` is the main class which reads the file path and prints the result
* `Processor.java` is responsible for reading the file and creating Name objects for individual names.
* `DefaultScoreCalculator.java` is where the score calculation is implemented via `IScoreCalculator.java` when another department want to use their own complex name scoring algorithm they have to implement this interface.
* `Name.java` is the model representation of each name from input file.# rahul.nagendra2-gmail.com
