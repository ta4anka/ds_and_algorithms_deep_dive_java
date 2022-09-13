package tk.ta4anka.algorithms.sorting.array.insertion_sort;

public class InsertionSort {

    public static int[] sort(int[] array) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            int j;
            for (j = firstUnsortedIndex; j > 0 && array[j - 1] > newElement; j--) {
                array[j] = array[j - 1];
            }
            array[j] = newElement;
        }
        return array;
    }
}
