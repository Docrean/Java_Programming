package QuizzesAnswers;

public class SelectionStatements {

    public static void main(String[] args) {

        int x = 5;
        x = --x + -x++ + ++x - -x;

        /*
        Explain code
        In this code, we have a variable x assigned the value 5. Then, we have a complex calculation that modifies the value of x using prefix and postfix increment and decrement operators. Let's break it down:

                --x : This decrements the value of x by 1 before using it in the calculation, so x becomes 4.
                -x++ : This takes the current value of x, negates it, and then increments x by 1. So, it becomes -4, and x becomes 5.
                ++x : This increments the value of x by 1 before using it, so x becomes 6.
                -x : This negates the value of x, so it becomes -6.
        Putting it all together, the calculation becomes:

        4 + (-4) + 6 - (-6) = 4 - 4 + 6 + 6 = 12

        So, the final value of x after this calculation would be 12.
        */



    }


}
