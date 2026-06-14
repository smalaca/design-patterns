# Design Patterns

## Purpose
The primary goal of this repository is to provide a comprehensive collection of Design Patterns implemented in Java. It serves as an educational resource for developers to understand the structure, implementation, and practical application of various architectural patterns.

This project is divided into three main perspectives:
1. **Structures**: Pure implementation of patterns, focusing on the core structure and relationships between classes.
2. **Examples**: Real-life-like examples showing how patterns can be applied to solve specific problems.
3. **Without Patterns**: Code examples demonstrating how a solution might look like *before* applying a design pattern, highlighting the problems that patterns are meant to solve.

## Modules

The repository is structured as a Maven multi-module project:

### 🏗️ Structures
Contains the "academic" implementation of the patterns. This is the place to look if you want to understand the UML diagram of a pattern translated into code.
- Creational Patterns (e.g., Singleton, Factory Method, Builder)
- Structural Patterns (e.g., Adapter, Bridge, Composite)
- Behavioral Patterns (e.g., Strategy, Observer, Command)

### 💡 Examples
Showcases the patterns in action. Each example provides a context where a specific pattern brings value, making it easier to grasp the "why" behind the "how".

### ⚠️ Without Patterns
A collection of "bad code" examples. These are implementations that suffer from issues like high coupling, low cohesion, or poor extensibility—precisely the problems that design patterns help to mitigate. Use these as a starting point for refactoring exercises.

## How to Use
1. **Explore by Pattern**: Navigate through the packages in `structures` to see the basic implementation.
2. **Understand the Value**: Compare the code in `withoutpatterns` with its counterparts in `examples` to see the transformation and benefits.
3. **Practice**: Try to refactor code from `withoutpatterns` using the knowledge from `structures`.

## Technology Stack
- **Java 17**
- **Maven**
- **JUnit 5 & AssertJ** for testing
- **Mockito** for mocking in tests
- **Guava**

## Getting Started
To build the project and run tests:

```bash
mvn clean install
```

## About
Created and maintained by **Sebastian Malaca**, an Architect, Developer, and Trainer passionate about software quality and evolutionary design.

---
*If you are looking for more advanced architectural concepts, check out [Training Center Microservices](https://github.com/smalaca/training-center-microservices).*
