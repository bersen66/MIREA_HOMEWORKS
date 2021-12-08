package lab13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {

    public static <T> ArrayList<T> newArrayList(T[] array) {
        ArrayList<T> result = new ArrayList<>();
        result.addAll(Arrays.asList(array));
        return result;
    }

    public static <T>HashSet<T> newHashSet(T[] array) {
        HashSet<T> result = new HashSet<>();
        result.addAll(Arrays.asList(array));
        return result;
    }

    public static <K, V>HashMap<K, V> newHashMap(K[] keys, V[] values) {
        HashMap<K, V> result = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            result.put(keys[i], values[i]);
        }
        return result;
    }
}
