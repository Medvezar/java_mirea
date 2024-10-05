package app;

import vehicles.Vehicle;
import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar {
    public static void main(String[] args) {
        Vehicle car = new Car("mitsubishi lancer", "A111AA49", "White", 2011, "John Doe", "INS123456", "Gasoline");

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(car);

        car.setOwnerName("Jane Doe");
        car.setColor("Black");

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Updated Car: " + car);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
        
        Vehicle electricCar = new ElectricCar("Tesla Model 3", "A333AA49", "Red", 2022, "Alice Johnson", "INS987654", 85);
        System.out.println(electricCar);

        ((ElectricCar) electricCar).setBatteryCapacity(100);
        System.out.println("Updated Electric Car: " + electricCar);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
