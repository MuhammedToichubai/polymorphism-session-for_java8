import java.util.Scanner;

public class EvenAndExactNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        System.out.print("Жуп сандар: ");
        getEvenNumbers(number);
        System.out.println("\n------------------------");
        System.out.print("Так сандар: ");
        getExactNumbers(number);

    }
    public static void getEvenNumbers(long num) {

        if(num / 10 > 0) {
            getEvenNumbers(num / 10);
        }
        if (!(num % 2 == 1)){
            System.out.printf("%d ", num % 10);
        }
    }
    public static void getExactNumbers(long num) {
        if(num / 10 > 0) {
            getExactNumbers(num / 10);
        }
        if ((num % 2 == 1)){
            System.out.printf("%d ", num % 10);
        }

    }
}
