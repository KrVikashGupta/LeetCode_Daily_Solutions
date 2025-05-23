class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long sum = 0;
        List<Long> res = new ArrayList<>();
        for (int x : nums) {
            sum += x;
            long y = x ^ k;
            res.add(y - x);
        }
        Collections.sort(res, Collections.reverseOrder());
        for (int i = 0; i + 1 < res.size(); i += 2) {
            if (res.get(i) + res.get(i + 1) <= 0) {
                break;
            }
            sum += res.get(i) + res.get(i + 1);
        }
        return sum;
    }
}
