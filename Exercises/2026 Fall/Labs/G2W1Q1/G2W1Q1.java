import java.util.Arrays;

// ALGORITHM LAB W1Q1 - 26.09.2025
// Yahya Efe Kuruçay - 20220808005
// https://efekurucay.com
public class G2W1Q1 {

    public static void weaveTapestryInsertionSort(int[] importance, int[] flux) {
       for ( int i =1 ; i < importance.length ; i++ ){
           
           int importance_key= importance[i];
           int flux_key= flux[i]; 
           int j = i-1 ;
          int paradox_cost=0;
          
          
          while ( j>=0 && importance[j]>importance_key){
              
              paradox_cost += importance[j]-importance_key;
              flux_key = flux_key- paradox_cost;
              importance[j+1]=importance[j];
              flux[j+1]=flux[j];
              j--;
              
          }
          importance[j+1]=importance_key;
          flux[j+1]=flux_key;
       }

   
    }

    // ---------- Test helpers ----------
    private static void runScenario(String title, int[] imp, int[] flx,
                                   int[] expectedImpOrNull, int[] expectedFlxOrNull) {
        int[] a = Arrays.copyOf(imp, imp.length);
        int[] b = Arrays.copyOf(flx, flx.length);

        weaveTapestryInsertionSort(a, b);

        System.out.println("=== " + title + " ===");
        System.out.println("Input  Importance: " + Arrays.toString(imp));
        System.out.println("Input  Flux      : " + Arrays.toString(flx));
        System.out.println("Output Importance: " + Arrays.toString(a));
        System.out.println("Output Flux      : " + Arrays.toString(b));

        if (expectedImpOrNull != null) {
            System.out.println("Matches expected importance? "
                    + Arrays.equals(a, expectedImpOrNull)
                    + "  Expected: " + Arrays.toString(expectedImpOrNull));
        }
        if (expectedFlxOrNull != null) {
            System.out.println("Matches expected flux? "
                    + Arrays.equals(b, expectedFlxOrNull)
                    + "  Expected: " + Arrays.toString(expectedFlxOrNull));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        runScenario(
                "Scene 1 (Chronomancer Example)",
                new int[]{60, 25, 40},
                new int[]{10, 20, 15},
                new int[]{25, 40, 60},
                new int[]{-15, -5, 10}
        );

        runScenario(
                "Already Sorted",
                new int[]{1, 2, 3, 4, 5},
                new int[]{9, 8, 7, 6, 5},
                new int[]{1, 2, 3, 4, 5},
                new int[]{9, 8, 7, 6, 5}
        );

        runScenario(
                "Strictly Descending",
                new int[]{9, 7, 5, 3, 1},
                new int[]{10, 10, 10, 10, 10},
                null, // we just inspect results
                null
        );

        runScenario(
                "With Duplicates (Stable)",
                new int[]{5, 5, 2, 5, 2},
                new int[]{1, 2, 3, 4, 5},
                null,
                null
        );

        runScenario(
                "Negatives & Zeros",
                new int[]{0, -3, 2, -1},
                new int[]{5, 5, 5, 5},
                null,
                null
        );

        runScenario(
                "Large Gaps",
                new int[]{1000, 1, 500, 2},
                new int[]{0, 0, 0, 0},
                null,
                null
        );
    }
}
