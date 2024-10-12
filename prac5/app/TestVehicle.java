package app;

import vehicles.Vehicle;
import vehicles.Car;
import vehicles.ElectricCar;

public class TestVehicle {
    public static void main(String[] args) {
        Car car = new Car("Lancer", "333", "White", 2010, "John Doe", "12");
        System.out.println(car);

        car.setYear(2018);
        car.setOwnerName("Jane D");

        car.setInsuranceNumber("1234");
        System.out.println("Updated Car: " + car);
        
        ElectricCar electricCar = new ElectricCar("Tesla Model 3", "111", "Red", 2022, "Alice J", "21", 85);
        System.out.println(electricCar);

        System.out.println("Battery Capacity: " + electricCar.getBatteryCapacity() + " kWh");

        electricCar.setBatteryCapacity(100);
        System.out.println("Updated Electric Car: " + electricCar);
    }
}