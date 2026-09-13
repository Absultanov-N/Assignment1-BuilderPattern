# Assignment 1 - Builder Pattern

## Project Description

This project demonstrates the Builder Design Pattern in Java.

The application creates different types of cars using separate builders. The implementation also uses method chaining to configure a car step by step.

## Design Pattern

The Builder Pattern separates the construction of an object from its representation.

In this project:

- `Car` is the Product.
- `CarBuilder` defines the builder interface.
- `AbstractCarBuilder` provides common implementation for builders.
- `SportsCarBuilder` creates a sports car.
- `FamilyCarBuilder` creates a family car.
- `CarDirector` manages the car construction process.
- `Main` demonstrates the use of the Builder Pattern.

## Project Structure

```text
src/
├── Car.java
├── CarBuilder.java
├── AbstractCarBuilder.java
├── SportsCarBuilder.java
├── FamilyCarBuilder.java
├── CarDirector.java
└── Main.java
```

## Features

The application creates:

- Sports Car
- Family Car

Each car can be configured with:

- Model
- Engine
- Number of seats
- GPS
- Trip computer

## Method Chaining

The builder methods return the builder object, which allows method chaining.

Example:

```text
builder
        .setModel("Sports Car")
    .setEngine("V8")
    .setSeats(2)
    .setGps(true)
    .setTripComputer(true)
    .build();

## Requirements

- Java JDK 17
- IntelliJ IDEA

## How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure JDK 17 is selected as the Project SDK.
3. Open `Main.java`.
4. Run the `main` method.

## Expected Output

```text
Sports Car:
Car{model='Sports Car', engine='V8', seats=2, hasGps=true, hasTripComputer=true}

Family Car:
Car{model='Family Car', engine='V6', seats=5, hasGps=true, hasTripComputer=true}
```

## UML Diagram

The project structure follows the Builder Design Pattern with:

- Product: `Car`
- Builder: `CarBuilder`
- Abstract Builder: `AbstractCarBuilder`
- Concrete Builders: `SportsCarBuilder` and `FamilyCarBuilder`
- Director: `CarDirector`
- Client: `Main`