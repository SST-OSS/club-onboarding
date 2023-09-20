import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) {
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

        if (gcd != 3 || lcm != 60) {
            logger.log(Level.SEVERE, "Wrong solution!");
            System.exit(1);
            throw new RuntimeException("Wrong solution!");
        }
        System.out.print("Testcase passed!");
    }
}
