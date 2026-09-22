import java.util.ArrayList;
import java.util.Random;
//@author->Mustafa Esen
//@number->2019080808008
public class Lab05_20190808008 {
    // cut method
    public static int cut(int[] A, int n) {
        /*I would show my recursive part and explain that. 
            I create all possibility and after 
            that i find the max value inside the all space and return the result.*/
        if (n == 0) {
            return 0;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(cut(A, n - (i + 1)) + A[i]);

        }
        return maxValue(list);

    }

    // Find the max value in the arraylist
    public static int maxValue(ArrayList<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
    // Generating random array
    public static int[] randomArrays(int length) {
        int[] randomArray = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            randomArray[i] = random.nextInt(101);
        }
        return randomArray;

    }

    // longest common substring method
    public static int longestString(String X, String Y, int m, int n) {
        /* I show the length of string but we can show the string .
            If we use string sum rather than int sum inside the method. Instead of an integer, we return a string.Example is below code.
            return " "+ X.charAt(m - 1);
            //Use empty string for adding the other characters
        */
        if (m == 0 || n == 0) {
            return 0;
        }
        if (X.charAt(m - 1) == Y.charAt(n - 1)) {
            return 1 + longestString(X, Y, m - 1, n - 1);
        } else {
            return Math.max(longestString(X, Y, m, n - 1), longestString(X, Y, m - 1, n));
        }
    }

    // Generating random string
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static String generateString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {

        // Try code
        for (int j = 0; j < 51; j = j + 10) {
            //Generate random array
            int[] A = randomArrays(j);
            int n = j / 2;
            // Info about the array
            System.out.println("For " + j + " length array and n:" + n);
            long start = System.currentTimeMillis();
            System.out.println(start);
            System.out.println(cut(A, n));
            long end = System.currentTimeMillis();
            System.out.println(end);
            long diff = end - start;
            // Info about the time difference
            System.out.println("Difference: " + diff);
            System.out.println("-----------------");
        }
        // Try the code
        for (int i = 0; i < 16; i = i + 2) {
            for (int j = 0; j < 16; j = j + 2) {
                String X = generateString(i);
                String Y = generateString(j);
                int m = X.length();
                int n = Y.length();
                // Info about the strings
                System.out.println("First String Length: " + i);
                System.out.println("Second String Length: " + j);
                long start = System.currentTimeMillis();
                System.out.println(start);
                int longestCommonSubstringLength = longestString(X, Y, m, n);
                // Info about the result
                System.out.println("Length of the longest common substring: " + longestCommonSubstringLength);
                long end = System.currentTimeMillis();
                System.out.println(end);
                long diff = end - start;
                // Info about the time difference
                System.out.println("Difference: " + diff);
                System.out.println("------------------");
            }
        }
    }
}
