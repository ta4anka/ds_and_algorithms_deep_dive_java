package tk.ta4anka.algorithms.sorting.array.insertion_sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertionSortTest {

    @Test
    void sort() {
        int[] input = {20, 35, -15, 7, 55, 1, -22};
        int[] sortedArray = InsertionSort.sort(input);

        int[] expected = {-22, -15, 1, 7, 20, 35, 55};

        assertArrayEquals(expected, sortedArray);
    }
}