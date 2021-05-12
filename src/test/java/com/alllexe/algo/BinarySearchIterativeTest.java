package com.alllexe.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchIterativeTest {

    @Test
    public void whenBinarySearchInMiddleThanRightResult() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = BinarySearchIterative.search(arr, 5);
        assertEquals(5, key);
    }

    @Test
    public void whenBinarySearchInLeftThanRightResult() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int key = BinarySearchIterative.search(arr, 2);
        assertEquals(1, key);
    }

    @Test
    public void whenBinarySearchInRightThanRightResult() {
        int[] arr = {-11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1};
        int key = BinarySearchIterative.search(arr, -9);
        assertEquals(2, key);
    }
    @Test
    public void whenBinarySearchInLeftEdgeThanRightResult() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = BinarySearchIterative.search(arr, 0);
        assertEquals(0, key);
    }

    @Test
    public void whenBinarySearchInRightEdgeThanRightResult() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = BinarySearchIterative.search(arr, 10);
        assertEquals(10, key);
    }

    @Test
    public void whenBinarySearchNotExistThanRightResult() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = BinarySearchIterative.search(arr, 11);
        assertEquals(-1, key);
    }
}