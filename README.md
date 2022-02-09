# Object-oriented programming (OOP) Design Patterns examples with Java
The patterns of this repository refer to those of the **Gang of Four (GoF)**, who are the 4 authors (**Erich Gamma**, **Richard Helm**, **Ralph Johnson**, and **John Vlissides**) of the software engineering book *Design Patterns: Elements of Reusable Object-Oriented Software* published in 1994.

There is at least 1 example coded in Java for every of their 23 design patterns for Object-oriented programming.

Patterns examples are separated by packages.

The classes of some patterns are divided into more packages to facilitate the comprehension of the role each class play.

There is 1 runnable classes for each pattern: *Main.java*.

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