package MetodsAndArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
  public static void sortArray(char[] array) {

        for (int i = 0; i < array.length- 1; i++)
            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = (char) temp;
                }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wordOne = scanner.nextLine().toLowerCase();
        String wordTwo = scanner.nextLine().toLowerCase();
        char [] firstWord = wordOne.toCharArray();
        char [] secondWord = wordTwo.toCharArray();

        sortArray(firstWord);
        sortArray(secondWord);

        boolean result = Arrays.equals(firstWord,secondWord);

        System.out.println(result==true?"true":false);








    }


}
