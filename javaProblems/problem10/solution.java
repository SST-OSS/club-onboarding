import java.util.ArrayList;

public class solution {
    public int Solve(int[] A) {
        ArrayList<Integer> uniqEleArr = new ArrayList<>();
        int backEle = A[0];
        uniqEleArr.add(backEle);
        for (int i : A){
            if (i != backEle){
                backEle = i;
                uniqEleArr.add(backEle);
            }

        }
        int uniqCount = uniqEleArr.size();
        return uniqCount;
    }
}