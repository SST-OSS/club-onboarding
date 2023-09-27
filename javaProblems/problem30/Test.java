import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Solution solution = new Solution();

        int test1=2;

        boolean expectedOutput = true;
       boolean ans = solution.solve(test1);

        if (ans!=expectedOutput) {
            logger.log(Level.SEVERE, "Wrong solution!");
            System.exit(1);
        }

         int test2=3;

         expectedOutput = false;
        ans = solution.solve(test2);

        if (ans!=expectedOutput) {
            logger.log(Level.SEVERE, "Wrong solution!");
            System.exit(1);
        }

        System.out.print("Testcases passed!");
    }
}