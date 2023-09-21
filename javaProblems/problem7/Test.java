import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Solution solveSolution = new Solution();
        boolean ans = solveSolution.solve(16);
        if (ans != true) {
            logger.log(Level.SEVERE, "Wrong solution!");
            System.exit(1);
        }
	boolean ans1 = solveSolution.solve(5);
        if (ans1 != false) {
            logger.log(Level.SEVERE, "Wrong solution!");
            System.exit(1);
        }
        System.out.print("Testcase passed!");
    }
}
