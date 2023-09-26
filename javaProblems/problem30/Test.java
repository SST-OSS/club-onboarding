import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Solution solveSolution = new Solution();
        Boolean ans = solveSolution.divisorGame(3);
        // Here implement the logic to compare the answer returned with the actual answers.
        // The logic can be different based on the dataType.
        // For example: To compare strings we have to use the .equals() method rather than just using the equality operator.
        if (!ans) {
            logger.log(Level.SEVERE, "Wrong solution!");
            // If the solution is incorrect, exit with status code 1.
            System.exit(1);
        }
        System.out.print("Testcase passed!");
    }
}
