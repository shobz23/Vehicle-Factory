public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle("Car");
        car.drive();  // Car is driving

        Vehicle bike = VehicleFactory.createVehicle("Bike");
        bike.drive();  // Bike is driving
    }
}
