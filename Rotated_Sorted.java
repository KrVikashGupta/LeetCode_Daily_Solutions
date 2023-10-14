/* 33 leetcode  Search in Rotated Sorted Array

Problem Description
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
 

Constraints:

1 <= nums.length <= 5000
-104 <= nums[i] <= 104
All values of nums are unique.
nums is an ascending array that is possibly rotated.
-104 <= target <= 104

Solution */


class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;  // Calculate the middle index.

            if (nums[mid] == target) {
                return mid;  // If the middle element is the target, return its index.
            }

            if (nums[low] <= nums[mid]) {  // Check if the left half is sorted.
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;  // If the target is in the left half, update the 'high' i.
                } else {
                    low = mid + 1;  // Otherwise, search the right half.
                }
            } else {
                // If the left half is not sorted, it means the right half is sorted.
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;  // If the target is in the right half, update the 'low' index.
                } else {
                    high = mid - 1;  // Otherwise, search the left half.
                }
            }
        }

        return -1;  // If the target is not found, return -1.
    }
}

/*
Time Complexity:  O(log n)
Space Complexity: O(1)
*/
