package Q2;
//Lab:9
//Name:Owen Nathanael
//S.Number:c00313648
public class Main {
    public static void main(String[] args) {
        // Create an instance of Car and HGV
        Car myCar = new Car("Toyota Corolla", 20000.3);
        HGV myHGV = new HGV("Volvo FH", 80000.5);

        // Print the import duty for the car
        System.out.println("Import duty for " + myCar.getModel() + " ("+"Car Price:"+ + myCar.getPrice() +"$"+ "): $" + myCar.calculateDuty());

        // Print the import duty for the HGV
        System.out.println("Import duty for " + myHGV.getModel() + " ("+"Car Price:" + myHGV.getPrice() +"$"+ "): $" + myHGV.calculateDuty());
    }
}
