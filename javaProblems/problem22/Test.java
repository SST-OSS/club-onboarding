import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Solution solution = new Solution();

        // Test case 1
        String[] arr1 = {"apple", "banana", "apple", "orange", "banana", "grape"};
        int k1 = 2;
        String expectedOutput1 = "grape";
        String result1 = solution.solve(arr1, k1);
        if (!expectedOutput1.equals(result1)) {
            logger.log(Level.SEVERE, "Wrong solution for testcase 1!");
            System.exit(1);
        }
        
        // Test case 2
        String[] arr2 = {"a", "b", "a", "c", "d", "e", "e"};
        int k2 = 3;
        String expectedOutput2 = "d";
        String result2 = solution.solve(arr2, k2);
        if (!expectedOutput2.equals(result2)) {
            logger.log(Level.SEVERE, "Wrong solution for testcase 2!");
            System.exit(1);
        }

        // Add more test cases as needed
        
        System.out.print("Testcases passed!");
    }
}
