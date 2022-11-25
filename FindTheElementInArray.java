package MetodsAndArrays;

import java.util.Scanner;

public class FindTheElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] myArray = { 1, 4, 6, 2, 10, 5 };
        int index = 0;
        for (int i = 0; i < myArray.length; i++) {

            if(number==myArray[i]){
                index=i;
            }
        }

        System.out.println(index);


    }
}
