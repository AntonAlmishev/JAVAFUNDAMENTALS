package MetodsAndArrays;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HotPotatoes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        String [] inputLine = input.split(" ");

        int n = Integer.valueOf(scanner.nextLine());


        ArrayDeque <String>  queue = new ArrayDeque<>();
        Collections.addAll(queue,inputLine);


        while(queue.size()>1){
            for (int i = 0; i < queue.size() ; i++) {
                String child = queue.remove();
                queue.offer(child);
            }
            String name = queue.remove();

            System.out.println("Removed "+name);

        }

        String name = queue.peek();
        System.out.println("Last is "+name);




    }

}
