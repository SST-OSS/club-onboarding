import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public void testReverseNumberDigits() {
        assertEquals("Testing with 12345", "5\n4\n3\n2\n1\n", getReversedDigitsOutput(12345));
        assertEquals("Testing with 987654321", "1\n2\n3\n4\n5\n6\n7\n8\n9\n", getReversedDigitsOutput(987654321));
        assertEquals("Testing with 0", "0\n", getReversedDigitsOutput(0));
        assertEquals("Testing with a negative number -123", "3\n2\n1\n", getReversedDigitsOutput(-123));
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
    private String getReversedDigitsOutput(int n) {
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));
        ReverseNumberDigits.main(null);
        return outContent.toString();
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
