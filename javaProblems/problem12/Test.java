import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Solution solution = new Solution();

        // Test case 1
        int n = 00000000000000000000000000001011;
        int ans1 = solution.solve(n);
        if (ans1 != 3) {
            logger.log(Level.SEVERE, "Test Case 1: Wrong solution!");
            System.exit(1);
        }

        // Test case 2
        int n2 = 00000000000000000000000010000000;
        int ans2 = solution.solve(n2);
        if (ans2 != 1) {
            logger.log(Level.SEVERE, "Test Case 2: Wrong solution!");
            System.exit(1);
        }

        System.out.print("All Testcases passed!");
    }
}
