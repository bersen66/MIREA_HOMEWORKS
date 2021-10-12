package My.collections;


import My.collections.player.*;

import java.util.Scanner;

public class CollectionsTest {


    static int[] readArray(int length) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }

    static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    static String testPlayer(Player player1, Player player2) {
        int turnCnt = 0;

        while (!player1.isEmpty() && !player2.isEmpty() && turnCnt < 106) {
            turnCnt++;
            int topP1 = player1.getTop();
            int topP2 = player2.getTop();

            if (topP2 == 0 && topP1 == 9) {
                player2.pushBack(topP2);
                player2.pushBack(topP1);
                continue;
            }

            if (topP1 == 0 && topP2 == 9) {
                player1.pushBack(topP2);
                player1.pushBack(topP1);
                continue;
            }

            if (topP1 < topP2) {
                player2.pushBack(topP2);
                player2.pushBack(topP1);
            } else {
                player1.pushBack(topP2);
                player1.pushBack(topP1);
            }

        }

        if (player2.isEmpty())
            return player1.getName() + " " + turnCnt;
        if(player1.isEmpty())
            return player2.getName() + " " + turnCnt;
        return "botva";
    }



    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int[] deq1 = new int[5];
//        for (int i = 0; i < 5; i++) {
//            deq1[i] = in.nextInt();
//        }
//        int[] deq2 = new int[5];
//        for (int i = 0; i < 5; i++) {
//            deq2[i] = in.nextInt();
//        }
        System.out.println(testPlayer(
                new PlayerDeque("first", readArray(5)),
                new PlayerDeque("second", readArray(5))
        ));

    }
}
