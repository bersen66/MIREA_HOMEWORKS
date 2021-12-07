package lab13;

import java.util.ArrayList;

public class ArrayKeeper<T> {
    T[] array;

    ArrayKeeper(T[] array) {
        this.array = array;
    }

    T getElement(int idx) {
        return array[idx];
    }

}
