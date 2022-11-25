package MetodsAndArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEquals {

    public static void sortArray(int [] array) {

        for (int i = 0; i < array.length- 1; i++)
            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] =  temp;
                }
    }
    public static boolean isArrayOneEqualsArrayTwo(int [] arrayOne,int [] arrayTwo ) {

        boolean result = true;

        if (arrayOne.length == arrayTwo.length) {

            for (int i = 0; i < arrayOne.length; i++) {

                if (arrayOne[i] != arrayTwo[i]) {
                    return false;
                } else {
                    return true;
                }

            }
        } else {
            return false;
        }
        return  result;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] digits = new int[3];

        for (int i = 0; i < 3 ; i++) {
             digits[i] = scanner.nextInt();
        }



        int [] array = { 1, 10, 15 };

        sortArray(digits);
        sortArray(array);
        System.out.println(isArrayOneEqualsArrayTwo(array,digits));






    }
}
