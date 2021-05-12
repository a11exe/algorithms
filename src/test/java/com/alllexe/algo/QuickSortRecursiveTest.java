package com.alllexe.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortRecursiveTest {

    @Test
    public void whenQuickSortShuffledThanRightResult() {
        int[] arr = {6, 5, 3, 1, 8, 7, 2, 4};
        QuickSortRecursive.sort(arr);
        assertArrayEquals(arr, new int[]{1, 2, 3, 4, 5, 6, 7, 8});
    }

    @Test
    public void whenQuickSortShuffled2ThanRightResult() {
        int[] arr = {1, 3, 4, 8, 7, 6, 5, 2};
        QuickSortRecursive.sort(arr);
        assertArrayEquals(arr, new int[]{1, 2, 3, 4, 5, 6, 7, 8});
    }

}