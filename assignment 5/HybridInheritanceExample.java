// Top-level interface
interface Vehicle {
    void showVehicle();
}

interface Car extends Vehicle {
    void showCar();
}

interface Truck extends Vehicle {
    void showTruck();
}

class PickupTruck implements Car, Truck {
    public void showVehicle() {
        System.out.println("This is a Vehicle.");
    }

    public void showCar() {
        System.out.println("This is a Car functionality.");
    }

    public void showTruck() {
        System.out.println("This is a Truck functionality.");
    }

    void showPickup() {
        System.out.println("This is a Pickup Truck combining Car and Truck features.");
    }
}

// Test Class
public class HybridInheritanceExample {
    public static void main(String[] args) {
        PickupTruck myPickup = new PickupTruck();
        myPickup.showVehicle();
        myPickup.showCar();
        myPickup.showTruck();
        myPickup.showPickup();
    }
}
