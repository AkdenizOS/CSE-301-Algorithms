class Fibonacci {

    public static void main(String[] args) {
        fibmemo();
    }

    public static void fibmemo() {
        int n = 10;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(fibmemo(n));
    }

    public static int fibmemo(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return memohelper(n, dp);
    }

    public static int memohelper(int n, int[] dp) {
        if ((n == 1) | (n == 0)) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = memohelper(n - 1, dp) + memohelper(n - 2, dp);
        return dp[n];
    }
}
