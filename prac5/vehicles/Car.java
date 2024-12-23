package vehicles;

public class Car extends Vehicle {
    public Car(String model, String license, String color, int year, String ownerName, String insuranceNumber) {
        super(model, license, color, year, ownerName, insuranceNumber);
        this.engineType = "Combustion";  // Устанавливаем тип двигателя как "Combustion"
    }

    @Override
    public String vehicleType() {
        return "Car";
    }

    
    @Override
    public String toString() {
        return super.toString() + ", Vehicle Type: " + vehicleType();
    }
}