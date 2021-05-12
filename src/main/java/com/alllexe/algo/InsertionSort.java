package com.alllexe.algo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * O(n) time complexity in the best case.
 * O(n^2) time in worst case.
 */
public class InsertionSort {

    final static Logger log = LoggerFactory.getLogger(InsertionSort.class);

    public static void sort(int[] arr) {

        if (arr.length <= 1) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i;
            while ((j > 0) && (arr[j - 1] > current)) {
                j--;
                arr[j + 1] = arr[j];
            }
            if (j != i) {
                arr[j] = current;
            }
            log.debug("After iteration {}", arr);
        }

    }
}
