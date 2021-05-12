package com.alllexe.algo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * O(NlogN)
 */
public class MergeSort {

    final static Logger log = LoggerFactory.getLogger(InsertionSort.class);

    public static void sort(int[] arr) {
        mergesort(arr, 0, arr.length - 1);
    }

    /**
     * A Java method to implement MergeSort algorithm using recursion
     *
     * @param input
     *          , integer array to be sorted
     * @param start
     *          index of first element in array
     * @param end
     *          index of last element in array
     */
    private static void mergesort(int[] input, int start, int end) {

        // break problem into smaller structurally identical problems
        int mid = (start + end) / 2;
        if (start < end) {
            mergesort(input, start, mid);
            mergesort(input, mid + 1, end);
        }

        // merge solved pieces to get solution to original problem
        int i = 0, first = start, last = mid + 1;
        int[] tmp = new int[end - start + 1];
        log.debug("first {}, mid {}, last {}, end {}", first, mid, last, end);
        while (first <= mid && last <= end) {
            log.debug("first {}, mid {}, last {}, end {}", first, mid, last, end);
            tmp[i++] = input[first] <= input[last] ? input[first++] : input[last++];
            log.debug("tmp {}", tmp);
        }
        while (first <= mid) {
            tmp[i++] = input[first++];
        }
        while (last <= end) {
            tmp[i++] = input[last++];
        }
        i = 0;
        log.debug("tmp {}", tmp);
        while (start <= end) {
            input[start++] = tmp[i++];
        }
        log.debug("input {}", input);
    }

}
