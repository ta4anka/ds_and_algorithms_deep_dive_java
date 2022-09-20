package tk.ta4anka.algorithms.sorting.array.divide_and_conquer.quick_sort;

public class QuickSort {
    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);//for left sub-arrays
        quickSort(input, pivotIndex + 1, end); //for the right sub-arrays
    }

    private static int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            // NOTE: empty loop body -> only for decrement j;  pivot <--- j
            while (i < j && input[--j] >= pivot) ;
            if (i < j) {
                input[i] = input[j];
            }
            // NOTE: empty loop body ->only for increment i;   i ---> pivot
            while (i < j && input[++i] <= pivot) ;
            if (i < j) {
                input[j] = input[i];
            }

        }
        input[j] = pivot;
        return j;
    }

}
