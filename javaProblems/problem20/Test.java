import java.util*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Solution solveSolution = new Solution();
        int N = 13; // Change N to the desired test case input
        String expectedOutput = "2, 3, 5, 7, 11, 13"; // Change to the expected output

        // Redirect standard output to capture the printed numbers
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the function to be tested
        solveSolution.printPrimeNumbers(N);

        // Restore standard output
        System.setOut(System.out);

        // Get the captured output
        String actualOutput = outputStream.toString().trim();

        // Compare the actual and expected outputs
        if (actualOutput.equals(expectedOutput)) {
            System.out.println("Testcase passed!");
        } else {
            logger.log(Level.SEVERE, "Wrong solution!");
            System.exit(1);
        }
    }
}

