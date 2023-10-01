import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Solution solution = new Solution();
        long result;
        
        // Test 1
        try {
            result = solution.sumPrimes(10);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Runtime error");
            System.exit(1);
            throw new Error("Runtime Error");
        }
        if (result != 17) {
            logger.log(Level.SEVERE, "Wrong solution! Expected: 17, Got: " + result);
            System.exit(1);
        }
        
        // Test 2
        try {
            result = solution.sumPrimes(20);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Runtime error");
            System.exit(1);
            throw new Error("Runtime Error");
        }
        if (result != 77) {
            logger.log(Level.SEVERE, "Wrong solution! Expected: 77, Got: " + result);
            System.exit(1);
        }
        
        // Test 3
        try {
            result = solution.sumPrimes(30);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Runtime error");
            System.exit(1);
            throw new Error("Runtime Error");
        }
        if (result != 129) {
            logger.log(Level.SEVERE, "Wrong solution! Expected: 129, Got: " + result);
            System.exit(1);
        }
        
        System.out.print("All test cases passed!");
    }
}
