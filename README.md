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
#### Abstract factory / Kit
DEFINITION: Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

Participants:
- AbstractFactory: FurnitureFactory
- ConcreteFactory: LivingRoomFurnitureFactory, OfficeFurnitureFactory
- ConcreteFactorySingleton: LivingRoomFurnitureFactorySingleton, OfficeFurnitureFactorySingleton
- ProductFamily1:
  - interface Table
    - LivingRoomTable
    - OfficeTable
- ProductFamily2:
  - interface Chair
    - LivingRoomChair
    - OfficeChair

#### Builder
DEFINITION: Separate the construction of a complex object from its representation so that the same construction process can create different representations.

Participants:
- Builder: interface OrderBuilder
- ConcreteBuilder: BurgerMenuBurger
- Director: Cashier (Builder)
- Product: Order (Item)
- Model:
  - abstract Item
    - abstract Burger
      - CheeseBurger
      - Veggie
    - abstract Drink
      - Water
      - Coke
    - abstract Companion
      - OnionRings
    - abstract Dessert
      - IceCream

Cashier::construct requests its OrderBuilder member to build the parts of an Order object.

#### Factory method / Virtual Constructor
DEFINITION: Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory method lets a class defer instantiation to subclasses.

Variants: *abstract creator* and *parameterized creator*.

Abstract creator variant Participants:
- Product: abstract Car
- ConcreteProduct: SuvCar
- Creator: abstract CarCreator::createCar()
- ConcreteCreator: SuvCarCreator

Parameterized creator variant Participants:
- Product: abstract Car
- ConcreteProduct: SuvCar, TourismCar
- Creator: CarCreator::createCar(CarType)

#### Prototype
DEFINITION: Specify the kinds of objects to create using a prototypical instance, and create new objects by coping this prototype.

Participants:
- Client:
  - Graphic::getRepresentation
  - GraphicTool (Graphic)
- Prototype: interface MusicalNotePrototype extends Graphic
- ConcretePrototype:
  - HalfNotePrototypeDeepCopy
  - HalfNotePrototypeShadowCopy
- Model: Representation

ConcretePrototype classes expose clone method to create a new object of their class by cloning a prototypical instance.

Variants: *Deep copy* and *Shadow copy* clone techniques.

#### Singleton
DEFINITION: Ensure a class only has one instance, and provide a global point of access to it.

Participants:
- Singleton: EarlySingleton (AnyObject), LazySingleton (AnyObject)
- Model: AnyObject

Variants: *Early instantiation* and *Lazy instantiation*.

### Structural patterns
#### Adapter / Wrapper
DEFINITION: Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interface.

Variants: *Using abstract operations*.

Participants of adapter using abstract operations variant:
- Client: Shop
- Adaptee: Product
- Target Interface: Stock
- Adapter: ProductStock
#### Bridge / Handle / Body
DEFINITION: Decouples an abstraction from its implementation so that the two can vary independently.

Participants:
- Abstraction: DomoticsSystem
- RefinedAbstraction: RectoryDomoticsSystem, SportsCenterDomoticsSystem
- Implementor: Door
- ConcreteImplementor: FrontDoor, InnerDoor

DataForm in View package is a class to encapsulate the data requests to users.
#### Composite
DEFINITION: Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

Participants:
- Component: Shape
- Composite: Grouping
- Leaf: Circle, Square
- Client: Main
#### Decorator / Wrapper
DEFINITION: Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

Participants:
- Component: CleaningMachine
- ConcreteComponent: BikeCleaningMachine, CarCleaningMachine
- Decorator: Cleaning
- ConcreteDecorator: HotWaterCleaning, HotWaterWithSoapCleaning

#### Facade
DEFINITION: Provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

Participants:
- Client: AnyVideoGame implements VideoGame
- Facade: VideoGamesConsole
- Subsystem:
  - VideoGamesConsoleImpl (VideoGame, DiskReader)
  - DiskReader
  - interface VideoGame
#### Flyweight
DEFINITION: Use sharing to support large numbers of fine-grained objects efficiently.

Participants:
- Flyweight: Sprite
- FlyweightFactory: SpriteFactory
- ConcreteFlyweight: ObjectSprite
- Context: Square
- Client: Board

Limitations:
- UnsharedConcreteFlyweight participant is not included. To include it, it would be necessary to implement Composite design pattern inside this example where UnsharedConcreteFlyweight participant would act as Composite, Flyweight as Component and ConcreteFlyweight as Leaf. Possible classes for UnsharedConcreteFlyweight would be RowSprite and ColumnSprite.
#### Proxy / Surrogate
DEFINITION: Provides a surrogate or placeholder for another object to control access to it.

Variants: *Virtual proxy*.

Participants of virtual proxy variant:
- RealSubject: Webpage implements WebpageService
- Proxy: WebpageProxy implements WebpageService
- Subject: WebpageService
- Model: HtmlDocument

### Behavioral patterns
#### Chain of responsibility
DEFINITION: Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.

Participants:
- Handler: abstract HtmlElement (AnyRequest)
- ConcreteHandler: DivHtmlElement, ButtonHtmlElement
- Model: AnyRequest
- Client: Main

#### Command / Action / Transaction
DEFINITION: Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

Participants:
- Command: Command (Gui)
- ConcreteCommand: CopyCommand extends Command
- Invoker: Button (Command), Shortcut (Command)
- Receiver: Gui (Command, Invoker)
- Client: Main

#### Interpreter
DEFINITION: Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.

Participants:
- AbstractExpression: interface RegularExpression
- TerminalExpression: LiteralExpression
- NonTerminalExpression: AlternationExpression, RepetitionExpression, SequenceExpression
- Context (AnyString)
- Client: LiteralExpressionTest, AlternationExpressionTest, RepetitionExpressionTest, SequenceExpressionTest

Limitations:
- Parser not included to create an Abstract Syntax Tree.
- Visitor pattern is not used to implement interpret operations.
- Terminal symbols are not shared by means of the Flyweight pattern.
#### Iterator / Cursor
DEFINITION: Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

Variants: *External non-robust polymorphic iterator*.

Participants of external non-robust polymorphic iterator variant:
- Iterator: interface Iterator
- ConcreteIterator: SingleLinkedListIterator
- Aggregate: Aggregate
- ConcreteAggregate: SingleLinkedList
- Client: Main

#### Mediator
DEFINITION: Define an object that encapsulate how a set of objects interact. Mediator promotes loose couping by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.

Participants:
- Mediator: interface mediator
- ConcreteMediator: ChatRoom
- ColleagueClass: interface Participant
- ConcreteColleagueClass: CharUser
- Model: Message
#### Memento / Token
DEFINITION: Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later.

Participants:
- Originator: StateDesiredToStore
- Memento: Memento
- Caretaker: Main
#### Observer / Dependents / Publish-Subscribe
DEFINITION: Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

Variants: *Have state-setting operation on SUbject call Notify after they change the subject's state, neither push nor pull model*.

Participants:
- Subject: abstract Subject
- ConcreteSubject: ConcreteSubject
- Observer: interface Observer
- ConcreteObserver: ConcreteObserver

Limitations:
- Not specifying modifications of interest explicitly.
- Not encapsulating complex update semantics into a ChangeManager participant.
#### State / Objects for States
DEFINITION: Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

Participants:
- Context: Car
- State: interface State
- ConcreteState: On, Off
#### Strategy / Policy
DEFINITION: Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

Participants:
- Context: GPS
- Strategy: interface GoStrategy
- ConcreteStrategy: ByCar, ByWalk
- Model: Coordinate
#### Template Method
DEFINITION: Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template method lets subclasses redefine certain steps of an algorithm without changing the algorithms structure.

Participants:
- AbstractClass: BoardGamePlayAlgorithm
- ConcreteClass: ArcadiaQuestPlayAlgorithm, ParchisPlayAlgorithm
#### Visitor
DEFINITION: Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.

There are 2 interfaces in this pattern:
- Cashier that acts as Visitor and must has a method for every single implementation of the other interface. Each method uses each implementation.
- Product that acts as Visitable and has a method that uses the other interface.

Visitable implementations act as model/representation classes. Its implemented method must call the visitor implementation method and pass the self instance as parameter.

Visitor implementation defines an algorithm for every single representation.

Client uses a data structure of concrete visitables, loop them and uses a concrete visitor to execute the corresponding algorithm to every single representation.
