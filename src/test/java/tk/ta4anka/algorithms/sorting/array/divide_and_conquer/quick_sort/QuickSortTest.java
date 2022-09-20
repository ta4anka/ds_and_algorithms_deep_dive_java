package tk.ta4anka.algorithms.sorting.array.divide_and_conquer.quick_sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QuickSortTest {

    @Test
    void quickSort() {
        int[] input = {20, 35, -15, 7, 55, 1, -22};
        QuickSort.quickSort(input, 0, input.length);

        int[] expected = {-22, -15, 1, 7, 20, 35, 55};
        assertArrayEquals(expected, input);
    }
}