public class LongestCommonSubsequence {
    public static String lcs(String X, String Y) {
        int m = X.length();
        int n = Y.length();
        
        // DP tablosu (m+1) x (n+1) boyutunda
        int[][] dp = new int[m + 1][n + 1];
        
        // DP tablosunu doldur
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // LCS'yi oluşturmak için geri izleme (backtracking)
        StringBuilder lcs = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            // Eğer karakterler eşleşirse LCS'ye ekle
            if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                lcs.append(X.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                // Üst hücre daha büyükse yukarı hareket et
                i--;
            } else {
                // Sol hücre daha büyükse sola hareket et
                j--;
            }
        }

        // LCS karakterlerini ters çevirmemiz gerekiyor
        return lcs.reverse().toString();
    }

    public static void main(String[] args) {
        String X = "AGGTAB";
        String Y = "GXTXAYB";
        
        String lcsResult = lcs(X, Y);
        System.out.println("Longest Common Subsequence: " + lcsResult);
        System.out.println("Length of LCS: " + lcsResult.length());
    }
}
