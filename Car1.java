import java.util.Scanner;

public class Car1 {
    
    String model;
    String license;
    String color;
    int year;

    public Car1(){
        this.model = "tylx";
        this.license = "233";
        this.color = "white";
        this.year = 2020;
    }

    public Car1(String model, String license, String color, int year){
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    public Car1(String ... n){
        Scanner scanner = new Scanner(System.in);
        for (String i : n) {
            switch (i) {
                case "year":
                    System.out.print("Введите год выпуска: ");
                    this.year = scanner.nextInt();
                    break;
                
                case "license":
                    System.out.print("Введите номер лицензии: ");
                    this.license = scanner.nextLine();
                    break;
                
                case "color":
                    System.out.print("Введите цвет: ");
                    this.color = scanner.nextLine();
                    break;
                
                case "model":
                    System.out.print("Введите модель: ");
                    this.model = scanner.nextLine();
                    break;

                default:
                    break;
            }
        }
    }
}