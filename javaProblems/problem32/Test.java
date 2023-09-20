import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Solution solveSolution = new Solution();
        int ans = solveSolution.solve(12345); // Replace 12345 with the number you want to reverse
        if (ans != 54321) { // Replace 54321 with the expected reversed number
            logger.log(Level.SEVERE, "Wrong solution!");
            System.exit(1);
        }
        System.out.print("Testcase passed!");
    }

}
