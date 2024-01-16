package QuizzesAnswers;

public class SelectionStatements {

    public static void main(String[] args) {

        //Question 2.
        int x = 5;
        x = --x + -x++ + ++x - -x;
        System.out.println(x);

        /*
        In this code, we have a variable x assigned the value 5. Then, we have a complex calculation that modifies the value of x using prefix and postfix increment and decrement operators. Let's break it down:

                --x : This decrements the value of x by 1 before using it in the calculation, so x becomes 4.
                -x++ : This takes the current value of x, negates it, and then increments x by 1. So, it becomes -4, and x becomes 5.
                ++x : This increments the value of x by 1 before using it, so x becomes 6.
                -x : This negates the value of x, so it becomes -6.
        Putting it all together, the calculation becomes:

        4 + (-4) + 6 - (-6) = 4 - 4 + 6 + 6 = 12

        So, the final value of x after this calculation would be 12.
        */

        //Question 13. What will be the output of the following code fragment?

        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break; //Grade is B not A. Switch skips to next
            case 'B':  //Grade is B. console prints B container "Good"
                System.out.println("Good");
            case 'C':  //since no break between B and C console prints next container of C "Average"
                System.out.println("Average");
                break; //Now Break after True statement B. Switch exits here nothing else prints
            case 'D':
                System.out.println("Below Average");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade");
                break;
        }
                                //Answer: Good
                                //        Average

            //Question 15 What will be the output of this code?

            String information = "Can I vote in this election? ";
            int yourAge = 18; //String information set with int variable 18 has to = 18

            information += yourAge > 18 ? "absolutely YES. ": "unfortunately," +
                    "you should wait a bit.";
                    //yourAge = 18 is not > 18. ? is the if with "absolutely YES." will not run. : is the else statement
                    //that will run since if statement is false that has concatenation--> unfortunately, you should
                    // wait a bit. Console will print the assignment variable information with the else statement
                    // Can I vote in this election? unfortunately, you should wait a bit.
            System.out.println(information);


    }
}
