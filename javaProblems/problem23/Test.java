import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Solution solution = new Solution();

        String[] names = { "Alice", "Bob", "Charlie" };
        int[] heights = { 150, 180, 170 };

        String[] expectedOutput = { "Bob", "Charlie", "Alice" };
        String[] ans = solution.solve(names, heights);

        if (!Arrays.equals(ans, expectedOutput)) {
            logger.log(Level.SEVERE, "Wrong solution!");
            System.exit(1);
        }

        String[] names1 = { "Eve", "Mallory", "Oscar" };
        int[] heights1 = { 160, 155, 165 };

        String[] expectedOutput1 = { "Oscar", "Eve", "Mallory" };
        String[] ans1 = solution.solve(names1, heights1);

        if (!Arrays.equals(ans1, expectedOutput1)) {
            logger.log(Level.SEVERE, "Wrong solution!");
            System.exit(1);
        }

        System.out.print("Testcases passed!");
    }
}
