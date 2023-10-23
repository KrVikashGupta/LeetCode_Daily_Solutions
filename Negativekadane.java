
// only negative maxsubarray element 
public class Negativekadane {
    public static int maxSum(int numbers[]) {
        int cs = numbers[0];
        int ms = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            cs = Math.max(numbers[i], cs + numbers[i]);
            ms = Math.max(ms, cs);
        }
        return ms;
    }
    public static void main(String args[]) {
        int numbers[] = {-5, -3, -3,-9, -8};
        int maxNegativeSum = maxSum(numbers);
        System.out.println("Max Subarray Sum Negative: " + maxNegativeSum);
    }
}
