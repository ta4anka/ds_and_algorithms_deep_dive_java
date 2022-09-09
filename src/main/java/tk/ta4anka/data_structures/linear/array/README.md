### Arrays - Memory Management
- Contiguous block in memory
- Every element occupies the same amount of space in memory
- If an array starts at memory address x, and the size of each element
  in the arrays is y, we can calculate the memory address of the ith element
  by using the following expression: x + i * y
- If we know the index of an element, the time to retrieve the element will be the same,
  no matter where it is in the array

***

When we just write

`int[] arr;`

It only creates a variable in the stack and has value null by default:





But after that when we allocate memory like this:

`arr = new int[5];`

<img height="350" src="/src/main/resources/media/arrays_memory/arrays_memory2.jpg" width="474"/>

Then to store 5 ints a memory gets allocated in the heap. They will have their own address.
For the time being let's assume the addresses start from 4000. 
Now, these allocated memory units are contiguous, hence they will be spaced out by the same distance.
So, the next memory location will have 4004 (assuming 4 bytes for int storage) and then 4008, 4012, and so on.



Now when we do operations like:

`arr[0] = 10;`

`arr[3] = 40;`


<img height="350" src="/src/main/resources/media/arrays_memory/arrays_memory3.jpg" width="474"/>

Java sees this as, arr -> 4000. so arr[0] is 0 integer away from 4000. That is 4000.
Java sees arr as 4000 because that is the value that is stored in the stack, now when
we use the [3] operator Java looks for the 3rd position, i.e 3*4 = 12 bytes away from
4000 i.e 4012. So arr[3] represents the 4012 memory block. Which is the 4th block.
That's why array indexing starts at 0 and not 1.

***

### Big-O Values for Array Operations
| **Operation**                                    | **Time Complexity** |
|--------------------------------------------------|---------------------|
| Retrieve with index                              | O(1)                |
| Retrieve without index                           | O(n)                |
| Add an element to a full array                   | O(n)                |
| Add an element to the end of an array(has space) | O(1)                |
| Insert or update an element at a specific index  | O(1)                |
| Delete an element by setting it to full          | O(1)                |
| Delete an element by shifting elements           | O(n)                |
