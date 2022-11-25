import java.util.Scanner;

public class SeaChest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[3][3];

        for (int row = 0; row < 3; row++) {
            for (int coll = 0; coll < 3;coll++){
                matrix[row][coll] = '-';
            }
        }
        PrintMatrix(matrix);
        int turnCounter=0;

        while(true) {
            System.out.println("Input in square");
            int row = Integer.parseInt(scanner.nextLine()) - 1;
            int coll = Integer.parseInt(scanner.nextLine()) - 1;
            if (!CheckIsNumberValid(row) || !CheckIsNumberValid(coll)) {
                System.out.println("Invalid numbers. Input number again");
                continue;
            }
            if (IsAveliablePosition(matrix, row, coll)) {
                matrix[row][coll] = turnCounter % 2 == 0 ? 'x' : 'o';
                PrintMatrix(matrix);
                turnCounter++;

            } else {
                System.out.println("Occupied place, try again, please");
            }
            if (turnCounter >= 9) {
                System.out.println("End of the game the result is draw.");
                break;
            }

        }
    }


    private static void PrintMatrix (char[][] matrix) {
        for (int row = 0; row < 3; row++) {
            for (int coll = 0; coll < 3;coll++){
                System.out.print(matrix[row][coll]);
            }
            System.out.println();
          }
        }
        private static boolean CheckIsNumberValid (int num){
           if (num>=0&&num<=2){

               return true;
           }
           return false;
        }
        private  static boolean IsAveliablePosition (char[][] matrix, int row, int coll){
             if(matrix[row][coll] == '-'){
                 return  true;
             }
                return false;
        }
    }

