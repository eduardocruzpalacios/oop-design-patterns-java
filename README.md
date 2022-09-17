# Object-Oriented Programming (OOP) Design Patterns examples with Java
## Scope
The design patterns of this repository refer to those of the **Gang of Four (GoF)**, who are the 4 authors (**Erich Gamma**, **Richard Helm**, **Ralph Johnson**, and **John Vlissides**) of the software engineering book *Design Patterns: Elements of Reusable Object-Oriented Software* first published in 1994.

There is 1 example coded in Java for every single of their 23 design patterns for Object-oriented programming.
## Repository Organization
Patterns examples are separated by packages.

Classes are divided into packages named accordingly to the GoF's book terminology to facilitate the comprehension of the role each class plays in the corresponding pattern.

There is 1 runnable classes for each pattern: *Main.java*. Comments in it are intended to clarify even more the example as well as explaining how to maintain the code.

There is a class called *AnyObject* that is repeated along packages despite DRY (Don't Repeat Yourself) programming principle so as to facilitate the comprehension of a given pattern by the only means of the code belonging to its package. When this class appears, it means it could be substituted by any other class. 
## Design Patterns
### Creational patterns
#### Singleton
DEFINITION: Ensure a class only has one instance, and provide a global point of access to it.

Variants: *Early instantiation* and *Lazy instantiation*.
#### Prototype
DEFINITION: Specify the kinds of objects to create using a prototypical instance, and create new objects by coping this prototype.

Participants:
- Prototype: MusicalNotePrototype extends Graphic::getRepresentation
- ConcretePrototype: HalfNotePrototypeDeepCopy, HalfNotePrototypeShadowCopy
- Client: GraphicTool (Graphic)
- Model: Representation

Variants: *Deep copy* and *Shadow copy* clone techniques.
#### Builder
DEFINITION: Separate the construction of a complex object from its representation so that the same construction process can create different representations.

There is a hierarchy of model classes under abstract Product class.

The Order class has a dynamic data structure for Product instances.

The builder steps are defined in ProductBuilder interface which is implemented by builder classes.

Cashier class acts as the director by using the builders to manage an Order class.
#### Factory method
DEFINITION: Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory method lets a class defer instantiation to subclasses.

Car factory creates children classes of Car class (SuvCar or TourismCar). The specific child returned depends on 1 parameter this factory receives.
#### Abstract factory
DEFINITION: Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

FactoryCreator has a static method to create children classes of AbstractFactory class (LivingRoomFurnitureFactory or OfficeFurnitureFactory). The concrete factory returned depends on 1 parameter the FactoryCreator static method receives.

Both factories create related classes implementing Table and Chair interfaces, so that:
- LivingRoomFurnitureFactory creates LivingRoomTable and LivingRoomChair.
- OfficeFurnitureFactory creates OfficeTable and OfficeChair.
### Structural patterns
#### Adapter
DEFINITION: Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interface.

Adaptee is Product class, which has ean, name and price as properties.

Target interface is Stock, which forces to implement getStockedLocalDateTime method returning a LocalDateTime.

Adapter is StockProduct which extends Product class and implements Stock interface.
#### Bridge
DEFINITION: Decouples an abstraction from its implementation so that the two can vary independently.

The implementation-intended class is Device.java.

The concrete implementations are Door and Fridge classes.

The abstraction is DomoticHouseControl class.

The refined abstraction is SecurityFeature class, whose methods have a high control logic of the implementations it can deal with.
#### Composite
DEFINITION: Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

The component-intended interface is Shape.java which holds the method draw.

The leafs implementing it are Circle and Square classes.

The composite is CompositeShape class, which has a data structure to store leafs and implements the Shape interface by looping all its leafs stored and calling the draw method implementation from each one.
#### Decorator
DEFINITION: Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

The component-intended interface is Cleaning.java.

Concrete components classes implementing it are BikeCleaning and CarCleaning.

The decorator is the abstract CleaningDecorator class which has a reference to a component-intended instance and implements the Cleaning interface by calling the implemented method of its component-typed property.

Concrete decorators extend the decorator and override the implemented method of it superclass and modify what it does.
#### Facade
DEFINITION: Provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

The subsystem consists of ArrayEncrypt interface and its implementations: ArithmeticEncrypt and ExponentialEncrypt classes.

The Facade-intended class is ArrayEncryptFacade.java. It receives a data structure and a String. Depending on the value of this String, a concrete implementation of the subsystem is called and uses the data structure.
#### Flyweight
DEFINITION: Use sharing to support large numbers of fine-grained objects efficiently.

Flyweight is ObjectType.

Flyweight factory is ObjectFactory, and returns a ObjectType from a HashMap of them that acts as an object pool.

There is a DAO-intended class named ObjectTypeDao.

ObjectStatus class is a data model.

Context is Object and has references to a ObjectStatus and a Flyweight objects.

Client is ConcreteRenderedMap. It has a HashMap to store context instances. Its key is a static int that increments after a new context instances is put.
#### Proxy
DEFINITION: Provides a surrogate or placeholder for another object to control access to it.

HttpRequest and Webpage classes are model-intended classes.

The service for which a proxy is created is HttpServiceImpl class, from which HttpService interface has been extracted. The service uses a HttpRequest object and returns a Webpage instance.

CachedHttpServiceImpl is the proxy-intended class for HttpServiceImpl. It has a HashMap to store Webpage instances already returned using the url property of the HttpRequest object as key. First, the method implemented searches in this data structure.
- In case no Webpage object had been cached for a given url before, the service that execute the expensive query is called and afterwards the returned Webpage instance is stored in the cache and returned by the proxy.
- In case a Webpage object had been cached for a given url before, the service returns it.
### Behavioral patterns
#### Chain of responsibility
DEFINITION: Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.

Grant abstract class represents the Handler.

Their children (Grant1, Grant2 and Grant3) are the concrete handlers in charge of processing a given int (the level of grant) to print the allowed actions for the corresponding role.

ChainOfResponsibility class acts as client and holds the static method that builds the chain and returns the first handler that have to handle the request.
#### Command
DEFINITION: Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

Command is an abstract class whose children must provide a body for the execute method. It has a reference to the receiver.

Concrete command is CopyCommand. It implements its abstract superclass method by specifying what happens in the receiver.

Senders are Button and ShortCut classes. They have a reference to a command instance.

Client is Gui and has:
- Concrete commands using the own client instance.
- Different senders using the same concrete command.
- Methods that calls senders' methods that, in turn, call concrete commands' methods that actually execute the actions.
#### Interpreter
DEFINITION: Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.

DateContext contains references to a String value for an expression and other three int values for a date: day, month and year.

Abstract expression is DateExpression and has an abstract void method the uses a DateContext object.

Concrete expressions (DayExpression, MonthExpression & YearExpression classes) inherit DateExpression abstract class and implement its abstract method.

DateParser is not part of the interpreter pattern. It acts as client that uses the Interpreter pattern.
#### Iterator
DEFINITION: Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

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
DEFINITION: Define an object that encapsulate how a set of objects interact. Mediator promotes loose couping by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.

Mediator interface has methods to link and unlink a Participant instance, to notify all its Participant instance, and to notify a single one.

The concrete mediator is ChatRoom class,implements the former interface and storage all the references to its Participant instances in a HashMap.

Participant interface has methods to get the own id, to operate to one or all other participants in the same mediator, and to disconnect from its mediator.

Message is the model for what is sent and has a reference for the message value, the sender and the date and time it was sent.
#### Memento
DEFINITION: Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later.

Memento interface ensures all its implementations have a getter to get the state (represented as a generic). Its implementation is Snapshot class.

Originator interface ensures all its implementations have methods to save the current state by returning it and to restore its own state by using a given Memento. Its implementation is Editor class.

The History class is the caretaker and hold a list for mementos as well as methods to add a new one and retrieve them.
#### Observer
DEFINITION: Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

Observable abstract class is prepared to bestow all the logic needed for creating concrete observables by inheriting it: subscribe, unsubscribe, change state and notify to observers.

Observer interface make its implementations to provide a logic for update method.
#### State
DEFINITION: Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

State interface has init and stop methods.

Concrete states are On and Off and implement methods of their interface.

The context is Car class, has a reference to a State instance, a setter to change it, and methods to call the methods of the State instance.
 
There is a state controller that has property and a method for every single concrete state. The properties are the concrete states and the methods receive the context and change its state to a concrete one.
#### Strategy
DEFINITION: Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

Coordinate is a model class.

GoStrategy interface has a method that receives 2 Coordinate objects and return the minutes taken to go from one to the another.

Concrete strategies implement GoStrategy interface in a sense that each one has a different algorithm for that calculation.

The Context-intended class is GPS and has:
- a reference to a GoStrategy instance.
- getTime method that uses 2 Coordinate instances, call the implemented method of its GoStrategy instance passing it those 2 2 Coordinate instances.
#### Template
DEFINITION: Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template method lets subclasses redefine certain steps of an algorithm without changing the algorithms structure.

The algorithm template with the steps defined is in meetUp method of the BoardGamePlayAlgorithm abstract class:
- Uses methods already implemented in this abstract class.
- Uses methods implemented in the templated classes (ArcadiaGamePlayAlgorithm and ParchisGamePlayAlgorithm).

The client can refer to the super class and initialize any child class thanks to polymorphism. The client only needs to call the public meetUp method from the instance, which executes the algorithm steps defined in the super class and those steps of the child class initialized.
#### Visitor
DEFINITION: Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.

There are 2 interfaces in this pattern:
- Cashier that acts as Visitor and must has a method for every single implementation of the other interface. Each method uses each implementation.
- Product that acts as Visitable and has a method that uses the other interface.

Visitable implementations act as model/representation classes. Its implemented method must call the visitor implementation method and pass the self instance as parameter.

Visitor implementation defines an algorithm for every single representation.

Client uses a data structure of concrete visitables, loop them and uses a concrete visitor to execute the corresponding algorithm to every single representation.