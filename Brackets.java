package MetodsAndArrays;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Brackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> backetIndex = new ArrayDeque<>();

        String  expression = scanner.nextLine();

        for (int i = 0; i < expression.length() ; i++) {

            if (expression.charAt(i)=='('){
                backetIndex.push(i);

            } else if (expression.charAt(i) ==')') {
                int opening = (backetIndex.pop());
                String current = expression.substring(opening,i+1);

                System.out.println(current);


            }

        }

    }
}
