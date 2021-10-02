package lab5;

import com.sun.javafx.scene.traversal.Algorithm;
import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.Comparator;
import java.util.Iterator;

public class SortingAlgotithms {

    public static <T extends Comparable<? super T>> void insertionSort(T[] array) {
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            T value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value.compareTo(array[i]) <= 0) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
    }


    private static <T extends Comparable<? super T>> void merge(T[] array,
                                                               int rangeBegin,
                                                               int rangeMid,
                                                               int rangeEnd) {
        T[] leftArray = (T[]) new Comparable[rangeMid - rangeBegin + 1];
        T[] rightArray = (T[]) new Comparable[rangeEnd - rangeMid];

        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = array[rangeBegin + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = array[rangeMid + i + 1];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = rangeBegin; i < rangeEnd + 1; i++) {
            // If there are still uncopied elements in R and L, copy minimum of the two
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) < 0) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                // If all elements have been copied from rightArray, copy rest of leftArray
                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                // If all elements have been copied from leftArray, copy rest of rightArray
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }

    }

    public static <T extends Comparable<? super T>> void mergeSort(T[] array,
                                                                   int rangeBegin,
                                                                   int rangeEnd) {


        if (array.length <= 1 || array == null) {
            return;
        }

        if (rangeBegin >= rangeEnd) return;

        int rangeMid = (rangeBegin + rangeEnd) / 2;
        mergeSort(array, rangeBegin, rangeMid);
        mergeSort(array, rangeMid + 1, rangeEnd);
        merge(array, rangeBegin, rangeMid, rangeEnd);
    }


    public static <T> void quickSort(T[] array,
                                     int rangeBegin,
                                     int rangeEnd,
                                     Comparator<? super T> comparator) {
        if (array.length <= 1 || array == null) {
            return;
        }
        if (rangeBegin < 0 || rangeEnd < 0 || rangeBegin >= array.length || rangeEnd >= array.length || array.length == 0)
            return;
        int l = rangeBegin;
        int r = rangeEnd;
        int mid = (l + r) / 2;
        T piv = array[mid];
        while (l <= r) {
            while (l < array.length && comparator.compare(array[l], piv) < 0) {
                l++;
            }
            while (r > 0 && comparator.compare(array[r], piv) > 0) {
                r--;
            }
            if (l <= r) {
                T temp = array[l];
                array[l] = array[r];
                array[r] = temp;
                l++;
                r--;
            }
        }

        if (rangeBegin < r) {
            quickSort(array, rangeBegin, r, comparator);
        }
        if (rangeEnd > l) {
            quickSort(array, l, rangeEnd, comparator);
        }

    }
}
