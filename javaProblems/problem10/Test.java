import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        solution solveSolution = new solution();

        int ansArr[] = new int[]{
                                
                                solveSolution.Solve(new int[]{0,0,1,1,1,2,2,3,3,4}),
                                solveSolution.Solve(new int[]{0,1,1,2,2,3,4,5,6,8,8,9}),
                                solveSolution.Solve(new int[]{1,2,3,4,5,7,8,9}),
                                solveSolution.Solve(new int[]{7,8,9,9}),
                                solveSolution.Solve(new int[]{0,1,1,4,5,5,6,7,7,8,9,9})
                            };
        int actualAnsArr[] = new int[]{5,9,8,3,8};
        
        for (int i = 0; i < ansArr.length;i++){
            if(ansArr[i] != actualAnsArr[i]){
                logger.log(Level.SEVERE, "Wrong solution!");
                // If the solution is incorrect, exit with status code 1.
                System.exit(1);
            }
        }
        System.out.print("Testcase passed!");
    }
}