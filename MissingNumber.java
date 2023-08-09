/* ## Problem Descriptions.

Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

## Code Solution */

import java.util.*;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int result;
        int n = nums.length;

        result = n*(n+1)/2;
        int count =0;
        for(int i=0; i<nums.length; i++){
            count+=nums[i];
        }
        return result-count;
    }
}

/* Complexity Analysis : 

Time complexity: O(n)
Space complexity: O(1)
*/