package MetodsAndArrays;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCounts {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String [] arrayList = (scanner.nextLine().split(" "));
            ArrayList<String> list = new ArrayList<>();
            for(int i = 0; i< arrayList.length; i++){
                list.add((arrayList[i]));

            }



            Map<String,Integer> map = new TreeMap<>();

            for(String numbers:list){
                if(map.containsKey(numbers)){
                    map.put(numbers,1+map.get(numbers));
                }
                else{
                    map.put(numbers,1);
                }

            }
            for( Map.Entry<String,Integer> entry : map.entrySet()){
                System.out.println("Думата \""+entry.getKey() + "\" се среща: " + entry.getValue().toString()+" пъти в текста.");

            }
        }
    }

