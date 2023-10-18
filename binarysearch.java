/* 704. Binary Search
Problem Description 

Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1

Solution :  */

class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        // Step 1: Initialize the start and end indices to cover the entire array.
        while (start <= end) {
            // Step 2: Calculate the middle index mid to divide the search space in half.
            int mid = (start + end) / 2;

            // Step 3: Check if the element at index mid is equal to the target.
            if (nums[mid] == target) {
                // Step 4: If it is, return mid as the index of the target.
                return mid;
            } else if (nums[mid] < target) {
                // Step 5: If the element at mid is less than the target, update start.
                start = mid + 1;
            } else {
                // Step 6: If the element at mid is greater than the target, update end.
                end = mid - 1;
            }
        }
        // Step 7: Continue the loop until start is greater than end, indicating an empty search space.

        // Step 8: If the loop exits without finding the target, return -1 to indicate that the target is not present in the array.
        return -1;
    }
}


/*
Time Complexity:  |O(logn)|
Space Complexity: |O(1)|
*/