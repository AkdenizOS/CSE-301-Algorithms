import java.util.*;
/*
*ALGORITHM GROUP2 WEEK6 QUESTION1
*YAHYA EFE KURUÇAY
*20220808005
*/
public class G2W6Q1 {

    public static boolean hasIncreasingTripletGreedy(int[] nums) {
        
        if(nums.length<3 ) return false;
        
        int firstVal = Integer.MAX_VALUE;
        int secondVal = Integer.MAX_VALUE;
        
        for(int num : nums){
            
            if(num <= firstVal){ firstVal = num;}
            else if ( num <= secondVal){ secondVal=num ; }
            else {return true;}
            
        }
        
        
        return false;
    }

    private static void runScenario(String title, int[] nums, boolean expected) {
        boolean ans = hasIncreasingTripletGreedy(nums);
        System.out.println("=== " + title + " ===");
        System.out.println("nums: " + Arrays.toString(nums));
        System.out.println("has triplet? " + ans);
        System.out.println("matches expected? " + (ans == expected) + "  expected: " + expected);
        System.out.println();
    }

    public static void main(String[] args) {
        runScenario("Scenario 1", new int[]{1, 2, 3, 4, 5}, true);
        runScenario("Scenario 2", new int[]{5, 4, 3, 2, 1}, false);
        runScenario("Scenario 3", new int[]{2, 1, 5, 0, 4, 6}, true);
    }
}