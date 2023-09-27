import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Solution solution = new Solution();

        // Test case 1
        String haystack1 = "hello";
        String needle1 = "ll";
        int ans1 = solution.strStr(haystack1, needle1);
        if (ans1 != 2) {
            logger.log(Level.SEVERE, "Test Case 1: Wrong solution!");
            System.exit(1);
        }

        // Test case 2
        String haystack2 = "aaaaa";
        String needle2 = "bba";
        int ans2 = solution.strStr(haystack2, needle2);
        if (ans2 != -1) {
            logger.log(Level.SEVERE, "Test Case 2: Wrong solution!");
            System.exit(1);
        }

        System.out.print("All Testcases passed!");
    }
}
