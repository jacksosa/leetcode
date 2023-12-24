# LeetCode Java Solutions

This Java Maven project contains solutions to various LeetCode problems. Each solution is implemented as a separate Java class within the `uk.co.trinitylogic.leetcode.soultions` package.

## Project Structure

The project structure is organized as follows:

├── src
│ ├── main
│ │ └── java
│ │ └── uk
│ │ └── co
│ │ └── trinitylogic
│ │ └── leetcode
│ │ └── soultions
│ │ ├── SolutionLengthOfLastWord58.java
│ │ ├── SolutionAnotherProblem.java
│ │ └── ...
│ └── test
│ └── java
│ └── uk
│ └── co
│ └── trinitylogic
│ └── leetcode
│ └── soultions
│ ├── SolutionLengthOfLastWord58Test.java
│ ├── SolutionAnotherProblemTest.java
│ └── ...
├── target
├── .gitignore
├── pom.xml
└── README.md


## LeetCode Solution Classes

- Solutions are implemented as separate Java classes in the `uk.co.trinitylogic.leetcode.soultions` package.

- Each class follows the naming convention `Solution<Problem Name><Number>.java`.

## Test Cases

- Test cases for each solution are included in the `test` folder with corresponding test classes, e.g., `SolutionLengthOfLastWord58Test.java` and `SolutionAnotherProblemTest.java`.

- Use these test cases to verify the correctness of your solutions.

## Usage

To run a specific LeetCode solution:

```bash
mvn clean install
java -cp target/your-artifact-id-1.0-SNAPSHOT.jar uk.co.trinitylogic.leetcode.soultions.SolutionLengthOfLastWord58
```

Replace your-artifact-id with the actual artifact ID specified in your pom.xml file.

Contributing
Feel free to contribute by adding new solutions or improving existing ones. Create a pull request with your changes.

License
This project is licensed under the MIT License - see the LICENSE file for details.
