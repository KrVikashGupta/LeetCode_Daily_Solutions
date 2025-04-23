class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxSize = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0, num = i;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            maxSize = Math.max(maxSize, map.get(sum));
        }

        int count = 0;
        for (int val : map.values()) {
            if (val == maxSize) count++;
        }
        return count;
    }
}
