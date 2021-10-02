package Recursion;

public class RecursionTest {
    static int task2(int val, int endVal) {

        if (val < endVal) {
            return endVal;
        } else {
            System.out.println(val);
            return task2(val - 1, endVal);
        }
    }

//    static int task3_(int val, int endVal) {
//
//        if (val > endVal) {
//            return endVal;
//        } else {
//            System.out.println(val);
//            return task2(val + 1, endVal);
//        }
//    }
//
//    static void task3(int A, int B) {
//        if (A <= B) {
//            task2(B, A);
//        } else {
//            task3_(A, B);
//        }
//    }
//
//
//    static int digitSum(int val) {
//        if (val == 0) {
//            return 0;
//        }
//        return val % 10 + digitSum(val / 10);
//    }

    static void t1(int i, int k) {
        if (i > k) {
            return;
        }
        for (int x = 0; x < i; x++) {
            System.out.print(i + ", ");
        }
        t1(i+1, k);
    }



    public static void main(String[] args) {
        t1(1, 4);
        //System.out.println("=====================================");
        //System.out.println(digitSum(99));
    }
}
