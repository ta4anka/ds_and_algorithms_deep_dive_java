package tk.ta4anka.algorithms.sorting.array.bubble_sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BubbleSortTest {

    @Test
    void sort() {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        int[] sortedArray = BubbleSort.sort(intArray);
        assertEquals("[-22, -15, 1, 7, 20, 35, 55]", Arrays.toString(sortedArray));
    }
}