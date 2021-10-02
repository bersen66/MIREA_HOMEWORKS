package lab5;


import java.util.Comparator;

public class Sorting {

    private static <T> void printArray(T[] arr) {
        for (T elem : arr) {
            System.out.println(elem.toString());
        }
    }

    static void TestTaskOne() {
        Student[] students = {
                new Student("Bob",     4.2),
                new Student("Alice",   4.9),
                new Student("Albert",  3.0),
                new Student("Hary",    2.9),
                new Student("Olga",    5.0),
                new Student("Mary",    5.0),
                new Student("Georg",   2.0),
        };

        SortingAlgotithms.insertionSort(students);
        printArray(students);
    }

    static void TestTaskTwo() {
        Comparator<Student> comparator = (lhs, rhs) -> {
            return lhs.compareTo(rhs);
        };
        Student[] students = {
                new Student("Bob",     4.2),
                new Student("Alice",   4.9),
                new Student("Albert",  3.0),
                new Student("Hary",    2.9),
                new Student("Olga",    5.0),
                new Student("Mary",    5.0),
                new Student("Georg",   2.0),
        };
        SortingAlgotithms.quickSort(students, 0, students.length - 1, comparator);
        printArray(students);
    }

    static void TestTaskThree() {
        Student[] students1 = {
                new Student("Bob",     4.2),
                new Student("Alice",   4.9),
                new Student("Albert",  3.0),
                new Student("Hary",    2.9),
                new Student("Olga",    5.0),
                new Student("Mary",    5.0),
                new Student("Georg",   2.0),
        };

        Student[] students2 = {
                new Student("Oleg",     4.3),
                new Student("Marry",   3.0),
                new Student("Diper",  1.2),
                new Student("Amogus",    2.9),
        };
        Student[] mix = new Student[students1.length + students2.length];
        System.arraycopy(students1, 0,mix, 0, students1.length);
        System.arraycopy(students2, 0,mix, students1.length, students2.length);
        SortingAlgotithms.mergeSort(mix, 0, mix.length - 1);
        printArray(mix);
    }

    public static void main(String[] args) {
        //TestTaskOne();
        //TestTaskTwo();
        TestTaskThree();


    }
}
