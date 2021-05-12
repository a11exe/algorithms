package com.alllexe.algo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuickSortRecursive {

    final static Logger log = LoggerFactory.getLogger(QuickSortRecursive.class);

    public static void sort(int [] numbers) {
        if (numbers == null || numbers.length == 0) {
            return;
        }

        int length = numbers.length;
        quickSort(numbers, 0, length - 1);
    }

    private static void quickSort(int[] numbers, int from, int to) {
        log.debug("sort from {} to {} array {}", from, to, numbers);
        int left = from;
        int right = to;
        // pivot is middle index
        int pivot = numbers[from + (to - from) / 2];
        log.debug("pivot {}", pivot);
        while (left <= right) {
            while (numbers[left] < pivot) {
                left++;
            }
            while (numbers[right] > pivot) {
                right--;
            }
            log.debug("left {} right {}", left, right);
            if (left <= right) {
                if (left != right) {
                    swap(numbers, left, right);
                }
                // move index to next position on both sides
                left++;
                right--;
            }
        }

        log.debug("stop swap left {} right {}", left, right);
        log.debug("from {} right {}", from, right);
        // calls quickSort() method recursively
        if (from < right) {
            quickSort(numbers, from, right);
        }
        log.debug("left {} to {}", left, to);
        if (left < to) {
            quickSort(numbers, left, to);
        }
    }

    private static void swap(int[] numbers, int from, int to) {
        int temp = numbers[from];
        numbers[from] = numbers[to];
        numbers[to] = temp;
    }

}
