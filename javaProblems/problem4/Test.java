import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Solution solveSolution = new Solution();
        int ans = solveSolution.solve("ABCGAG");
        if (ans != 3) {
            logger.log(Level.SEVERE, "Wrong solution!");
            System.exit(1);
        }
        System.out.print("Testcase passed!");
    }
}
