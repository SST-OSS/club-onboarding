import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Sol solveSolution = new Sol();
        
        int ans[] = {solveSolution.solve(10),solveSolution.solve(100)};
        int actualAns[] = {27,648};


        for (int i = 0; i < ans.length;i++){
            if (ans[i] != actualAns[i]){
                logger.log(Level.SEVERE, "Wrong solution!");
                // If the solution is incorrect, exit with status code 1.
                System.exit(1);
            }
        }
        System.out.print("Testcase passed!");
    }
}