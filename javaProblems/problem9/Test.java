import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

public class Test {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Solution solveSolution = new Solution();

        // Test Case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = {0, 1};
        int[] result1 = solveSolution.twoSum(nums1, target1);
        if (compareArrays(result1, expected1)) {
            logger.log(Level.INFO, "Test Case 1 passed!");
        } else {
            logger.log(Level.SEVERE, "Test Case 1 failed!");
            System.exit(1);
        }

        // Test Case 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] expected2 = {1, 2};
        int[] result2 = solveSolution.twoSum(nums2, target2);
        if (compareArrays(result2, expected2)) {
            logger.log(Level.INFO, "Test Case 2 passed!");
        } else {
            logger.log(Level.SEVERE, "Test Case 2 failed!");
            System.exit(1);
        }

        // Add more test cases as needed...

        System.out.print("All test cases passed!");
    }

    // Helper function to compare two integer arrays
    private static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}

