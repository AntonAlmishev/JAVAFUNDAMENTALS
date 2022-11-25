package MetodsAndArrays;

import java.util.Scanner;

public class AverageMetoth {

    public static double calculateAverage (double ... numbers){
            double sum=0;
            int counter = 0;
            double result = 0;

        for ( double num : numbers)
              {
            sum = sum + num;
            counter++;
             result = sum/counter;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(calculateAverage(1,2,3,4,5,6));


    }
}
