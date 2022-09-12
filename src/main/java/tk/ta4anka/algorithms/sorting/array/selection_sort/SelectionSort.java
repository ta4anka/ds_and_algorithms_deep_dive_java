package tk.ta4anka.algorithms.sorting.array.selection_sort;

public class SelectionSort {

    public static int[] sort(int[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;

            for (int j = 1; j <= lastUnsortedIndex; j++) {
                if (array[j] > array[largest]) {
                    largest = j;
                }
            }
            swap(array, largest, lastUnsortedIndex);
        }
        return array;
    }

    private static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
