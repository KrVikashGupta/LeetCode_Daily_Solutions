/*
201. Bitwise AND of Numbers Range
@vikash kumar gupta
*/
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
          int rightShiftCnt = 0;
          while(left != right){
              left = left >> 1;
              right = right >> 1;
              rightShiftCnt++;
          }
          int commonPref = (right << rightShiftCnt);
          return commonPref;
    }
}
