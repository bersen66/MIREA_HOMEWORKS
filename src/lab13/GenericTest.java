package lab13;

import java.io.File;
import java.util.ArrayList;
import java.util.List;



public class GenericTest {

    public static <T>void printList(List<T> lst) {
        for (T o : lst) System.out.println(o);
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

    public static void main(String[] args) {
        Task4();

    }
}
