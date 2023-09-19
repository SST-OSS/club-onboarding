public class Solution {
    public int solve(String A) {
        //This variable keeps the count of occurrences of 'G' in the string.
        int count = 0; 

        //This variable keeps the count of occurrences of 'AG' in the string. 
        int ans = 0; 

        // We will traverse the string from the 'last index' to the '0th index', and as soon as we find the character 'A', we will add the 'count' variable to the variable 'ans'. Thus, at the end, the variable : 'ans' will give us the total number of substrings 'AG' present in the given string.

        for(int i = A.length()-1; i >= 0; i--)
        {
            if(A.charAt(i) == 'G')
            {
                count++;
            }
            if(A.charAt(i) == 'A')
            {
                ans += count;
            }
        }
        return ans;
    }
}