package tk.ta4anka.algorithms.sorting.array.divide_and_conquer.merge_sort;


public class MergeSort {
    public static void mergeSort(int[] input, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);

        merge(input, start, mid, end);
    }

    private static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }

    public static void iterativeMergeSort(int[] input, int start, int end) {
        for (int i = 1; i <= input.length / 2 + 1; i *= 2) {
            for (int j = i; j < input.length; j += 2 * i) {
                merge(input, start, j, Math.min(j + i, end));
            }
        }
    }
}
