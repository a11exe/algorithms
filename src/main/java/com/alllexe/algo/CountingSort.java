package com.alllexe.algo;

/**
 * Time Complexity of the Counting Sort is O(n+k) in the best case, average case and worst case.
 * Because the Counting sort algorithm creates a bucket for each value,
 * an imposing restriction is that the maximum value in the input array is known beforehand.
 * In practice, we usually use the counting sort algorithm when having k = O(n),
 * in which case the running time is O(n)
 */
public class CountingSort {

    public static void sort(int[] arr, int maxValue) {

        // create buckets
        int[] counter = new int[maxValue + 1];

        // fill buckets
        for (int i : arr) {
            counter[i]++;
        }

        // sort array
        int ndx = 0;
        for (int i = 0; i < counter.length; i++) {
            while (0 < counter[i]) {
                arr[ndx++] = i;
                counter[i]--;
            }
        }
    }

}
