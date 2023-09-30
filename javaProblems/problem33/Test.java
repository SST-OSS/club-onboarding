import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Solution solveSolution = new Solution();
        String ans;
        try {
            ans = solveSolution.solve(1994); // Example test case.
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Runtime error");
            System.exit(1);
            throw new Error("Runtime Error");
        }

        // Here implement the logic to compare the answer returned with the actual answers.
        if (!ans.equals("MCMXCIV")) {
            logger.log(Level.SEVERE, "Wrong solution!");
            // If the solution is incorrect, exit with status code 1.
            System.exit(1);
        }
        System.out.print("Testcase passed!");
    }
}
