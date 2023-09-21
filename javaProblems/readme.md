# Contributing to Java Problems

## Solving a problem

- Get yourself asigned to the issue, if the issue doesn't exist create it and ask someone to assign you.
- In your forked repository, create a new branch named `java-problem-x`
- Read the question carefully.
- To solve a question edit the `Solution.java` file in the problem directory.
- Make sure that you attempt only one question in a PR!
- Open a PR.
- [ **IMPORTANT!** ] Make sure that you add the `java-problem-solution` label in the PR, only then it will be considered, otherwise the PR will be closed without any comments!

## Adding a new problem

- You must first comment `/take` to claim the issue. Once you have been assigned the issue, you can start working on it.
- In your forked repository, create a new branched named `java-problem-x`.
- Read the question carefully.
- Create a new folder in the `javaProblems` directory with folderName `problemX`.
- First create a `readme.md` file inside the folder. The readme file should be very descriptive.
- You can follow this format for the `readme.md` file:

---

````
# Problem Title
problem description

```
# Example Input
A = [1, 2, 3]

# Example Output
[3, 2, 1]
```
````

---

- Then create a `Solution.java` file.
  You can follow this format for the `Solution.java` file:

```java
public class Solution {
    public returnType solve(paramType1, param1, ...) {
        return;
    }
}
```

- Add the appropriate return types and params according to the problem.
- Then create a `Test.java` file. You can follow this format for the `Test.java` file.

```java
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        Solution solveSolution = new Solution();
        returnType ans = solveSolution(arg1, arg2, ...);
        // Here implement the logic to compare the answer returned with the actual answers.
        // The logic can be different based on the dataType.
        // For example: To compare strings we have to use the .equals() method rather than just using the equality operator.
        if (ans != actualAns) {
            logger.log(Level.SEVERE, "Wrong solution!");
            // If the solution is incorrect, exit with status code 1.
            System.exit(1);
        }
        System.out.print("Testcase passed!");
    }
}
```
- Make sure that you create only one question in a PR!
- And also, don't put the actual solution in the `Solution.java` file only leave the boilerplate so that others can get a chance to solve the question.
- Open a PR.
- [ **IMPORTANT!** ] Make sure that you add the `java-problem-addition` label in the PR, only then it will be considered, otherwise the PR will be closed without any comments!
