/* 7 Leetcode
Problem Description 
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Solution    */

class Solution {
    public int reverse(int x) {
       long rev=0;
        while(x!=0){
            rev=rev*10+(x%10);
            x=x/10;
        }
        if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE)
            return 0;
        return (int)rev;
    }
}

/*
Time Complexity:  O(n)
Space Complexity: O(1)
*/
