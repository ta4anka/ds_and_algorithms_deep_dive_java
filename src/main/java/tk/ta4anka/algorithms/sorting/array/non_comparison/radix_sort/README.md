### Radix sort

- Data must have same radix and width
- Data must be integers or strings
- Sort based on each individual digit or letter position

***
- Non-comparison-based algorithm
- O(n) time complexity
- Stable sort algorithm
***

<img height="300" src="/src/main/resources/media/arrays_sorting/radix_sort.png" width="600"/>

***
[visualization](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public+class+Main+%7B%0A%0A++++public+static+void+main(String%5B%5D+args)+%7B%0A%0A++++++++int%5B%5D+radixArray+%3D+%7B+4725,+4586,+1330,+8792,+1594,+5729+%7D%3B%0A%0A++++++++radixSort(radixArray,+10,+4)%3B%0A%0A++++%7D%0A%0A++++public+static+void+radixSort(int%5B%5D+input,+int+radix,+int+width)+%7B%0A++++++++for+(int+i+%3D+0%3B+i+%3C+width%3B+i%2B%2B)+%7B%0A++++++++++++radixSingleSort(input,+i,+radix)%3B%0A++++++++%7D%0A++++%7D%0A%0A++++public+static+void+radixSingleSort(int%5B%5D+input,+int+position,+int+radix)+%7B%0A%0A++++++++int+numItems+%3D+input.length%3B%0A++++++++int%5B%5D+countArray+%3D+new+int%5Bradix%5D%3B%0A%0A++++++++for+(int+value%3A+input)+%7B%0A++++++++++++countArray%5BgetDigit(position,+value,+radix)%5D%2B%2B%3B%0A++++++++%7D%0A++++++++//+Adjust+the+count+array%0A++++++++for+(int+j+%3D+1%3B+j+%3C+radix%3B+j%2B%2B)+%7B%0A++++++++++++countArray%5Bj%5D+%2B%3D+countArray%5Bj+-+1%5D%3B%0A++++++++%7D%0A%0A++++++++int%5B%5D+temp+%3D+new+int%5BnumItems%5D%3B%0A++++++++for+(int+tempIndex+%3D+numItems+-+1%3B+tempIndex+%3E%3D+0%3B+tempIndex--)+%7B%0A++++++++++++temp%5B--countArray%5BgetDigit(position,+input%5BtempIndex%5D,+radix)%5D%5D+%3D%0A++++++++++++++++++++input%5BtempIndex%5D%3B%0A++++++++%7D%0A%0A++++++++for+(int+tempIndex+%3D+0%3B+tempIndex+%3C+numItems%3B+tempIndex%2B%2B)+%7B%0A++++++++++++input%5BtempIndex%5D+%3D+temp%5BtempIndex%5D%3B%0A++++++++%7D%0A%0A++++%7D%0A%0A%0A++++public+static+int+getDigit(int+position,+int+value,+int+radix)+%7B%0A++++++++return+value+/+(int)+Math.pow(radix,+position)+%25+radix%3B%0A++++%7D%0A%0A%7D&mode=edit)