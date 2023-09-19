public class Solution {
    public int[] solve(int[] A) {
            for(int i=0;i<A.length/2;i++){
		    int temp = A[i];
		    A[i] = A[A.length-1-i];
		    A[A.length-1-i]=temp;
	    }    
	    return A;
    }
}
