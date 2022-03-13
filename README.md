# Object-Oriented Programming (OOP) Design Patterns examples with Java
## Scope
The design patterns of this repository refer to those of the **Gang of Four (GoF)**, who are the 4 authors (**Erich Gamma**, **Richard Helm**, **Ralph Johnson**, and **John Vlissides**) of the software engineering book *Design Patterns: Elements of Reusable Object-Oriented Software* first published in 1994.

There is 1 example coded in Java for every single of their 23 design patterns for Object-oriented programming.
## Repository Organization
Patterns examples are separated by packages.

The classes of some patterns are divided into packages named according to a terminology that facilitates the comprehension of the role each class plays in the corresponding pattern.

There is 1 runnable classes for each pattern: *Main.java*. Comments in this class are intended to clarify even more the example as well as explaining how to maintain the code.

There is a class called *AnyObject* that is repeated along packages despite DRY (Don't Repeat Yourself) programming principle so as to facilitate the comprehension of a given pattern by the only means of the code belonging to its package.
## Design Patterns
### Creational patterns
#### Singleton
DEFINITION: restricts object creation for a class to only one instance.

There are *Early* and *Lazy* variants.

AnyObject class could be any object.
#### Prototype
DEFINITION: creates objects by cloning an existing object.

Prototype interface has a method that makes its implementations to return a Prototype instance.

AnyObject class could be any object and implements the Prototype interface. It has a constructor that uses another instance of the same class and uses its properties values to create a new object with this data. The method implemented return the former constructor passing it the own instance.
#### Builder
DEFINITION: constructs complex objects by separating construction and representation.

There is a hierarchy of model classes under abstract Product class.

The Order class has a dynamic data structure for Product instances.

The builder steps are defined in ProductBuilder interface which is implemented by builder classes.

Cashier class acts as the director by using the builders to manage an Order class.
#### Factory method
DEFINITION: creates objects without specifying the exact class to create.

Car factory creates children classes of Car class (SuvCar or TourismCar). The specific child returned depends on 1 parameter this factory receives.
#### Abstract factory
DEFINITION: groups object factories that have a common theme.

FactoryCreator has a static method to create children classes of AbstractFactory class (LivingRoomFurnitureFactory or OfficeFurnitureFactory). The concrete factory returned depends on 1 parameter the FactoryCreator static method receives.

Both factories create related classes implementing Table and Chair interfaces, so that:
- LivingRoomFurnitureFactory creates LivingRoomTable and LivingRoomChair.
- OfficeFurnitureFactory creates OfficeTable and OfficeChair.
### Structural patterns
#### Adapter
DEFINITION: allows classes with incompatible interfaces to work together by wrapping its own interface around that of an already existing class.

Adaptee is Product class, which has ean, name and price as properties.

Target interface is Stock, which forces to implement getStockedLocalDateTime method returning a LocalDateTime.

Adapter is StockProduct which extends Product class and implements Stock interface.
#### Bridge
DEFINITION: decouples an abstraction from its implementation so that the two can vary independently.

The implementation-intended class is Device.java.

The concrete implementations are Door and Fridge classes.

The abstraction is DomoticHouseControl class.

The refined abstraction is SecurityFeature class, whose methods have a high control logic of the implementations it can deal with.
#### Composite
DEFINITION: composes zero-or-more similar objects so that they can be manipulated as one object.

The component-intended interface is Shape.java which holds the method draw.

The leafs implementing it are Circle and Square classes.

The composite is CompositeShape class, which has a data structure to store leafs and implements the Shape interface by looping all its leafs stored and calling the draw method implementation from each one.
#### Decorator
DEFINITION: dynamically adds/overrides behavior in an existing method of an object.

The component-intended interface is Cleaning.java.

Concrete components classes implementing it are BikeCleaning and CarCleaning.

The decorator is the abstract CleaningDecorator class which has a reference to a component-intended instance and implements the Cleaning interface by calling the implemented method of its component-typed property.

Concrete decorators extend the decorator and override the implemented method of it superclass and modify what it does.
#### Facade
DEFINITION: provides a simplified interface to a large body of code.

The subsystem consists of ArrayEncrypt interface and its implementations: ArithmeticEncrypt and ExponentialEncrypt classes.

The Facade-intended class is ArrayEncryptFacade.java. It receives a data structure and a String. Depending on the value of this String, a concrete implementation of the subsystem is called and uses the data structure.
#### Flyweight
DEFINITION: reduces the cost of creating and manipulating a large number of similar objects.

Flyweight is ObjectType.

Flyweight factory is ObjectFactory, and returns a ObjectType from a HashMap of them that acts as an object pool.

There is a DAO-intended class named ObjectTypeDao.

ObjectStatus class is a data model.

Context is Object and has references to a ObjectStatus and a Flyweight objects.

Client is ConcreteRenderedMap. It has a HashMap to store context instances. Its key is a static int that increments after a new context instances is put.
#### Proxy
DEFINITION: provides a placeholder for another object to control access, reduce cost, and reduce complexity.

HttpRequest and Webpage classes are model-intended classes.

The service for which a proxy is created is HttpServiceImpl class, from which HttpService interface has been extracted. The service uses a HttpRequest object and returns a Webpage instance.

CachedHttpServiceImpl is the proxy-intended class for HttpServiceImpl. It has a HashMap to store Webpage instances already returned using the url property of the HttpRequest object as key. First, the method implemented searches in this data structure.
- In case no Webpage object had been cached for a given url before, the service that execute the expensive query is called and afterwards the returned Webpage instance is stored in the cache and returned by the proxy.
- In case a Webpage object had been cached for a given url before, the service returns it.
### Behavioral patterns
#### Chain of responsibility
DEFINITION: delegates commands to a chain of processing objects.

Grant abstract class represents the Handler.

Their children (Grant1, Grant2 and Grant3) are the concrete handlers in charge of processing a given int (the level of grant) to print the allowed actions for the corresponding role.

ChainOfResponsibility class acts as client and holds the static method that builds the chain and returns the first handler that have to handle the request.
#### Command
DEFINITION: creates objects that encapsulate actions and parameters.

Command is an abstract class whose children must provide a body for the execute method. It has a reference to the receiver.

Concrete command is CopyCommand. It implements its abstract superclass method by specifying what happens in the receiver.

Senders are Button and ShortCut classes. They have a reference to a command instance.

Client is Gui and has:
- Concrete commands using the own client instance.
- Different senders using the same concrete command.
- Methods that calls senders' methods that, in turn, call concrete commands' methods that actually execute the actions.
#### Interpreter
DEFINITION: implements a specialized language.

DateContext contains references to a String value for an expression and other three int values for a date: day, month and year.

Abstract expression is DateExpression and has an abstract void method the uses a DateContext object.

Concrete expressions (DayExpression, MonthExpression & YearExpression classes) inherit DateExpression abstract class and implement its abstract method.

DateParser is not part of the interpreter pattern. It acts as client that uses the Interpreter pattern.
#### Iterator
DEFINITION: accesses the elements of an object sequentially without exposing its underlying representation.

There are 2 interfaces:
- Iterator with hasNext and next methods.
- Iterable with getIterator method that returns an instance of the previous interface.

The implementation of Iterable interface is SingleLinkedList:
- It is a data structure coded for this pattern.
- Uses Node class which acts as model.
- Acts as collection.
- Its implemented method returns an instance of the corresponding implementation of the other interface (SingleLinkedListIterator implementing Iterator). It receives the own instance of SingleLinkedList.

The implementation of Iterator interface is SingleLinkedListIterator:
- has a reference to the corresponding implementation of the other interface (SingleLinkedList implementing Iterable), which is needed to implement the methods of its interface.

In the Main class the functionality of both the Single Linked List and Iterator behavioral pattern is tested.
#### Mediator
DEFINITION: allows loose coupling between classes by being the only class that has detailed knowledge of their methods.

Mediator interface has methods to link and unlink a Participant instance, to notify all its Participant instance, and to notify a single one.

The concrete mediator is ChatRoom class,implements the former interface and storage all the references to its Participant instances in a HashMap.

Participant interface has methods to get the own id, to operate to one or all other participants in the same mediator, and to disconnect from its mediator.

Message is the model for what is sent and has a reference for the message value, the sender and the date and time it was sent.
#### Memento
DEFINITION: provides the ability to restore an object to its previous state (undo).

Memento interface ensures all its implementations have a getter to get the state (represented as a generic). Its implementation is Snapshot class.

Originator interface ensures all its implementations have methods to save the current state by returning it and to restore its own state by using a given Memento. Its implementation is Editor class.

The History class is the caretaker and hold a list for mementos as well as methods to add a new one and retrieve them.
#### Observer
DEFINITION: is a publish/subscribe pattern, which allows a number of observer objects to see an event.

Observable abstract class is prepared to bestow all the logic needed for creating concrete observables by inheriting it: subscribe, unsubscribe, change state and notify to observers.

Observer interface make its implementations to provide a logic for update method.
#### State
DEFINITION: allows an object to alter its behavior when its internal state changes.

State interface has init and stop methods.

Concrete states are On and Off and implement methods of their interface.

The context is Car class, has a reference to a State instance, a setter to change it, and methods to call the methods of the State instance.
 
There is a state controller that has property and a method for every single concrete state. The properties are the concrete states and the methods receive the context and change its state to a concrete one.
#### Strategy
DEFINITION: allows one of a family of algorithms to be selected on-the-fly at runtime.

Coordinate is a model class.

GoStrategy interface has a method that receives 2 Coordinate objects and return the minutes taken to go from one to the another.

Concrete strategies implement GoStrategy interface in a sense that each one has a different algorithm for that calculation.

The Context-intended class is GPS and has:
- a reference to a GoStrategy instance.
- getTime method that uses 2 Coordinate instances, call the implemented method of its GoStrategy instance passing it those 2 2 Coordinate instances.
#### Template
DEFINITION: method defines the skeleton of an algorithm as an abstract class, allowing its subclasses to provide concrete behavior.

The algorithm template with the steps defined is in meetUp method of the BoardGamePlayAlgorithm abstract class:
- Uses methods already implemented in this abstract class.
- Uses methods implemented in the templated classes (ArcadiaGamePlayAlgorithm and ParchisGamePlayAlgorithm).

The client can refer to the super class and initialize any child class thanks to polymorphism. The client only needs to call the public meetUp method from the instance, which executes the algorithm steps defined in the super class and those steps of the child class initialized.
#### Visitor
DEFINITION: separates an algorithm from an object structure by moving the hierarchy of methods into one object.

There are 2 interfaces in this pattern:
- Cashier that acts as Visitor and must has a method for every single implementation of the other interface. Each method uses each implementation.
- Product that acts as Visitable and has a method that uses the other interface.

Visitable implementations act as model/representation classes. Its implemented method must call the visitor implementation method and pass the self instance as parameter.

Visitor implementation defines an algorithm for every single representation.

Client uses a data structure of concrete visitables, loop them and uses a concrete visitor to execute the corresponding algorithm to every single representation.