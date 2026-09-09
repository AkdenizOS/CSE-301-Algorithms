package bonus;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;


/**
 * @author yusuf tanrikulu
 * 20190808001
 */
public class HungarianQuickSort {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void hungarianQuickSort(int[] arr,
                                   int low, int high) {
        if (low < high) {

            int piv;
            piv = partition(arr, low, high);

            hungarianQuickSort(arr, low, piv - 1);
            hungarianQuickSort(arr, piv + 1, high);


        }
    }

    static int partition(int[] arr, int low, int high) {
        int leftIterator = low;
        int rightIterator = high;
        int leftElement = arr[leftIterator];
        int rightElement = arr[rightIterator];
        int pivotIndex = leftIterator;

        while (leftIterator < rightIterator) {
            if (pivotIndex == leftIterator) {
                if (leftElement > rightElement) {
                    swap(arr, leftIterator, rightIterator);
                    pivotIndex = rightIterator;
                    rightElement = arr[rightIterator];
                    leftElement = arr[leftIterator];
                }
            } else {
                if (rightElement < leftElement) {
                    swap(arr, leftIterator, rightIterator);
                    pivotIndex = leftIterator;
                    rightElement = arr[rightIterator];
                    leftElement = arr[leftIterator];
                }
            }


            if (pivotIndex == leftIterator) {
                rightIterator--;
                rightElement = arr[rightIterator];
            } else {
                leftIterator++;
                leftElement = arr[leftIterator];
            }
        }


        return pivotIndex;

    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int[] randomIntsArray = IntStream.generate(() -> new Random().nextInt(100000)).limit(i * 10000).toArray();
            long before = System.nanoTime();
            hungarianQuickSort(randomIntsArray, 0, randomIntsArray.length - 1);
            long after = System.nanoTime();
            float different = TimeUnit.NANOSECONDS.toMicros(after - before);
            System.out.println(" It took " + different + " microseconds to sort " +randomIntsArray.length + " elements");
        }
    }

}
