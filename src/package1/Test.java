package package1;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

        int[] array = getRandomArray(20, 1, 5);



        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));


    }
    public static boolean method(int number, String[] array){


    return false;
    }
    protected static boolean method( String s, String[] strings){
        return false;
    }

    public static int[] getRandomArray(int arrayLength, int number1, int number2){
        int[] a = new int[arrayLength];

        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(number1, number2);
        }
        return a;
    }

    public static void method(int number1, int number2){


    }
//
//    public static void method(){}

}
