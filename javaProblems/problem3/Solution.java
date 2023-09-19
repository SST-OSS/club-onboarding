public class Solution {
    public int solve(int[] A, int B) {
        int count = 0;
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A.length; j++)
            {
                if(A[i] + A[j] == B)
                {
                    count++;
                }
            }
        }
        return count/2;
    }
}
