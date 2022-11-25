package CodeLessons15Cycles;

import java.util.Locale;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().toLowerCase();
        String isPalindrome = "";

        for (int i = word.length()-1 ;i >= 0; i--) {
            isPalindrome = isPalindrome + word.charAt(i);
        }
            if (word.equals(isPalindrome)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }

