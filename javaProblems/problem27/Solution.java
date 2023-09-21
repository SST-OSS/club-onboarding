public class Solution {
    public String solve(String s) {
        String[] words = s.split(" ");
        int n = words.length;
        String[] originalWords = new String[n];

        for (String word : words) {
            int position = Integer.parseInt(word.replaceAll("[^0-9]", "")) - 1;
            originalWords[position] = word.replaceAll("[0-9]", "");
        }
        StringBuilder original = new StringBuilder();
        for (String word : originalWords) {
            original.append(word).append(" ");
        }
        return original.toString().trim();

    }
}
