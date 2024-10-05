import java.util.Scanner;

public class prac1_2 {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму в юанях: ");
        int yuan  = scanner.nextInt();

        double roubles = yuan * ROUBLES_PER_YUAN;

        int digit = yuan % 10;

        if (digit == 1 && yuan != 11) {
            System.out.println(yuan + " китайский юань в рублях по курсу 11.91: " + roubles);
        }

        else if (digit <= 5 && digit > 1 && yuan < 6){
            System.out.println(yuan + " китайских юаня в рублях по курсу 11.91: " + roubles);
        }

        else{
            System.out.println(yuan + " китайских юаней в рублях по курсу 11.91: " + roubles);
        }
    }
}
