import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test {
    public void testReverseNumberDigits() {
        assertEquals("Testing with 12345", "5\n4\n3\n2\n1\n", getReversedDigitsOutput(12345));
        assertEquals("Testing with 987654321", "1\n2\n3\n4\n5\n6\n7\n8\n9\n", getReversedDigitsOutput(987654321));
        assertEquals("Testing with 0", "0\n", getReversedDigitsOutput(0));
        assertEquals("Testing with a negative number -123", "3\n2\n1\n", getReversedDigitsOutput(-123));
    }
    private String getReversedDigitsOutput(int n) {
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));
        ReverseNumberDigits.main(null);
        return outContent.toString();
    }
}
