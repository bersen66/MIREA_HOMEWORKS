package lab13;

import java.io.File;
import java.util.*;


public class GenericTest {

    public static <T>void printList(List<T> lst) {
        for (T o : lst) System.out.println(o);
    }

    public static <T>void printHashSet(HashSet<T> lst) {
        for (T o : lst) System.out.println(o);
    }

    public static <K, V>void printHashMap(HashMap<K, V> lst) {
        for (Map.Entry<K, V> pair : lst.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static void Task1() {
        {
            Integer[] arr = {1, 2, 4, 5};
            ArrayList<Integer> conv  = Converter.convert(arr);
            printList(conv);
        }

        {
            String[] arr = {"a", "b", "v", "aboba"};
            ArrayList<String> conv = Converter.convert(arr);
            printList(conv);
        }
    }

    public static void Task23() {
        {
            Integer[] arr = {1, 2, 4, 5, 6};
            ArrayKeeper<Integer> arrayKeeper = new ArrayKeeper<>(arr);
            for (int i = 0; i < arr.length; i++)
                System.out.println(arrayKeeper.getElement(i));
        }

    }

    public static void Task4() {
        File f = new File("D://");
        FileScanner fs = new FileScanner();

        fs.scanDirectory(f);
        List<String> files = fs.fileNames;

        for (int i = 0; i < 5; i++) {

        }
        for (int i = 0; i < 5; i++) {
            System.out.println(files.get(i));
        }

    }

    public static void Task5() {
        {
            Integer[] arr = {1, 2, 4, 5};
            ArrayList<Integer> conv  = Solution.newArrayList(arr);
            printList(conv);
        }
        {
            System.out.println("================================");
            Character[] arr = {
                    'a', 'b', 'c', 'c', 'c'
            };
            HashSet<Character> conv  = Solution.newHashSet(arr);
            printHashSet(conv);
        }
        {
            System.out.println("================================");
            Character[] keys = {
                    'a', 'b', 'c',
            };
            Integer[] values = {1, 2, 4};
            HashMap<Character, Integer> conv  = Solution.newHashMap(keys, values);
            printHashMap(conv);
        }
    }


    public static void main(String[] args) {
        Task5();

    }
}
