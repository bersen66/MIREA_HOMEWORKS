package sem.lecture.minmax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinMaxDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 3, 10, -1, 2));
        System.out.println(Collections.min(arr));
        System.out.println(Collections.max(arr));
    }
}
