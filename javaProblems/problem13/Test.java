import java.util.Arrays;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Solution solution = new Solution();

        // Test case 1: Example test case
        int[] input1 = {1, 2, 3, 1};
        boolean expected1 = true;
        boolean result1 = solution.containsDuplicate(input1);
        if (expected1 != result1) {
            logger.log(Level.SEVERE, "Test case 1 failed!");
            System.exit(1);
            throw new Exception("Test case 1 failed!");
        }

        // Test case 2: Add more test cases here

        // All test cases passed
        System.out.print("All test cases passed!");
    }
}
