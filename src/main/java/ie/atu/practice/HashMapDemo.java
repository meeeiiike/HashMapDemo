package ie.atu.practice;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> myMap = new HashMap<>(10);

        myMap.put(1, 100);
        myMap.put(2, 200);
        myMap.put(3, 300);
        myMap.put(4, 400);
        myMap.put(5, 500);
        myMap.put(6, 600);
        myMap.put(7, 700);
        myMap.put(8, 800);
        myMap.put(9, 900);
        myMap.put(10, 1000);

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
