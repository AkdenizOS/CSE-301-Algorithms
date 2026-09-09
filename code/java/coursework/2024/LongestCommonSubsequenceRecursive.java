public class LongestCommonSubsequenceRecursive {
    public static int lcsRecursive(String X, String Y, int m, int n) {
        // Base case: If either of the strings is empty, the LCS is empty.
        if (m == 0 || n == 0) {
            return 0;
        }

        // If the last characters of both strings match, we have a common element.
        if (X.charAt(m - 1) == Y.charAt(n - 1)) {
            return 1 + lcsRecursive(X, Y, m - 1, n - 1);
        } else {
            // If the last characters do not match, we have two choices:
            // 1. Exclude the last character of the first string and find LCS of the remaining strings.
            // 2. Exclude the last character of the second string and find LCS of the remaining strings.
            return Math.max(lcsRecursive(X, Y, m, n - 1), lcsRecursive(X, Y, m - 1, n));
        }
    }

    public static void main(String[] args) {
        String X = "AGGTAB";
        String Y = "GXTXAYB";
        int result = lcsRecursive(X, Y, X.length(), Y.length());
        System.out.println("Length of LCS: " + result);
    }
}

