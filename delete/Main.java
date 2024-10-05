import java.util.Scanner;


public class Main {

    public static void To_String(Car2 car){
        System.out.println("--------------------------------");
        System.out.println("Модель: " + car.getModel());
        System.out.println("Цвет: " + car.getColor());
        System.out.println("Лицензия: " + car.getLicense());
        System.out.println("год: " + car.getYear());
        System.out.println("Возраст: " + car.getAge());
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    Car2 car = new Car2();
    To_String(car);
  }
}
