package MetodsAndArrays;

public class ArraysSum {

    public static void main(String[] args) {


        double [] array = {-1,10,4.5,15,3.278};
        double sum = 0;

        for (double i = 0; i < array.length; i++){

             sum = sum + array[(int) i];

        }
        System.out.println(sum);
    }
}
