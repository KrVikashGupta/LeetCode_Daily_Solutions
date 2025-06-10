import java.util.*;

public class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int odd = 0;
        int even = s.length();
        for (int n : freq) {
            if ((n & 1) == 1) {
                odd = Math.max(odd, n);
            } else if (n != 0) {
                even = Math.min(even, n);
            }
        }

        return odd - even;
    }
}
