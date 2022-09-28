package tk.ta4anka.algorithms.sorting.array.non_comparison.counting_sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CountingSortTest {
    @Test
    void sort() {
        int[] input = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3, 0, 0};
        CountingSort.sort(input, 0, 10);

        int[] expected = {0, 0, 2, 2, 3, 4, 5, 7, 8, 8, 9, 10};
        assertArrayEquals(expected, input);
    }
}