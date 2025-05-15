<p align="center"><h1 align="center">S3.02 Patterns 2 </h1></p>

<br>

---

## 📍 Objectives

Learn to identify and manage software construction patterns.
---

## 👾 Exercises
In all exercises, create a Gradle project with a Main class that demonstrates the use of the pattern (with any invocations needed).
### 📌 Level 1 - Builder

Develop a pizza order management system using the Builder design pattern in Java. The system should allow the creation of different types of pizzas with different size, dough, and ingredient configurations.
Define a Pizza class with the following attributes:
size
dough
toppings
Create a PizzaBuilder interface with the methods needed to configure the size, dough, and ingredients of a pizza.
Implement one or more classes that act as specific builders (PizzaBuilder) for different types of pizzas. For example, you could have a builder for Hawaiian pizza, another for vegetarian pizza, and so on.
Develop a MestrePizzer class that receives a PizzaBuilder and allows you to build pizzas in a specific way.
In the main program (Main), create instances of PizzaBuilder and MestrePizzer, and use them to build pizzas with different configurations.


### 📌 Level 2 - Observer

Design a system in which a Stock Broker (Observable) notifies several Stock Brokers (Observers) of changes when the Stock Market goes up or down.
It is necessary for the Observable object to maintain references to the Observers.


### 📌 Level 3 - CallBack

Simulate a payment gateway that receives an object encapsulating the payment method to be made: credit card, Paypal or bank account debit.

The gateway will invoke the payment without knowing the form and returning control to the origin class.
The class that invokes the payment gateway will be a shoe store.

---
## 🚀 Getting Started

### ☑️ Prerequisites

Before getting started with S3.02, ensure your runtime environment meets the following requirements:

- **Programming Language:** Java 23SE
- IntelliJ or Eclipse IDE (with Gradle)


### ⚙️ Installation

Clone the S3.02 repository:
```sh
❯ git clone https://github.com/zohra-b/S3.02
```
