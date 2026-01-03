import java.util.*;

public class G3W2Q1 {
    public static int[][] getSkylineDivideConquer(int[][] buildings) {
        if (buildings == null) throw new IllegalArgumentException("buildings must not be null");
        if (buildings.length == 0) return new int[0][0];

        int[][] sorted = Arrays.stream(buildings).map(int[]::clone).toArray(int[][]::new);
        Arrays.sort(sorted, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            if (a[1] != b[1]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[2], b[2]);
        });

        List<int[]> skyline = solve(sorted, 0, sorted.length);
        int[][] res = new int[skyline.size()][2];
        for (int i = 0; i < skyline.size(); i++) res[i] = skyline.get(i);
        return res;
    }

    private static List<int[]> solve(int[][] b, int lo, int hi) {
        if (hi - lo == 0) return new ArrayList<>();
        if (hi - lo == 1) {
            int L = b[lo][0], R = b[lo][1], H = b[lo][2];
            List<int[]> base = new ArrayList<>(2);
            base.add(new int[]{L, H});
            base.add(new int[]{R, 0});
            return base;
        }
        
    }

    private static void runScenario(String title, int[][] buildings, int[][] expectedOrNull) {
        int[][] ans = getSkylineDivideConquer(buildings);
        System.out.println("=== " + title + " ===");
        System.out.println("Buildings: " + deepToString(buildings));
        System.out.println("Skyline  : " + deepToString(ans));
        if (expectedOrNull != null) {
            System.out.println("Matches expected? " + deepEquals(ans, expectedOrNull)
                    + "  Expected: " + deepToString(expectedOrNull));
        }
        System.out.println();
    }

    private static boolean deepEquals(int[][] a, int[][] b) {
        if (a == null || b == null || a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) return false;
            for (int j = 0; j < a[i].length; j++) if (a[i][j] != b[i][j]) return false;
        }
        return true;
    }

    private static String deepToString(int[][] a) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < a.length; i++) {
            sb.append(Arrays.toString(a[i]));
            if (i + 1 < a.length) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        runScenario(
                "Scene 1 (Example)",
                new int[][]{
                        {2, 9, 10}, {3, 7, 15}, {5, 12, 12},
                        {15, 20, 10}, {19, 24, 8}
                },
                new int[][]{
                        {2, 10}, {3, 15}, {7, 12}, {12, 0}, {15, 10}, {20, 8}, {24, 0}
                }
        );
        runScenario(
                "Non-overlapping",
                new int[][]{ {1, 3, 2}, {4, 6, 3} },
                new int[][]{ {1, 2}, {3, 0}, {4, 3}, {6, 0} }
        );
        runScenario(
                "Nested",
                new int[][]{ {1, 10, 3}, {2, 9, 7}, {3, 8, 5} },
                new int[][]{ {1, 3}, {2, 7}, {9, 3}, {10, 0} }
        );
        runScenario(
                "Shared edges & equals",
                new int[][]{ {1, 5, 3}, {5, 9, 3}, {2, 6, 3} },
                new int[][]{ {1, 3}, {9, 0} }
        );
        runScenario("Single", new int[][]{ {5, 10, 6} }, new int[][]{ {5, 6}, {10, 0} });
        runScenario("Empty", new int[][]{}, new int[][]{});
    }
}