package lab12.p1;

import com.sun.javaws.exceptions.InvalidArgumentException;
import jdk.internal.org.objectweb.asm.tree.InnerClassNode;

import java.util.Scanner;

public class TestINN {

    public static void main(String[] args) {

        System.out.println("Введите ИНН");

        try(Scanner in = new Scanner(System.in);) {
            String inn = in.next();
            INNManager innManager = new INNManager(inn);
        } catch (InvalidINN invalidINN) {
            System.out.println(invalidINN.toString());
            return;
        }
        System.out.println("Correct!");
        //String correctINN = "7707083893";
        //INNManager m = new INNManager(wrongINN);
        //System.out.println(m.isCorrect());
    }
}
