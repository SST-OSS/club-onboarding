public class Solution {
    public int solve(String A) {
        for(int i = 0; i <= A.length()/2; i++)
	{
		if(A.charAt(i) != A.charAt(A.length()-1-i))
		{
			return 0;
		}
	}
	return 1;
    }
}
