package tk.ta4anka.algorithms.sorting.array.non_comparison.radix_sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RadixSortTest {

    @Test
    void radixSort() {
        int[] input = {4725, 4586, 1330, 8792, 1594, 5729};
        RadixSort.radixSort(input, 10, 4);

        int[] expected = {1330, 1594, 4586, 4725, 5729, 8792};
        assertArrayEquals(expected, input);
    }
}