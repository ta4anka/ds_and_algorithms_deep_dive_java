### In-place Sorting and Not-in-place Sorting

Sorting algorithms may necessitate additional storage for comparison and temporary storage of a few data elements.

The algorithms do not require any additional space, and sorting is said to occur in-place, or even within the array

itself is known as **in-place sorting**. In-place sorting is demonstrated by **the bubble sort**.
 ***
Nevertheless, in some sorting algorithms, the implementation involves space that is greater

than or equal to the number of elements being sorted. Sorting that takes up equal or more space is

referred to as **not-in-place sorting**. Not-in-place sorting is demonstrated by **the merge sort**.

 ***
### Stability in Sorting Algorithms
The stability of a sorting algorithm is concerned with how the algorithm treats equal (or repeated) elements. 

**Stable sorting algorithms** preserve the relative order of equal elements, while **unstable sorting algorithms** don’t.


<img height="200" src="/src/main/resources/media/arrays_sorting/stable_unstable.png" width="350"/>

One problem with un stable sort is when a sort is within a sort:

let's say we have data of name and age, if at first we sort by age and then sort by name,

it will cause problems as the name with the bigger age will be sorted before the name with the smaller age:

<img height="200" src="/src/main/resources/media/arrays_sorting/age_name_sort.png" width="350"/>

***
[source](https://medium.com/analytics-vidhya/sorting-algorithms-a-comprehensive-guide-fe5a2470f2e0) 