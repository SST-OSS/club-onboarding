import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Solution solveSolution = new Solution();

        int[] arg1 = {7,5,6,8,3};
        int ans = solveSolution.solve(arg1);
        int actualAns = 1;
        
        if (ans != actualAns) {
            logger.log(Level.SEVERE, "Wrong solution!");
            System.exit(1);
        }
        
        System.out.print("Testcase passed!");
    }
}
