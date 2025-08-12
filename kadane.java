/*
leetcode links  https://leetcode.com/problems/maximum-subarray/description/
@vikashkumargupta
*/

public class kadane {
    
/* Problem Description

Given an integer array nums, find the 
subarray
 with the largest sum, and return its sum.

 Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104

Solution : */

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0; // Handle the case when the input array is empty.
        }

        int cs = nums[0]; // Current sum
        int ms = nums[0]; // Maximum sum

        for (int i = 1; i < nums.length; i++) {
            cs = Math.max(nums[i], cs + nums[i]);
            ms = Math.max(ms, cs);
        }

        return ms;
    }

    public static void main(String[] args) {
        int[] nums = {-1};
        Solution solution = new Solution();
        int result = solution.maxSubArray(nums);
        System.out.println("Max subarray sum is: " + result);
    }
}

/* Complexity Analysis : 
Time complexity: |O(n)|
Space complexity:|O(1)|

*/ 
