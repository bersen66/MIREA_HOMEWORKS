package lab12.p1;

public class INNManager {
    int[] digits = new int[10];

    INNManager(String value) throws InvalidINN {
        char[] values = value.toCharArray();
        for (int i = 0; i < value.length(); i++) {
            digits[i] = values[i] - '0';
        }
        if (!isCorrect()) {
            throw new InvalidINN("Wrong sum");
        }
    }

    long getControlSum() {
        int[] coeficients = {2, 4, 10, 3, 5, 9, 4, 6, 8};
        long sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += coeficients[i] * digits[i];
        }
        return (sum % 11);
    }

    boolean isCorrect() {
        return getControlSum() == digits[digits.length - 1];
    }

}
