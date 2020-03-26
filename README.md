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
* `Name.java` is the model representation of each name from input file.

### Assumptions & Limitations
* Assuming that all names are in English alphabets 
* Weighing both uppercase and lowercase characters equally, Example: `b` and `B` both have same value as `2`.
* Any special characters in names file are ignored (except for `,`).  
* Return for the application is of type `java.lang.Integer` which has its upperbounds of calculating score.
* Application can be scaled but the current implementation may be limited to files which are few mega bites or files that can be handled by the machine running the program


<pre>
 _____________________
|  _________________  |
| | RAHUL       60. | |
| |_________________| |
|  ___ ___ ___   ___  |
| | 7 | 8 | 9 | | + | |
| |___|___|___| |___| |
| | 4 | 5 | 6 | | - | |   A calculator :-D 
| |___|___|___| |___| |
| | 1 | 2 | 3 | | x | |
| |___|___|___| |___| |
| | . | 0 | = | | / | |
| |___|___|___| |___| |
|_____________________|
</pre>

