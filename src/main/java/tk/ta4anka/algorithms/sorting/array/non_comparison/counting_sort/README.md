### Counting sort

https://hyperskill.org/learn/step/4983

Counting sort is a non-comparison-based algorithm for sorting small **integer** numbers.
The algorithm counts the number of occurrences for each element in the input array, storing the counts in a separate array.
Then the algorithm returns array elements from the minimum to the maximum, in accordance with their counts.

***
- Non-comparison-based algorithm
- O(n) time complexity
- The algorithm can be stable and unstable
- Not an In-place algorithm

***
The  unstable algorithm:

<img height="300" src="/src/main/resources/media/arrays_sorting/counting_sort.png" width="400"/>

***
- [video explanation](https://www.youtube.com/watch?v=OKd534EWcdk)

- [visualisation](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public+class+Main+%7B%0A++++public+static+void+main(String%5B%5D+args)+%7B%0A++++++++int%5B%5D+intArray+%3D+%7B2,+5,+9,+8,+2,+8,+7,+10,+4,+3%7D%3B%0A++++++++countingSort(intArray,+2,+10)%3B%0A++++%7D%0A%0A++++public+static+void+countingSort(int%5B%5D+input,+int+min,+int+max)+%7B%0A++++++++int%5B%5D+countArray+%3D+new+int%5B(max+-+min)+%2B+1%5D%3B%0A%0A++++++++for+(int+i+%3D+0%3B+i+%3C+input.length%3B+i%2B%2B)+%7B%0A++++++++++++countArray%5Binput%5Bi%5D+-+min%5D%2B%2B%3B%0A++++++++%7D%0A%0A++++++++int+j+%3D+0%3B%0A++++++++for+(int+i+%3D+min%3B+i+%3C%3D+max%3B+i%2B%2B)+%7B%0A++++++++++++while+(countArray%5Bi+-+min%5D+%3E+0)+%7B%0A++++++++++++++++input%5Bj%2B%2B%5D+%3D+i%3B%0A++++++++++++++++countArray%5Bi+-+min%5D--%3B%0A++++++++++++%7D%0A++++++++%7D%0A++++%7D%0A%7D&mode=) 