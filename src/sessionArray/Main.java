package sessionArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/**        Напишите класс, который принимает с клавиатуры целое число любой длины и выводит на экран:
 //         впервойстроке-всечетныецифрыэтогочисла,черезпробел ● вовторойстроке-всенечетныецифрыэтогочисла,через
 //        пробел
 //        Например, для числа 765873 в первой строке будет выведены числа 6 8, а во второй строке 7 5 7 3
 */


        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        String number = Integer.toString((int) num);
        System.out.print("jup san : ");
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) % 2 == 0) {
                System.out.print(number.charAt(i) + "  ");
            }


        }
        System.out.println();
        System.out.print("tak san : ");
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) % 2 == 1) {
                System.out.print(number.charAt(i) + " ");

            }


        }

    }
}
