import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Solution solveSolution = new Solution();

        int arg = 16;
        int actualAns = true;
        
        try {
            int ans = solveSolution.solve(arg);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Runtime error");
            System.exit(1);
            throw new Error("Runtime Error");
        }
        if (actualAns != ans) {
            logger.log(Level.SEVERE, "Wrong solution!");
            System.exit(1);
            throw new Exception("Wrong solution!");
        }
        System.out.print("Testcase passed!");
    }
}
