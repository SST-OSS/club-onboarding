import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public String solve(String[] arr, int k) {
        HashMap<String, Integer> stringCount = new HashMap<>();
        HashSet<String> distinctStrings = new HashSet<>();
        for (String str : arr) {
            stringCount.put(str, stringCount.getOrDefault(str, 0) + 1);
        }
        for (String str : arr) {
            if (stringCount.get(str) == 1) {
                distinctStrings.add(str);
                if (distinctStrings.size() == k) {
                    return str;
                }
            }
        }

        return "";

    }
}