# Software Design Patterns Project

Implementing software design patterns in Java to address common challenges in software design.

Software design patterns are effective solutions to recurring problems encountered in software development. They are categorized into creational, structural, and behavioral design patterns.

## Project Structure

Patterns are organized into folders corresponding to their types.

### [Creational Design Patterns]
These patterns focus on solving problems related to object instantiation.

#### [1. MyFactory Pattern](FOMUBAD_BORISTA_FONDI_20V2001/factory)
Enhance the object creation process by providing interfaces for creation, enabling implementing classes to determine which class to instantiate. This promotes code reuse and loose coupling between classes.

#### [2. MySingleton Pattern](FOMUBAD_BORISTA_FONDI_20V2001/singleton)
Ensure that a class has a single instance while providing global access to this instance. Prevent unnecessary instantiation by making the constructor private and declare a private static field for the singleton class.

#### [3. MyAbstract Factory Pattern](FOMUBAD_BORISTA_FONDI_20V2001/AbstractFactory)
Similar to the factory pattern, it provides interfaces for creating a family of products instead of a single product.

#### [4. MyBuilder Pattern](FOMUBAD_BORISTA_FONDI_20V2001/builder)
Facilitate the creation of complex objects requiring step-by-step initialization. Extract the object creation method, allowing it to be handled by an external builder. Provide an interface for the builder and implement it with concrete builders to create various types of complex objects.

## Pattern Definitions and Brief explanations

### 1. Factory Pattern
The Factory Pattern enhances the object creation process by defining interfaces for creating objects. It allows implementing classes to decide which class to instantiate, promoting code reuse and loose coupling between classes.

### 2. Singleton Pattern
The Singleton Pattern ensures that a class has a single instance while providing global access to that instance. It prevents unnecessary instantiation by making the constructor private and declaring a private static field for the singleton class.

### 3. Abstract Factory Pattern
The Abstract Factory Pattern extends the Factory Pattern by providing interfaces for creating families of related or dependent objects. It is useful when the system needs to be independent of how its objects are created, composed, and represented.

### 4. Builder Pattern
The Builder Pattern facilitates the creation of complex objects by separating the construction process from the actual representation. It involves extracting the object creation method, allowing it to be handled by an external builder. This pattern is beneficial for objects with numerous parameters or complex initialization steps.

## Running the Code

### Using Visual Studio Code

If you have a Java debugger for Visual Studio Code, you can run any class from the list of available classes.

### Compilation and Execution

Alternatively, you can compile and run the main classes for each pattern using the following commands inside the initial or modified folder in the code directory of each pattern.

You would meet a "run|debug", click on run and the the program would run sucessfully. Remember that this would appear only in the main classes. 

