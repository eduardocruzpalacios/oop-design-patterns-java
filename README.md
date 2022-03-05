# Object-oriented programming (OOP) Design Patterns examples with Java
The patterns of this repository refer to those of the **Gang of Four (GoF)**, who are the 4 authors (**Erich Gamma**, **Richard Helm**, **Ralph Johnson**, and **John Vlissides**) of the software engineering book *Design Patterns: Elements of Reusable Object-Oriented Software* published in 1994.

There is at least 1 example coded in Java for every of their 23 design patterns for Object-oriented programming.

Patterns examples are separated by packages.

The classes of some patterns are divided into more packages to facilitate the comprehension of the role each class play.

There is 1 runnable classes for each pattern: *Main.java*. Comments in this class are intended to clarify even more the example as well as explaining how to maintain the code.

There is a class called *AnyObject* that is repeated along packages despite DRY (Don't Repeat Yourself) programming principle so as to facilitate the comprehension of a given pattern by the only means of the code belonging to its package.
## Creational patterns
1) **Singleton** (*Early* and *Lazy* variants) restricts object creation for a class to only one instance.
2) **Prototype** creates objects by cloning an existing object.
3) **Builder** constructs complex objects by separating construction and representation.
4) **Factory method** creates objects without specifying the exact class to create.
5) **Abstract factory** groups object factories that have a common theme.
## Structural patterns
6) **Adapter** allows classes with incompatible interfaces to work together by wrapping its own interface around that of an already existing class.
7) **Bridge** decouples an abstraction from its implementation so that the two can vary independently.
8) **Composite** composes zero-or-more similar objects so that they can be manipulated as one object.
9) **Decorator** dynamically adds/overrides behaviour in an existing method of an object.
10) **Facade** provides a simplified interface to a large body of code.
11) **Flyweight** reduces the cost of creating and manipulating a large number of similar objects.
12) **Proxy** provides a placeholder for another object to control access, reduce cost, and reduce complexity.
## Behavioral patterns
13) **Chain of responsibility** delegates commands to a chain of processing objects.
14) **Command** creates objects that encapsulate actions and parameters.
15) **Interpreter** implements a specialized language.
16) **Iterator** accesses the elements of an object sequentially without exposing its underlying representation.
17) **Mediator** allows loose coupling between classes by being the only class that has detailed knowledge of their methods.
18) **Memento** provides the ability to restore an object to its previous state (undo).
19) **Observer** is a publish/subscribe pattern, which allows a number of observer objects to see an event.
20) **State** allows an object to alter its behavior when its internal state changes.
21) **Strategy** allows one of a family of algorithms to be selected on-the-fly at runtime.
22) **Template** method defines the skeleton of an algorithm as an abstract class, allowing its subclasses to provide concrete behavior.
23) **Visitor** separates an algorithm from an object structure by moving the hierarchy of methods into one object.

## Examples by pattern
|Pattern|Example|
|----------------|-------------------------------|
|Singleton (*Early* and *Lazy* variants)|AnyObject class which could be any object.|
|Prototype|AnyObject class which could be any object.|
|Builder|First, there are a hierarchy of model classes under abstract Product class and the Order class having a dynamic data structure for Product instances. Second, the builder steps are defined in ProductBuilder interface which is implemented by builder classes. Third, Cashier class acts as the director that uses the builders to manage an Order class.|
|Factory method|Car factory that creates children classes of Car class (SuvCar or TourismCar) depending on 1 parameter|
|Abstract factory|FactoryCreator that creates children classes of AbstractFactory class (LivingRoomFurnitureFactory or OfficeFurnitureFactory) depending on 1 parameter. Both factories create related classes implementing Table and Chair interfaces, so that LivingRoomFurnitureFactory only creates LivingRoomTable and LivingRoomChair while OfficeFurnitureFactory only creates OfficeTable and OfficeChair.|
|Chain of Responsibility|Grant abstract class represents the Handler. Their children are the concrete handlers in charge of processing a given int (the level of grant) to print the allowed actions for the corresponding role. ChainOfResponsibility class holds the static method that build the chain and return the first handler that have to handle the request.|
|Visitor|A supermarket cashier is the visitor. Products of the same supermarket are the visitable objects. The visitor implements a different algorithm for calculating the price of each product. The client uses the cashier to loop for a group of products, visit them, and return the total cost.|
|Iterator|The collection is a Single Linked List, which implements Iterable interface to get an Iterator for the own instance. The Iterator interface has hasNext and next methods. In the Main class the functionality of both the Single Linked List and Iterator behavioral pattern is tested.|
|Strategy|Having Coordinate as a model class, GoStrategy interface has a method that receives 2 Coordinate objects and return the minutes taken to go from one to the another. Concrete strategies implement GoStrategy interface in a sense that each one have a different algorithm for that calculation. The Context-intended class is GPS, which has a GoStrategy as property depending on a different strategy to get that calculation.|
|State|The context is Car class and the concrete states, which are those implementing State interface, are On and Off. There is a state controller that have a property and a method for every single concrete state. The properties are the concrete states and the methods receive the context and change its state to a concrete one.|
|Template Method|The algorithm template with the steps defined is in BoardGamePlayAlgorithm. This template uses some methods of the super class and others override by classes extending it. The client can refer to the super class and initialize the child class due to polymorphism. The client only needs to call the public meetUp method from the instance, which executes the algorithm steps defined in the super class and those steps of the child class initialized.|
|Command|Command is an abstract class whose children must provide a body for the execute method. Concrete command is the copy action gui by getting the selected text and setting the clipboard with its value. Senders are Button and ShortCut classes. Gui has different senders calling the same concrete command.|
|Interpreter|DateContext contains references to a String value for an expression and other three int values for a date: day, month and year. The abstract expression, namely the abstract class DateExpression, has an abstract void method the uses a DateContext object. Concrete expressions (DayExpression, MonthExpression & YearExpression classes) inherit the DateExpression class and implement its abstract method. The DateParser is not part of the interpreter pattern, it is included to reduce the amount of code of the Main.java class, as the concrete expression can be used without it.|
|Memento|Memento interface ensures all its implementations have a getter to get the state (represented as a generic). Originator interface ensures all its implementations have methods to save the current state by returning it and to restore its own state by using a given Memento. The History class is the caretaker and hold a list for mementos as well as methods to add a new one and retrieve them.|
|Observer|Observable abstract class is prepared to bestow all the logic needed for creating concrete observables by inheriting it: subscribe, unsubscribe, change state and notify to observers. Observer interface make its implementations to provide a logic for update method.|
|Mediator|Mediator interface has methods to link and unlink a Participant instance, to notify all its Participant instance, and to notify a single one. The concrete mediator is ChatRoom class that implement the former interface and storage all the references to its Participant instances in a HashMap. Participant interface has methods to get the own id, to operate to one or all other participants in the same mediator, and to disconnect from its mediator. Message is the model for what is sent and has a reference for the message itself, the sender and the date it was sent.|