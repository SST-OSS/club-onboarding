import java.util.*;

public class Solution {
    public int solve(int A, int[] H) {

    	HashMap<Integer,Integer> frequency = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < H.length; i++)
        {
            if(frequency.containsKey(H[i]))
            {
                int freq = frequency.get(H[i]);
                frequency.put(H[i], freq+1);
            }
            else{
                frequency.put(H[i], 1);
            }
        }

        for(int i : frequency.keySet())
        {
            if(frequency.get(i) == A)
            {
                ans.add(i);
            }
        }

        if(ans.size() == 0)
        {
            return -1;
        }

        int sum = 0;
        
        for(int i : ans)
        {
            sum += i;
        }

        return sum;    
    }
}
