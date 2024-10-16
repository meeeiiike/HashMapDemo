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

        System.out.println("entry set " + myMap.entrySet());

        System.out.println("key set " + myMap.keySet());

        System.out.println("values " + myMap.values());

        System.out.println(" print hashmap " + myMap);

        System.out.println(myMap.get(11));




    }
}
