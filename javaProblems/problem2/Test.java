import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Solution solveSolution = new Solution();
        int[] ans = solveSolution.solve(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
        int[] actualAns = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        if (ans.length != 10) {
            logger.log(Level.SEVERE, "Wrong solution!");
            System.exit(1);
        }
        try {
            for (int i = 0; i < 10; i++) {
                if (ans[i] != actualAns[i]) {
                    logger.log(Level.SEVERE, "Wrong solution!");
                    System.exit(1);
                }
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Runtime error");
            System.exit(1);
            throw new Error("Runtime Error");
        }
        System.out.print("Testcase passed!");
    }
}
