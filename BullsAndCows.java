import javax.management.StringValueExp;
import java.util.Scanner;
import java.util.Arrays;
public class BullsAndCows {
    public static int getBullCount(String strOne, String strTwo){

        String[] secretArray = new String[strOne.length()];
        String[] guessArray = new String[strTwo.length()];
        int bullCounts = 0;
        for (int i = 0; i < Math.min(strOne.length(), strTwo.length()); i++) {
            secretArray[i] = String.valueOf((strTwo.charAt(i)));
            guessArray[i] = String.valueOf(strOne.charAt(i));
            if (secretArray[i].equals(guessArray[i])) {
                bullCounts++;
            }
        }

        return bullCounts;
    }
    public static int getCowCount (String strOne,String strTwo){
        int cowCounts = 0;
        for (int i = 0; i < Math.min(strOne.length(),strTwo.length()); i++) {
            if (strTwo.contains(Character.toString(strOne.charAt(i)))) {
                cowCounts++;
            }
        }
        return cowCounts;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Тайно число: ");

            String secNum = scanner.nextLine();


            System.out.print("-> ");
            String gueNum = scanner.nextLine();

            while (!secNum.equals(gueNum)) {

                if(secNum.length()!=gueNum.length())
                {
                    System.out.println("Невалиден опит!");
                } else {
                    System.out.printf("%s", getBullCount(secNum, gueNum) + " бикове, ");
                    System.out.printf("%s%n", getCowCount(secNum, gueNum) - getBullCount(secNum, gueNum) + " крави");
                }
                secNum = secNum;
                System.out.print("-> ");
                gueNum = scanner.nextLine();
            }
            System.out.printf("%s бикове, %s крави\n", getBullCount(secNum, gueNum), getBullCount(secNum, gueNum) - getCowCount(secNum, gueNum));


       }
    }




