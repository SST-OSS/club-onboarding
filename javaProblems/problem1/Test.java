import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Solution solveSolution = new Solution();
        int[] ans = solveSolution.solve(new int[] { 2, 3, 4, 1, 1, 7, 8 });
        int min, max;
        try {
            min = ans[0];
            max = ans[1];
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Runtime error");
            System.exit(1);
            throw new Error("Runtime Error");
        }
        if (min != 1 || max != 8) {
            logger.log(Level.SEVERE, "Wrong solution!");
            System.exit(1);
            throw new Exception("Wrong solution!");
        }
        System.out.print("Testcase passed!");
    }
}
