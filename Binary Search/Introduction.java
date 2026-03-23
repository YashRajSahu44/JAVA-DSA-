/*

Binary Search

Binary Search is a searching algorithm used to find the position of a target elements in a sorted arrays or list The key idea behind it..

--Binary Search jumps directly to the middle and eliminates half of an array in each steps.this makes it much easier and faster than linear search.

Algorithm 

arr = [-5 , -2 , -1 , 5 , 7 , 8 , 9]
Target = 7

Steps to use Binary search 

1. Find the mmiddle Element 

2. Check : if target > middle  = Search in right
           else = Search in left 

3. if target == middle = we found the element.

Middle Element = Start + (Start - end) / 2

Time complexity 

Best case = o(1)
Worst case = o(log n)

N = 2k By log 

log N = Klog2

K = logN
*/
