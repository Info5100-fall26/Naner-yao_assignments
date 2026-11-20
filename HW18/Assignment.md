## What is the role and why are application design diagrams needed?
- Application design diagrams are a blueprint of a software system that shows its core components, their relationships and the communication channels between them, and they are needed because they help teams and stakeholders understand a complex system, spot dependencies and bottlenecks, plan scalability and security, and keep everyone aligned as the system changes.

## List and describe major types of architectural design diagrams
- Class diagrams show classes and the relationships between them such as association, aggregation, composition and inheritance, object diagrams show instances of those classes at a point in time, component diagrams show the physical components of a system and their interfaces, and deployment diagrams show the hardware nodes and the software artifacts running on them.

## What is UML and how is it used?
- UML is a standardized visual modeling language, not a programming language, and it is used to model a system's structure, behavior and interactions, to document designs, and to communicate requirements between technical and non-technical people.

## Describe structural UML diagrams
- Structural UML diagrams show the static side of a system, and they include class diagrams for classes, attributes and methods, object diagrams for instances, composite structure diagrams for the internal parts of a class, component diagrams for physical components, deployment diagrams for hardware and software distribution, and package diagrams for how packages are organized and depend on each other.

## Describe behavioral UML diagrams
- Behavioral UML diagrams show the dynamic side of a system and how objects behave and interact over time, and they include state machine diagrams for state changes, activity diagrams for workflows, use case diagrams for functionality and actors, sequence and communication diagrams for object interactions, timing diagrams for time constraints, and interaction overview diagrams for the high-level flow of interactions.

## How can source code be automatically generated?
- Source code can be generated automatically either with AI models that turn natural language prompts and code context into code, or with model-driven development, which generates code directly from design models such as UML diagrams using templates and configurations.

## What tools can generate source code?
- AI tools include GitHub Copilot, Code Llama, Tabnine, Replit GhostWriter and Claude Code, while model-based tools include Enterprise Architect, which generates code from UML diagrams, and Protocol Buffers, which generates code for serializing structured data.

## How good can automatically generated code be?
- Generated code saves time and reduces human error on repetitive and boilerplate work, but it may be less flexible or creative than handwritten code, is not always accurate, and needs human review to ensure correctness and quality.

## What is vibe coding?
- Vibe coding is building applications by describing what you want in natural language instead of writing code line by line, where the human acts as prompter and tester and the AI writes the code, which speeds up prototyping but can create security debt if the code is not properly reviewed.

## Can we completely rely on the automatically generated code? If yes, in what situations?
- No, we cannot completely rely on it because generated code always needs review and testing, and safety-critical systems require rigorous testing or independent verification, although it is relatively safe for boilerplate code, quick prototypes, and code generated from precise design models as long as a human still checks it.