package com.alllexe.algo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * O(logN), which makes it ideal to search a number on a huge list.
 * Arrays.binarySearch()
 */
public class BinarySearchRecursive {

    final static Logger log = LoggerFactory.getLogger(BinarySearchRecursive.class);

    /**
     * Return index of key in array or -1 if not found. Array must be sorted.
     * @param arr array.
     * @param key number to br searched.
     * @return index of number in array or -1 if not exist.
     */
    public static int search(int[] arr, int key) {
        return binarySearchRecursive(arr, 0, arr.length - 1, key);
    }

    /**
     * Recursive binary search in array.
     * @param arr array,
     * @param from from.
     * @param to to.
     * @param target target.
     * @return index or -1.
     */
    private static int binarySearchRecursive(int[] arr, int from, int to, int target) {
        log.debug("Start search target: {}, from {} to {} in {}", target, from, to, arr);
        if (from > to) {
            return -1;
        }
        int middle = (from + to) / 2;
        log.debug("Found middle: {}", middle);
        int checked = arr[middle];
        if (target == checked) {
            log.debug("Found target index: {}", checked);
            return middle;
        } else if (target < checked) {
            return binarySearchRecursive(arr, from, middle -1, target);
        } else {
            return binarySearchRecursive(arr, middle + 1, to, target);
        }
    }
}
