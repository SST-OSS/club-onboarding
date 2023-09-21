import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Solution solution = new Solution();

        // Test case 1: Example test case
        String[] input1 = {"bella", "label", "roller"};
        ArrayList<String> expected1 = new ArrayList<>(Arrays.asList("e", "l", "l"));
        ArrayList<String> result1 = solution.solve(input1);
        if (!expected1.equals(result1)) {
            logger.log(Level.SEVERE, "Test case 1 failed!");
            System.exit(1);
            throw new Exception("Test case 1 failed!");
        }

        // Test case 2: Add more test cases here

        // All test cases passed
        System.out.print("All test cases passed!");
    }
}
