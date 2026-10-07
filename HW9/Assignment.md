## 1. What is class constructor and why is it needed?
- A constructor is a special method that runs when an object is created. Its name must be the same as the class name, and it has no return type. We need it to set the starting values of the starting values of the object's attributes. If we don't write one, Java creates a default one, but it cannot set our own values.

## 2.What is the meaning of the following access modifiers: “public”, “private”, “protected”, and “default”?
- They control who can access a class, attribute, or method. 
- public means all classes can access it. 
- private means only the same class can access it. 
- protected means the same class and its subclasses can access it.
- default means no modifier is written, and only classes in the same package can access it.

## 3.What is the meaning of the following non-access modifiers: “final” and “abstract”?
- final means it can't be changed. A final attribute keeps the same value, and a final class can't be inherited. 
- abstract means it is not complete. An abstract class can't create objects and must be inherited. An abstract method has no body, and the subclass writes the body.

## 4.What is a Java package?
- A package is a group of related classes, like a folder. It helps organize the code. classes in the same package can use each other's default members.
- eg. java.util contains Scanner and ArrayList. We use import to use classes from a package. Classes in the same package can access each other's default members.