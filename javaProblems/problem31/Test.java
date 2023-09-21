import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Solution solveSolution = new Solution();
        int[] ans;
        try {
            ans = solveSolution.solve(12, 15);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Runtime error");
            System.exit(1);
            throw new Error("Runtime Error");
        }

        int gcd, lcm;
        try {
            gcd = ans[0];
            lcm = ans[1];
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Runtime error");
            System.exit(1);
            throw new Error("Runtime Error");
        }

        // Here implement the logic to compare the answer returned with the actual answers.
        if (gcd != 3 || lcm != 60) {
            logger.log(Level.SEVERE, "Wrong solution!");
            // If the solution is incorrect, exit with status code 1.
            System.exit(1);
        }
        System.out.print("Testcase passed!");
    }
}
