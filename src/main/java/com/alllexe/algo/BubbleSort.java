package com.alllexe.algo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Bubble sort's average-case performance is in O(n^2)
 * Due to quadratic performance, bubble sort is best suited for small,
 * almost sorted list e.g. {1, 2, 4, 3, 5}, where it just needs to do one swapping.
 * Ironically, the best-case performance of bubble sort,
 * which is O(n) beats quicksort's best-case performance of O(NlogN).
 */
public class BubbleSort {

    final static Logger log = LoggerFactory.getLogger(BubbleSort.class);

    public static int[] sort(int[] arr) {

        boolean sorted;

        for (int i = 0; i < arr.length - 1; i++) {
            sorted = true;
            for (int j = arr.length - 1; j > i; j--) {
                log.debug("compare {} to {}", arr[j-1], arr[j]);
                if (arr[j-1] > arr[j]) {
                    sorted = false;
                    int old = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = old;
                }
            }
            if (sorted) {
                break;
            }
            log.debug("After iteration {}", arr);
        }
        return arr;
    }

}
