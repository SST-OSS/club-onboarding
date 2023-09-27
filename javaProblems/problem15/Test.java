import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Solution solution = new Solution();

        int testCase1 = 3; // The third prime number is 5
        int expectedOutput1 = 5;
        int ans1 = solution.solve(testCase1);

        if (ans1 != expectedOutput1) {
            logger.log(Level.SEVERE, "Wrong solution for testcase 1!");
            System.exit(1);
        }

        int testCase2 = 5; // The fifth prime number is 11
        int expectedOutput2 = 11;
        int ans2 = solution.solve(testCase2);

        if (ans2 != expectedOutput2) {
            logger.log(Level.SEVERE, "Wrong solution for testcase 2!");
            System.exit(1);
        }

        System.out.print("Testcases passed!");
    }
}
