public class RodCuttingRecursive {
    public static int cutRod(int[] price, int n) {
        if (n <= 0) {
            return 0;
        }
        
        int maxRevenue = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            maxRevenue = Math.max(maxRevenue, price[i] + cutRod(price, n - i - 1));
        }
        
        return maxRevenue;
    }

    public static void main(String[] args) {
        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
        int rodLength = 8;

        int maxRevenue = cutRod(price, rodLength);
        System.out.println("Maximum revenue: " + maxRevenue);
    }
}
