import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();

        for(int x : nums){
            if( set.contains(x) )
                    return true;
            else
                set.add(x);
        }

        return false;
        
    }
}
