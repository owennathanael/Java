package Q2;

public class RoadVehicle {
    public String model;  // Model of the vehicle
    public double price;  // Price of the vehicle

    // Constructor to initialize model and price
    public RoadVehicle(String model, double price) {
        this.model = model;
        this.price = price;
    }

    // Getter methods for model and price
    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}
