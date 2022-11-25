package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class FindListElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int inputNum = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(6);
        numbers.add(2);
        numbers.add(10);
        numbers.add(5);


        System.out.println("Index of inputNum : "+ numbers.indexOf(inputNum));




    }
}
