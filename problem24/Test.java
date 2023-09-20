import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Arrays;

public class SolutionTest {

    @Test
    public void testCommonChars() {
        Solution solution = new Solution();

        // Test case 1: Example test case
        String[] input1 = {"bella", "label", "roller"};
        List<String> expected1 = Arrays.asList("e", "l", "l");
        List<String> result1 = solution.commonChars(input1);
        assertEquals(expected1, result1);

        // Test case 2: All strings have the same characters
        String[] input2 = {"abcde", "abcde", "abcde"};
        List<String> expected2 = Arrays.asList("a", "b", "c", "d", "e");
        List<String> result2 = solution.commonChars(input2);
        assertEquals(expected2, result2);

        // Test case 3: No common characters
        String[] input3 = {"abc", "def", "xyz"};
        List<String> expected3 = Arrays.asList();
        List<String> result3 = solution.commonChars(input3);
        assertEquals(expected3, result3);

        // Test case 4: Empty input
        String[] input4 = {};
        List<String> expected4 = Arrays.asList();
        List<String> result4 = solution.commonChars(input4);
        assertEquals(expected4, result4);

        // Add more test cases as needed
    }
}
