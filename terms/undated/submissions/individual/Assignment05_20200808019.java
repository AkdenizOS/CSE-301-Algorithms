import java.util.Random;

/**
 * Assignment05
 * 20200808019
 * İbrahim Duman
 */
public class Assignment05_20200808019 {
    public static void main(String[] args) {
        int rodLength = 4;
        int[] arr4 = { 1, 5, 8, 9, 10, 17, 17, 20, 24, 30 };
        System.out.println("Rod for n = 4 --> " + cutRod(arr4, rodLength));
        int[] array10 = generateRandomArray(10);
        int[] array100 = generateRandomArray(15);
        int[] array1000 = generateRandomArray(20);

        System.out.println("\t\t\tCUTTING ROD TIME COMPLEXITY ANALYSIS");
        calculateTimeComplexityforCutting(array10, rodLength, array10.length);
        calculateTimeComplexityforCutting(array100, rodLength, array100.length);
        calculateTimeComplexityforCutting(array1000, rodLength, array1000.length);

        System.out.println("\t--------------------------------------------------------------------");

        System.out.println("\n\t\t\tLONGEST COMMON SUBSEQUENCE TIME COMPLEXITY ANALYSIS");
        String str1 = getRandomString(10);
        String strNew1 = getRandomString(10);
        String str2 = getRandomString(15);
        String strNew2 = getRandomString(15);
        String str3 = getRandomString(20);
        String strNew3 = getRandomString(20);
        calculateTimeComplexityforLCS(str1, strNew1, str1.length(), strNew1.length());
        calculateTimeComplexityforLCS(str2, strNew2, str2.length(),
                strNew2.length());
        calculateTimeComplexityforLCS(str3, strNew3, str3.length(),
                strNew3.length());

    }

    private static void calculateTimeComplexityforCutting(int[] array, int rodLength, int arraySize) {
        long startTime = System.nanoTime();
        cutRod(array, rodLength);
        long endTime = System.nanoTime();
        System.out.println(
                "\t\tWhen Array Size is " + arraySize + " Time Complexity --> "
                        + (endTime - startTime) + " nanoseconds");

    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    private static void calculateTimeComplexityforLCS(String str1, String str2, int lengthofStr1, int lengthofStr2) {
        long startTime = System.currentTimeMillis();
        int result = longestCommonSequence(str1, str2, lengthofStr1, lengthofStr2);
        long endTime = System.currentTimeMillis();
        System.out.println(
                "\t\tCommon string is " + printLCSS(str1, str2, 0, 0)
                        + "\n\t\tLength of LCS is "
                        + result + " Time Complexity --> "
                        + (endTime - startTime) + " milliseconds");

    }

    public static int cutRod(int[] prices, int n) {
        if (n == 0) {
            return 0;
        }
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            maxProfit = Math.max(maxProfit, prices[i - 1] + cutRod(prices, n - i));
            // System.out.println(maxProfit);
        }
        return maxProfit;
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size); // Generates random integers between 0 and 99
        }

        return array;
    }

    public static int longestCommonSequence(String X, String Y, int m, int n) {
        if (m == 0 || n == 0)
            return 0;
        if (X.charAt(m - 1) == Y.charAt(n - 1))
            return 1 + longestCommonSequence(X, Y, m - 1, n - 1);
        else
            return Math.max(longestCommonSequence(X, Y, m, n - 1),
                    longestCommonSequence(X, Y, m - 1, n));
    }

    public static String printLCSS(String s1, String s2, int i, int j) {
        if (i == s1.length() || j == s2.length()) {
            return "";
        }

        if (s1.charAt(i) == s2.charAt(j)) {
            return s1.charAt(i) + printLCSS(s1, s2, i + 1, j + 1);
        } else {
            String lcss1 = printLCSS(s1, s2, i + 1, j);
            String lcss2 = printLCSS(s1, s2, i, j + 1);
            return lcss1.length() > lcss2.length() ? lcss1 : lcss2;
        }
    }

    private static String getRandomString(int n) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index = (int) (str.length()
                    * Math.random());
            sb.append(str
                    .charAt(index));
        }
        return sb.toString();
    }
}