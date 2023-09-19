public class Solution {
    public int solve(String A) {
	    int ans=0;
	    int gfreq=0;
	    for(int i=A.length()-1;i>=0;i++){
		    if(A.charAt(i)=='G'){
		    gfreq++;
		    }else if(A.charAt(i)=='A'){
		    ans+=gfreq;
		    }
	    }
	     return ans;
    }
}
