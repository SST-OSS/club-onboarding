import java.util.Arrays;

public class Solution {
    public String[] solve(String[] names, int[] heights) {
        int n = names.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> Integer.compare(heights[b], heights[a]));
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = names[indices[i]];
        }

        return result;
    }
}
