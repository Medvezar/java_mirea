package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class main {
    public static void main(String[] args) {

        Car car = new Car("John Doe", "INS123456", "Petrol");
        car.displayInfo();
        System.out.println();


        car.setOwnerName("Jane Doe");
        car.setEngineType("Diesel");
        car.displayInfo();
        System.out.println();


        ElectricCar electricCar = new ElectricCar("Alice Johnson", "INS987654", "Electric", 85);
        electricCar.displayInfo();
        System.out.println("_________________________");


        electricCar.setBatteryCapacity(100);
        electricCar.displayInfo();
    }
}
