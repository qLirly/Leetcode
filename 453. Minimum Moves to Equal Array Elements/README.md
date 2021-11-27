# 453

## [Minimum Moves to Equal Array Elements](https://leetcode.com/problems/minimum-moves-to-equal-array-elements/)

### Problem
Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.

### Solution

##### Time Complexity: O(n)
##### Memory Complexity: O(1)

This problem can be thought of graphically as a bar graph. The mass of the function can be separated into two parts:
1) A rectangular section at the bottom representing the mass of each element that falls underneath the minimum value of any element
2) The difference between the element's value and that minimum value

Since we only care about the relative value of each element, we will need to disregard the rectangular section for our solution. We also notice that raising every element but one has the same relative effect as subtracting 1 from that element. Therefore, the minimum number of moves to equal the array elements is the same as the minimum number of moves to reduce each element to the minimum value in the array, which is simply the sum of the 2nd value above.

As such, two equivalent equations can be used here: (a + b + c + ...) - (n * minValue) = (a - minValue) + (b - minValue) + ..., which corresponds to a single pass or two pass method, respectively. The first option -- adding the total sum of the elements up and then afterwards removing the total area that falls below the minimum -- will be presented here.
