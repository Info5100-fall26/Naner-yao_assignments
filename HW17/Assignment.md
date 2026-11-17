## What is system architecture?
- System architecture is the high-level conceptual model that defines a system’s structure, behavior, and views, and serves as the blueprint for development. It ensures hardware, software, and networks work together, and that the system is maintainable, scalable, and secure.
## Describe the layered architecture principle,
- It organizes an application into horizontal layers with specific responsibilities (presentation, business logic, data access, database). Each layer communicates only with adjacent layers through defined interfaces, so changes in one layer do not affect the others. Benefits: separation of concerns, maintainability, and reusability.
## Describe client-server architecture,
-t divides tasks between clients, which request services, and servers, which provide them, using a request-response pattern over a network. By tiers: 1-tier (everything on one machine), 2-tier (client talks directly to the database), and 3-tier (an application server sits in between, giving better security and scalability but more complexity, latency, and cost).
## Describe microservices,
- An architecture style that builds an application as a collection of small, independent, loosely coupled services, each focused on one business function and communicating through lightweight APIs. Each service can be developed, deployed, and scaled independently, in contrast to a monolith. Benefits: modularity, resilience, and flexibility.
## What is component-based architecture?
- A design approach that structures an application as an assembly of independent, reusable, self-contained components that interact through well-defined interfaces. Benefits: reusability, testability, lower cost, and faster time to market (e.g., React, Unity).
## Describe MVC,
- MVC separates an application into the Model (data and business logic), the View (user interface), and the Controller (handles user input and coordinates the Model and View). Benefits: separation of concerns, easier maintenance and testing, and parallel team development.
## Describe MVVM
- MVVM consists of the Model (data and logic), the View (UI), and the ViewModel, which mediates between them and usually uses data binding to update the View automatically. Benefits: the UI is decoupled from the logic, so the logic can be unit-tested independently.
## What are the trade-offs in architectural decisions?
- Trade-offs are deliberate choices to prioritize one quality attribute over another, because all qualities cannot be optimized at once. Examples: security vs usability, cost vs reliability, consistency vs availability (CAP theorem), performance vs scalability, and simplicity vs flexibility. They are managed by using methods like ATAM, prioritizing quality attributes, communicating with stakeholders, and documenting decisions.
## Describe Design Patterns and list some major patterns.
- Design patterns are proven, reusable solutions to common software design problems. They are templates, not finished code. They fall into three categories: creational patterns deal with object creation, such as Singleton, Factory Method, and Builder. Structural patterns deal with how classes and objects are composed, such as Adapter, Decorator, and Facade. Behavioral patterns deal with communication between objects, such as Observer, Strategy, and Command.