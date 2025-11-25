package Q2;

public interface ImportDuty {
    // Constants for tax rates
    double CARTAXRATE = 0.10;  // 10% tax rate for cars
    double HGVTAXRATE = 0.15;  // 15% tax rate for HGVs

    // method to e used by classes that implement it
    double calculateDuty();
}