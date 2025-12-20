import java.util.*;
/*
YAHYA EFE KURUCAY 20220808005
*/
public class G2W3Q1 {
    
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        Integer[] unique = new Integer[freq.size()];
        int idx = 0;
        for (Integer key : freq.keySet()) {
            unique[idx++] = key;
        }

        if (k >= unique.length) {
            int[] all = new int[unique.length];
            for (int i = 0; i < unique.length; i++) {
                all[i] = unique[i];
            }
            return all;
        }

        quickSelect(unique, 0, unique.length - 1, unique.length - k, freq);

        int[] result = new int[k];
        for (int i = unique.length - k, j = 0; i < unique.length; i++, j++) {
            result[j] = unique[i];
        }
        return result;
    }

    private static void quickSelect(Integer[] arr, int left, int right, int k, Map<Integer, Integer> freq) {
        if (left >= right) return;

        int pivotIndex = partition(arr, left, right, freq);

        if (pivotIndex == k) return;
        if (pivotIndex > k) quickSelect(arr, left, pivotIndex - 1, k, freq);
        else quickSelect(arr, pivotIndex + 1, right, k, freq);
    }

    private static int partition(Integer[] arr, int left, int right, Map<Integer, Integer> freq) {
        int pivotFreq = freq.get(arr[right]);
        int i = left;
        for (int j = left; j < right; j++) {
            if (freq.get(arr[j]) < pivotFreq) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        
        
        int temp = arr[i];
        arr[i] = arr[right];
        arr[right] = temp;
        return i;
    }

    private static void runScenario(String title, int[] nums, int k, int[] expectedOrNull) {
        int[] ans = topKFrequent(nums, k);
        System.out.println("=== " + title + " ===");
        System.out.println("nums = " + Arrays.toString(nums) + ", k = " + k);
        System.out.println("TopK = " + Arrays.toString(ans));
        if (expectedOrNull != null) {
            boolean ok = equalsIgnoreOrder(ans, expectedOrNull);
            System.out.println("Matches expected (order-free)? " + ok
                    + "  Expected: " + Arrays.toString(expectedOrNull));
        }
        System.out.println();
    }
    private static boolean equalsIgnoreOrder(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) return false;
        int[] aa = a.clone(), bb = b.clone();
        Arrays.sort(aa); Arrays.sort(bb);
        return Arrays.equals(aa, bb);
    }

    public static void main(String[] args) {
        runScenario("Scenario 1 (PDF)", new int[]{1,1,1,2,2,3}, 2, new int[]{1,2});
        runScenario("Scenario 2 (PDF)", new int[]{1}, 1, new int[]{1});
        runScenario("Scenario 3 (PDF)", new int[]{1,2,1,2,1,2,3,1,3,2}, 2, new int[]{1,2});
        runScenario("Ties > k", new int[]{1,2,1,2,1,2,3,4}, 2, new int[]{1,2});
        runScenario("k > unique", new int[]{5,5,6}, 5, new int[]{5,6});
        runScenario("Negatives & zeros", new int[]{0,-1,-1,-2,-2,-2}, 2, new int[]{-2,-1});
        runScenario("Random-ish", new int[]{7,7,7,8,8,9,10,10,10,10}, 3, new int[]{10,7,8});
    }
}



