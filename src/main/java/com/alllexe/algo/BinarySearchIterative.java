package com.alllexe.algo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * O(logN), which makes it ideal to search a number on a huge list.
 * Arrays.binarySearch()
 */
public class BinarySearchIterative {

    final static Logger log = LoggerFactory.getLogger(BinarySearchIterative.class);

    /**
     * Return index of key in array or -1 if not found. Array must be sorted.
     * @param arr array.
     * @param key number to br searched.
     * @return index of number in array or -1 if not exist.
     */
    public static int search(int[] arr, int key) {
        return binarySearchIterative(arr, key);
    }

    /**
     * Iterative binary search in array.
     * @param arr array,
     * @param target target for search.
     * @return index or -1.
     */
    private static int binarySearchIterative(int[] arr, int target) {

        int from = 0;
        int to = arr.length - 1;

        while (from <= to) {
            log.debug("Start search target: {}, from {} to {} in {}", target, from, to, arr);
            int middle = (from + to) / 2;
            log.debug("Found middle: {}", middle);
            int checked = arr[middle];
            if (target == checked) {
                log.debug("Found target index: {}", checked);
                return middle;
            } else if (target < checked) {
                to = middle - 1;
            } else {
                from = middle + 1;
            }
        }
        return -1;
    }
}
