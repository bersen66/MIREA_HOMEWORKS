package lab11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ResultBuilder answers = new ResultBuilder();

        ArrayList<HorseRunner> horseRunners = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println("START:");
        System.out.println();
        for (int i = 0; i < n; i++) {
            horseRunners.add(
                    new HorseRunner(
                            new HorseInfo("Horse#" + i, i, i + 4),
                            100,
                            answers
                    )
            );
        }

        for (HorseRunner hr : horseRunners) {
            System.out.println(hr.toString());
        }

        for (HorseRunner hr : horseRunners) {
            hr.start();
        }
        for (HorseRunner hr : horseRunners) {
            try {
                hr.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("FINISH");
        System.out.println();

        answers.results.sort(
                new Comparator<HorseRunner>() {
                    @Override
                    public int compare(HorseRunner o1, HorseRunner o2) {
                        if (o1.timer < o2.timer) {
                            return -1;
                        }
                        if (o1.timer == o2.timer) {
                            return 0;
                        }
                        return 1;
                    }
                }
        );
        for (HorseRunner hr : answers.results) {
            System.out.println(hr.getHorseName());
        }


    }
}
