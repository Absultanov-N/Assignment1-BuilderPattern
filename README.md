# Assignment 1 - Builder Design Pattern

## Overview

This project demonstrates the implementation of the Builder Design Pattern in Java.

The Builder pattern is used to construct different types of Car objects step by step. Each car can have different configurations without requiring a large number of constructors.

The project creates two different cars:

- Sports Car
- Family Car

## Design Pattern

The Builder Design Pattern separates the construction of a complex object from its representation.

In this project:

- Car is the Product.
- CarBuilder is the Builder interface.
- AbstractCarBuilder provides common builder functionality.
- SportsCarBuilder and FamilyCarBuilder are Concrete Builders.
- CarDirector controls the construction process.
- Main is the Client.

## Project Structure

    Assignment1-BuilderPattern
    │
    ├── src
    │   ├── AbstractCarBuilder.java
    │   ├── Car.java
    │   ├── CarBuilder.java
    │   ├── CarDirector.java
    │   ├── FamilyCarBuilder.java
    │   ├── Main.java
    │   └── SportsCarBuilder.java
    │
    ├── .gitignore
    └── README.md

## Class Responsibilities

### Car

Car represents the final product.

It contains the following properties:

- Model
- Engine
- Number of seats
- GPS
- Trip computer

### CarBuilder

CarBuilder defines the builder operations required to configure a car.

The builder provides methods for:

- Setting the model
- Setting the engine
- Setting the number of seats
- Adding GPS
- Adding a trip computer
- Building the final car

### AbstractCarBuilder

AbstractCarBuilder implements common functionality shared by different car builders.

It stores the car configuration during the construction process and provides method chaining.

### SportsCarBuilder

SportsCarBuilder is a concrete builder used to create a sports car.

The sports car configuration includes:

- Model: Sports Car
- Engine: V8
- Seats: 2
- GPS: Yes
- Trip Computer: Yes

### FamilyCarBuilder

FamilyCarBuilder is a concrete builder used to create a family car.

The family car configuration includes:

- Model: Family Car
- Engine: V6
- Seats: 5
- GPS: Yes
- Trip Computer: Yes

### CarDirector

CarDirector controls the construction process.

It receives a builder and configures the car using builder methods.

### Main

Main is the client of the application.

It creates a CarDirector and different concrete builders, then uses them to construct different types of cars.

## Method Chaining

The builder methods return the builder object itself. This allows method chaining.

Example:

    builder
        .setModel("Sports Car")
        .setEngine("V8")
        .setSeats(2)
        .setGps(true)
        .setTripComputer(true)
        .build();

Method chaining makes the object construction process more readable and convenient.

## How to Run

### Requirements

- Java JDK 17
- IntelliJ IDEA

### Steps

1. Open the project in IntelliJ IDEA.
2. Make sure JDK 17 is selected as the Project SDK.
3. Open Main.java.
4. Run the main method.

## Expected Output

    Sports Car:
    Car{model='Sports Car', engine='V8', seats=2, hasGps=true, hasTripComputer=true}

    Family Car:
    Car{model='Family Car', engine='V6', seats=5, hasGps=true, hasTripComputer=true}

## Advantages of Builder Pattern

The Builder Pattern:

- Avoids constructors with many parameters.
- Allows step-by-step object construction.
- Makes object creation more readable.
- Supports different configurations of the same object.
- Works well with method chaining.
- Separates object construction from object representation.

## Conclusion

This project demonstrates how the Builder Design Pattern can be used to create different configurations of a Car object.

The implementation separates the construction process from the final object and uses concrete builders to create different types of cars. The CarDirector manages the construction process, while the builders are responsible for creating the final Car objects.