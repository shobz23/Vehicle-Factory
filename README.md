# Vehicle-Factory
This project demonstrates the Factory Pattern in Java, applied to a Vehicle Factory system. The Factory Pattern is a creational design pattern that provides an interface for creating objects but allows subclasses to alter the type of objects that will be created.

# Key Features:
Factory Pattern: Allows the creation of different types of vehicles (Car, Bike, Truck) without specifying their concrete classes.
Vehicle Interface: Defines the behavior for all vehicle types.
Vehicle Factory: Creates instances of vehicles based on the input provided.

#Design Pattern Used:
Factory Pattern - This pattern allows us to encapsulate the creation of objects in a factory, which provides flexibility and separation of concerns. Instead of directly instantiating a class, the client requests the factory to provide an object of the desired type.

#Project Structure
The code is organized into the following files:

Vehicle.java - Interface that defines the behavior (e.g., drive()) for all vehicles.
Car.java - Concrete class representing a car.
Bike.java - Concrete class representing a bike.
VehicleFactory.java - Factory class that creates instances of vehicles.
Main.java - Class that demonstrates the use of the factory to create and use vehicles.

How It Works:
The Vehicle interface defines the method drive() that all vehicle types must implement.
The concrete classes Car and bike implement the Vehicle interface and provide specific behaviors for the drive() method.
The VehicleFactory class contains a createVehicle() method that takes a string (e.g., "Car") and returns an instance of the corresponding vehicle.
The client (Main.java) requests a vehicle from the factory without knowing the exact class being instantiated.
