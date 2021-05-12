package com.alllexe.algo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    public void whenBubbleSortSortedThanRightResult() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] sorted = BubbleSort.sort(arr);
        assertArrayEquals(arr, sorted);
    }

    @Test
    public void whenBubbleSortShuffleThanRightResult() {
        int[] arr = {1, 1, 2, 10, 4, 5, 4, 7, 9, 8, 3};
        int[] sorted = BubbleSort.sort(arr);
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4, 5, 7, 8, 9, 10}, sorted);
    }

    @Test
    public void whenBubbleSortReversrThanRightResult() {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] sorted = BubbleSort.sort(arr);
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, sorted);
    }

}