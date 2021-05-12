package com.alllexe.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    public void whenMergeSortShuffledThanRightResult() {
        int[] arr = {60, 20, 40, 20, 10, 40, 30, 60, 60, 20, 40, 30, 40};
        MergeSort.sort(arr);
        assertArrayEquals(new int[]{10, 20, 20, 20, 30, 30, 40, 40, 40, 40, 60, 60, 60}, arr);
    }

}