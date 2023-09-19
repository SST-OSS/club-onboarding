public class Solution {
    public int[] solve(int[] A) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int elem:A){
        if(min>elem)min=elem;
        if(max<elem)max=elem;
        }
        return new int[] {min,max};
    }
}