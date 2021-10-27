package lab8;

import lab8.pet.Cat;
import lab8.pet.Owl;
import lab8.pet.Pet;
import lab8.pet.Dog;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    static void task1() {
        Map<String, Pet> pets = new HashMap<>();
        pets.put("pet1", new Owl("Boba", "Owl usual"));
        pets.put("pet2", new Cat("Gosha", "Cat usual"));
        pets.put("pet3", new Dog("Alexander", "Dog usual"));

        for (Map.Entry pet : pets.entrySet()) {
            System.out.println("Key: " + pet.getKey() + " Value: " + pet.getValue());
        }


        pets.put("pet4", new Cat("Ortur", "Cat usual12"));
        pets.put("pet5", new Dog("Fedor", "Dog usual23"));
        System.out.println();
        for (Map.Entry pet : pets.entrySet()) {
            System.out.println("Key: " + pet.getKey() + " Value: " + pet.getValue());
        }
    }

    static void task2() {
        System.out.println("Enter array length:");
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        Map<Integer, Integer> repeats = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

            if (repeats.containsKey(arr[i])) {
                int curRep = repeats.get(arr[i]);
                curRep++;
                repeats.put(arr[i], curRep);
            } else {
                repeats.put(arr[i], 1);
            }
        }


        for (Map.Entry entry : repeats.entrySet()) {
            System.out.println( "Value: " + entry.getKey() +
                                " repeats: " + entry.getValue() + " times");
        }
    }

    public static void main(String[] args) {
        task1();
        task2();


    }
}
