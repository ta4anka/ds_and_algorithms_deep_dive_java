### Quicksort
Quick sort is an efficient **in-place** sorting algorithm that is often faster in practice compared to other sorting algorithms.
The algorithm is based on the divide-and-conquer paradigm.

Here are the steps of quicksort:

- Pick some element from the array. We will call that element a pivot.
- Reorder the array so that all values smaller than the pivot are positioned before it and all larger values come after; values equal to the pivot can go either way.
- Recursively sort the sub-arrays of smaller and greater elements.

A pivot value can be any of the following:

- [The first element](QuickSort.java) in the array
- The last element in the array
- The mid-element in the array
- Any random element in the array

***
- Divide and conquer algorithm
- O(n log n) time complexity -> in the average case, and O(n<sup>2</sup>) -> in the worst case
- Unstable sort algorithm
- In-place algorithm
***
[Visualization](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public+class+Main+%7B%0A++++public+static+void+main(String%5B%5D+args)+%7B%0A++++++++int%5B%5D+intArray+%3D+%7B+20,+35,+-15,+7,+55,+1,+-22+%7D%3B%0A++++++++quickSort(intArray,+0,+intArray.length)%3B%0A++++%7D%0A%0A++++public+static+void+quickSort(int%5B%5D+input,+int+start,+int+end)+%7B%0A++++++++if+(end+-+start+%3C+2)+%7B%0A++++++++++++return%3B%0A++++++++%7D%0A%0A++++++++int+pivotIndex+%3D+partition(input,+start,+end)%3B%0A++++++++quickSort(input,+start,+pivotIndex)%3B%0A++++++++quickSort(input,+pivotIndex+%2B+1,+end)%3B%0A++++%7D%0A%0A++++public+static+int+partition(int%5B%5D+input,+int+start,+int+end)+%7B%0A++++++++int+pivot+%3D+input%5Bstart%5D%3B%0A++++++++int+i+%3D+start%3B%0A++++++++int+j+%3D+end%3B%0A%0A++++++++while+(i+%3C+j)+%7B%0A++++++++++++//+NOTE%3A+empty+loop+body%0A++++++++++++while+(i+%3C+j+%26%26+input%5B--j%5D+%3E%3D+pivot)%3B%0A++++++++++++if+(i+%3C+j)+%7B%0A++++++++++++++++input%5Bi%5D+%3D+input%5Bj%5D%3B%0A++++++++++++%7D%0A+++++++++++//+NOTE%3A+empty+loop+body%0A++++++++++++while+(i+%3C+j+%26%26+input%5B%2B%2Bi%5D+%3C%3D+pivot)%3B%0A++++++++++++if+(i+%3C+j)+%7B%0A++++++++++++++++input%5Bj%5D+%3D+input%5Bi%5D%3B%0A++++++++++++%7D%0A++++++++%7D%0A%0A++++++++input%5Bj%5D+%3D+pivot%3B%0A++++++++return+j%3B%0A++++%7D%0A%7D&mode=edit)