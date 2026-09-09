import java.util.;

public class G4W4Q1 {

    public static int[][] buildSpecialGridDivideConquer(int n) {
        if (n  0) throw new IllegalArgumentException(n must be non-negative);
        int size = 1  n;
        int[][] g = new int[size][size];
        fill(g, 0, 0, size, 0);
        return g;
    }
    
    private static void fill(int[][] g, int r, int c, int size, int base) {
    
    }
    
    private static void runScenario(String title, int n, int[][] expectedOrNull) {
        int[][] ans = buildSpecialGridDivideConquer(n);
        System.out.println(===  + title +  ===);
        System.out.println(n =  + n);
        System.out.println(Gridn + pretty(ans));
        if (expectedOrNull != null) {
            System.out.println(Matches expected  + deepEquals(ans, expectedOrNull));
        }
        System.out.println();
    }
    
    private static boolean deepEquals(int[][] a, int[][] b) {
        if (a == null  b == null  a.length != b.length) return false;
        for (int i = 0; i  a.length; i++) {
            if (a[i].length != b[i].length) return false;
            for (int j = 0; j  a[i].length; j++) if (a[i][j] != b[i][j]) return false;
        }
        return true;
    }
    
    private static String pretty(int[][] a) {
        StringBuilder sb = new StringBuilder();
        for (int[] row  a) sb.append(Arrays.toString(row)).append('n');
        return sb.toString();
    }
    
    public static void main(String[] args) {
        runScenario(Scenario 1, 1,
                new int[][]{
                        {3, 0},
                        {2, 1}
                });
        runScenario(Scenario 2, 2,
                new int[][]{
                        {15, 12, 3, 0},
                        {14, 13, 2, 1},
                        {11, 8, 7, 4},
                        {10, 9, 6, 5}
                });
        runScenario(Scenario 0, 0,
                new int[][]{{0}});
    }

}
