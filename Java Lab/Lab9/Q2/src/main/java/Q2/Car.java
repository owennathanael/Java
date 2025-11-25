package Q2;

public class Car extends RoadVehicle implements ImportDuty
{
    // Constructor to initialize model and price
    public Car(String model, double price) {
        super(model, price);  // Call to the constructor of RoadVehicle super class
    }

    // Implement the calculateDuty method using CARTAXRATE from ImportDuty interface
    @Override
    public double calculateDuty() {
        return price * ImportDuty.CARTAXRATE;  // Calculate duty for cars based on the tax rate
    }
}
