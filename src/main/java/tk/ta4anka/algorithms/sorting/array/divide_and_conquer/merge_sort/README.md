### Merge Sort

Merge sort is an efficient comparison-based sorting algorithm.
The algorithm is based on the divide-and-conquer technique.
It divides the given unsorted array of the size n into n single-element sub-arrays that are already sorted,
and then repeatedly merges the sub-arrays to produce newly sorted sub-arrays until there is only one subarray remaining.

In the algorithm, merge is the main operation. It produces a new sorted array from two input sorted arrays.
***

- Divide and conquer algorithm
- O(n log n) time complexity -  in the worst and average cases(regardless of the implementation)
- Stable sort algorithm
- not an In-place algorithm
***

_The algorithm can be implemented in two ways:_

- **Top-down** is a recursive implementation that recursively divides the given array into two sub-arrays
  until there is only a single-element subarray remaining; it then merges the results together to produce
  a sorted subarray of a larger size;

- **Bottom-up** is an iterative implementation that first merges pairs of adjacent single-element arrays
  and produces sorted sub-arrays of 2 elements, then merges pairs of adjacent arrays of 2 elements
  producing 4-elements sorted sub-arrays, then merges pairs of 4 elements, and so on until the whole array
  is merged (sorted).

***
#### [The top-down merge sort](MergeSort.java)

<img height="600" src="/src/main/resources/media/arrays_sorting/top_down_merge_sort.png" width="500"/>

***
#### The bottom-up merge sort

<img height="340" src="/src/main/resources/media/arrays_sorting/bottom_up_merge_sort.png" width="500"/>
