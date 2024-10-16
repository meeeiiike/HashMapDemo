package ie.atu.practice;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> myMap = new HashMap<>();
        int baseValue = 100;

        for (int i = 1; i <= 10; i++){
            myMap.put(i, baseValue);
            baseValue += 100;
        }
        System.out.println(" print hashmap " + myMap);
        System.out.println("enter new number: ");
        int number = sc.nextInt();
        myMap.put(11, number);
        System.out.println("size " + myMap.size());
        // shows all keys and values
        System.out.println("entry set " + myMap.entrySet());
        // shows only the keys
        System.out.println("key set " + myMap.keySet());
        // shows only the values
        System.out.println("values " + myMap.values());
        System.out.println(" print hashmap " + myMap);
        // gets value at key entered
        System.out.println(myMap.get(11));
        if(myMap.containsKey(11)){
            myMap.remove(11);
        }
        System.out.println("Removed key 11");
        System.out.println(myMap);

        HashMap<String, Integer> myMap2 = new HashMap<>();
        myMap2.put("mike", 99999);
        System.out.println(myMap2);
        System.out.println(myMap2.get("mike"));
    }
}
