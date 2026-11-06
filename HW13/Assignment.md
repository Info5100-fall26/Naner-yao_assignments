## 1 How can we add GUI to a Java program?

GUI, which stands for Graphical User Interface, is a user-friendly visual experience builder for Java applications. It comprises graphical units like buttons, labels, and windows, through which users can connect with an application. Swing and JavaFX are two commonly used tools for creating GUIs in Java. With Swing, we import the javax.swing library, create a container such as a JFrame, add components like buttons to it, and use layout managers to arrange them. Any activity on the GUI generates an event, and the event listener picks it up and runs the related Java code.

## 2 What is AWT - Abstract Windowing Toolkit?

The Abstract Window Toolkit (AWT) supports Graphical User Interface (GUI) programming. Its features include a set of native user interface components, a robust event-handling model, and graphics and imaging tools such as shape, color, and font classes. It also provides layout managers for flexible window layouts that do not depend on a particular window size or screen resolution, and data transfer classes for cut-and-paste through the native platform clipboard. The Swing classes are built on top of the AWT architecture.

## 3 What is Swing?

Swing in Java is a Graphical User Interface (GUI) toolkit that includes the GUI components. It provides a rich set of widgets and packages to make sophisticated GUI components for Java applications. Swing is part of the Java Foundation Classes (JFC), an API for Java GUI programming, and it is built on top of AWT, an older, platform-dependent GUI toolkit. We can use simple GUI components like buttons and text boxes from the library without having to create them from scratch.