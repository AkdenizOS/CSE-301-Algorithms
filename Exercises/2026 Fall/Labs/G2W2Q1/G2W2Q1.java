import java.util.*;

public class G2W2Q1 {

    public static long countRangeSum(int[] nums, long L, long R) {
        if (nums == null) throw new IllegalArgumentException("nums must not be null");
        int n = nums.length;
        
        long[] sums = new long[n + 1];
        for (int i = 0; i < n; i++) sums[i + 1] = sums[i] + nums[i];

        long[] tmp = new long[sums.length];
        return sortAndCount(sums, 0, sums.length, L, R, tmp);
    }

    private static long sortAndCount(long[] sums, int lo, int hi, long L, long R, long[] tmp) {
        
    }

    private static void runScenario(String title, int[] nums, int L, int R, long expectedOrNeg) {
        long ans = countRangeSum(nums, L, R);
        System.out.println("=== " + title + " ===");
        System.out.println("nums = " + Arrays.toString(nums) + " | L=" + L + " | R=" + R);
        System.out.println("Count: " + ans);
        if (expectedOrNeg >= 0) {
            System.out.println("Matches expected? " + (ans == expectedOrNeg) + "  Expected: " + expectedOrNeg);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        runScenario("Scenario 1 (PDF)", new int[]{-2, 5, -1}, -2, 2, 3);
        runScenario("Single in-range", new int[]{0}, 0, 0, 1);   
        runScenario("Single out", new int[]{5}, -2, 2, 0);
    }
}
