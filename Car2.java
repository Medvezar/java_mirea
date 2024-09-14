import java.util.Scanner;


public class Car2 {

    String model;
    String license;
    String color;
    int year;
    int thisYear = 2024;

    public Car2(){
        this.model = "tylx";
        this.license = "233";
        this.color = "white";
        this.year = 2020;
    }

    public Car2(String model, String license, String color, int year){
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    public Car2(String ... n){
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

    public void setColor(String color) {
        this.color = color;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public String getLicense() {
        return license;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
    
    public void getAge() {
        int n = thisYear - this.year;
        if (n < 0){
            System.out.println("У нас тут не киберпанк 2077");
            return;
        }
        System.out.println("Возраст Автомобиля: " + n);
    }

}