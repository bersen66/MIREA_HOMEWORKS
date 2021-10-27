package sem.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Main {


    public static void main(String[] args) {
        String planetA = new String("Planet A");
        String planetB = new String("Planet B");
        String planetC = new String("Planet C");

        ArrayList<String> planets = new ArrayList<String>(
                Arrays.asList(planetB, planetC, planetA)
        );
        Collections.sort(planets);
        Collections.reverse(planets);
        System.out.println(planets);
    }
}
