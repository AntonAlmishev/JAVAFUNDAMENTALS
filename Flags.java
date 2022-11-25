package MetodsAndArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Flags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = '\u2588';
        char[] array = new char[10];


        /*
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < array.length; j++) {

        array[i] = c;
        System.out.print(array[i]);
    }
            System.out.println();
        }

         */

        Arrays.fill(array,c);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < array.length; j++) {

                System.out.print(array[i]);
            }
            System.out.println();
        }

    }
}
