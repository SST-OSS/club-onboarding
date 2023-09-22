import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Solution solution = new Solution();

        // Test case 1
        String input1 = "is2 sentence4 This1 a3";
        String expectedOutput1 = "This is a sentence";
        String result1 = solution.solve(input1);

        if (!result1.equals(expectedOutput1)) {
            logger.log(Level.SEVERE, "Test case 1 failed!");
            System.exit(1);
        }

        // Test case 2
        String input2 = "Myself2 Me1 I4 and3";
        String expectedOutput2 = "Me Myself and I";
        String result2 = solution.solve(input2);

        if (!result2.equals(expectedOutput2)) {
            logger.log(Level.SEVERE, "Test case 2 failed!");
            System.exit(1);
        }

        System.out.println("All test cases passed!");
    }
}
