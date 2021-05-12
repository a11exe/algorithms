package com.alllexe.algo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 *  Time Complexity of Solution:
 *  Best Case O(k*n); Average Case O(k*n); Worst Case O(k*n),
 *  where k is the length of the longest number and n is the
 *  size of the input array.
 *
 *  Note: if k is greater than log(n) then an n*log(n) algorithm would be a
 *        better fit. In reality we can always change the radix to make k
 *        less than log(n).
 */
public class RadixSort {

    final static Logger log = LoggerFactory.getLogger(RadixSort.class);

    public static void sort(int[] arr) {

        final int RADIX = 10;

        // declare and initialize bucket[]
        List<Integer>[] bucket = new ArrayList[RADIX];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        // sort
        boolean maxLength = false;
        int tmp, placement = 1;
        while (!maxLength) {
            log.debug("Placement {}", placement);
            maxLength = true;

            // split input between lists
            for (Integer i : arr) {
                tmp = i / placement;
                bucket[tmp % RADIX].add(i);
                if (maxLength && tmp > 0) {
                    maxLength = false;
                }
            }
            log.debug("After sorting to buckets");
            for (int i = 0; i < bucket.length; i++) {
                log.debug("Bucket {} contains {}", i, bucket[i].toArray());
            }

            // empty lists into input array
            int a = 0;
            for (int b = 0; b < RADIX; b++) {
                for (Integer i : bucket[b]) {
                    arr[a++] = i;
                }
                bucket[b].clear();
            }
            log.debug("Empty list into input array {}", arr);

            // move to next digit
            placement *= RADIX;
        }
    }

}
