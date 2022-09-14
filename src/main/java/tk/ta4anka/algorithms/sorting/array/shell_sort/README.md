### Shell Sort (N-gap insertion sort)

- Variation of Insertion Sort
- Insertion sort chooses which element to insert using a gap of 1
- Shell Sort starts out using a larger gap value
- As the algorithm runs, the gap is reduced
- Goal is to reduce the amount of shifting required
- As the algorithm progresses, the gap is reduced
- The last gap value is always 1
- A gap value of 1 is equivalent to insertion sort
- So, the algorithm does some preliminary work(using gap values
  greater than 1), and then becomes insertion sort
- By the time we get to insertion sort, the array has been
  partially sorted, so there's less shifting required

***
Knuth Sequence

| **k** | **Gap (interval)** |
|-------|--------------------|
| 1     | 1                  |
| 2     | 4                  |
| 3     | 13                 |
| 4     | 40                 |
| 5     | 121                |

- Gap is calculated using (3<sup>k</sup> - 1) / 2
- We set k based on the length of the array
- We want the gap to be as close as possible to the length of hte array
  we want to sort, without being greater than the length
***
[20<sup>0</sup>, 35<sup>1</sup>, -15<sup>2</sup>, 7<sup>3</sup>, 55<sup>4</sup>, 1<sup>5</sup>, -22<sup>6</sup>]

- For our [implementation](ShellSort.java) we'll base our gap on the array's length. We'll initialize the gap (or interval) to **array.length / 2**
- On each iteration, we'll divide the gap value by 2 to get the next gap value
- For exampled array, the first gap will be initialized to 3 (7 / 2 = 3)
- Result after first iteration:

[`20`, 35, -15, `7`, 55, 1, -22]
=>
[7, _35_, -15, 20, _55_, 1, -22]
=>
[7, 35, _-15_, 20, 55, _1_, -22]
=>
[`7`, 35, -15, `20`, 55, 1, `-22`]
=> 
[-22, 35, -15, 7, 55, 1, 20]

- On the second iteration, gap will be 1 -> insertion sort
***

- In-place algorithm
- Unstable sort algorithm
- Difficult to nail down the time complexity because it wll depend on the gap. Worst case: (O<sup>2</sup>), but it can perform much better than that
- Doesn't require as much swapping as insertion sort, so it usually performs better
- Could be used to improve Bubble sort
***
