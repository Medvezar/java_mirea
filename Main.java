import java.util.Scanner;


public class Main {

    public void To_String(){
        
    }

    public static void main(String[] args) {
    final double ROUBLES_PER_YUAN = 11.91;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите сумму в юанях: ");
    int yuan = scanner.nextInt();

    double roubles = yuan * ROUBLES_PER_YUAN;

    System.out.println("Конвертированная сумма: " + roubles);
    
  }
}
