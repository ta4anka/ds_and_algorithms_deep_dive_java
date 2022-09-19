package tk.ta4anka.algorithms.sorting.array.divide_and_conquer.merge_sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void mergeSort() {
        int[] input = {20, 35, -15, 7, 55, 1, -22};
        MergeSort.mergeSort(input, 0, input.length);

        int[] expected = {-22, -15, 1, 7, 20, 35, 55};
        assertArrayEquals(expected, input);
    }

    @Test
    void iterativeMergeSort() {
        int[] input = {20, 35, -15, 7, 55, 1, -22};
        MergeSort.iterativeMergeSort(input, 0, input.length);

        int[] expected = {-22, -15, 1, 7, 20, 35, 55};
        assertArrayEquals(expected, input);
    }
}