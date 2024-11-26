import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] months = {"январь", "февраль", "март", "апрель", "май",
        "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        try{
            System.out.print("Введите текущий год: ");
            int year = input.nextInt();

            System.out.print("Введите целое число от 1 до 12: ");
            int numberOfMonth = input.nextInt();

            System.out.println("Месяц: " + months[numberOfMonth - 1]);
            if (isLeapYear(year) && numberOfMonth == 2){
                System.out.println("Количество дней: 29");
            }
            else{
                System.out.println("Количество дней: " + dom[numberOfMonth - 1]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Введено неверное число");
        }   
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}