package Q2;

public class HGV extends RoadVehicle implements ImportDuty {

    // Constructor to initialize model and price
    public HGV(String model, double price) {
        super(model, price);  // Call to the constructor of RoadVehicle super class
    }

    // Implement the calculateDuty method using HGVTAXRATE from ImportDuty interface
    @Override
    public double calculateDuty() {
        return price * ImportDuty.HGVTAXRATE;  // Calculate duty for HGVs based on the tax rate
    }
}