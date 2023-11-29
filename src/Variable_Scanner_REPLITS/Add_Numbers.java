package Variable_Scanner_REPLITS;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Add_Numbers {

    public static void main(String[] args) {
        //WRITE CODE BELOW
        /*
         * 1. Create scanner object
         * Scanner input = new Scanner(System.in);
         * */

        char grade = 'B';
        //logical && or ||?
        //not comparing values (&&)...its either or...so logical or ||
        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D';

        System.out.println(passedTheExam);
    }
}

/*
* ### It is finally time for you to use Scanner yourself!
### You will be accepting 3 numbers from the console (Using Scanner) and adding them together


- Declare four `int` variables: `num1, num2, num3, sum`

- Create a `Scanner` object named `scan`

#### Your program should follow this flow:

- Console shows: Enter 3 numbers:
> Using Scanner take three inputs from the console and store the values into your variables num1, num2, and num3

- Add the three numbers and assign the result to the `sum` variable

- Finally, print the following:

```
 Sum of numbers: $ValueOfSum
```

```
Ex:

    Enter 3 numbers:
      4
      6
      2
    Sum of numbers: 12
```

Main topics: variables, primitive datatypes, Scanner, concatenation, operators
* */