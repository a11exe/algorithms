package com.alllexe.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadixSortTest {

    @Test
    public void whenRadixSortShuffledThanRightResult() {
        int[] arr = {60, 40, 30, 20, 10, 40, 30, 60, 60, 20, 40, 30, 40};
        RadixSort.sort(arr);
        assertArrayEquals(new int[]{10, 20, 20, 30, 30, 30, 40, 40, 40, 40, 60, 60, 60}, arr);
    }

    @Test
    public void whenRadixSortShuffledFrom0To100ThanRightResult() {
        int[] arr = {101, 4, 23, 2, 1, 0, 30, 60, 60, 20, 40, 30, 40};
        RadixSort.sort(arr);
        assertArrayEquals(new int[]{0, 1, 2, 4, 20, 23, 30, 30, 40, 40, 60, 60, 101}, arr);
    }

}