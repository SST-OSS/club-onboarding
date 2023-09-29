import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Solution solveSolution = new Solution();
        int input = 12345; 
        int expectedOutput = reverseNumber(input);

        int result = solveSolution.reverse(input);

        if (result == expectedOutput) {
            System.out.println("Testcase passed!");
        } else {
            logger.log(Level.SEVERE, "Testcase failed for input: " + input);
            System.exit(1);
        }
    }
    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
}
class Solution {
    public int reverse(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
}
