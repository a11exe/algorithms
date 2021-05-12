package com.alllexe.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingSortTest {

    @Test
    public void whenCountingSortShuffledThanRightResult() {
        int[] arr = {60, 40, 30, 20, 10, 40, 30, 60, 60, 20, 40, 30, 40};
        CountingSort.sort(arr, 60);
        assertArrayEquals(new int[]{10, 20, 20, 30, 30, 30, 40, 40, 40, 40, 60, 60, 60}, arr);
    }

}