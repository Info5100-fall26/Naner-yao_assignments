## Can a class be derived (inherit) from two different independent classes?
- No, In Java, a class can have only one direct superclass. Many subclasses can share one superclass, but one subclass cannot have two parents. A class can implement several interfaces, which gives a similar effect.
## Can a class be derived (inherit) from a “final” class?
- No, The final keyword stops other classes from inheriting from a class. If another class tries to extend it, Java gives a compile error.
## What is polymorphism, how it works, and why is it needed?
- Polymorphism means many forms. It happens when classes are related by inheritance. A subclass inherits a method from its superclass and can give it its own version. 
- eg, Animal has animalSound(), and Pig and Dog each override it. When we call animalSound() on a Pig object and a Dog object, each one runs its own version. It is needed because it lets us do one action in different ways using the same method name.
## What is an inner (nested) class?
- An inner class is a class written inside another class. It groups related classes together, which makes the code easier to read and maintain. To use it, we first create an object of the outer class, then an object of the inner class. An inner class can also be private or protected, so outside classes cannot access it.
## What is an abstract class and why is it needed?
- An abstract class is a class declared with the abstract keyword. It cannot be used to create objects directly, so it must be inherited by another class. It can have abstract methods with no body, which the subclass must complete, and regular methods too. It is needed for security, which means hiding certain details and showing only the important information about an object.
## What is an “interface” class in Java?
- An interface is like an abstract class in which every method is only declared and has no body. A class uses it with the implements keyword and must write the body for every method. Objects cannot be created from an interface, and it has no constructor. Interfaces are used for security, to hide certain details and show only the important information. They are also used because a class can implement several interfaces, which gives a way around Java’s no-multiple-inheritance rule.