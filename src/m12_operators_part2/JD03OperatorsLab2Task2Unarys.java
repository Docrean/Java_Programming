package m12_operators_part2;

public class JD03OperatorsLab2Task2Unarys {

    public static void main(String[] args) {
        //task 2
        int a = 10;

           a = --a    +   a++   +  a--   +  a++;
        /*   = 10>(9) + (9)>10  + (10)>9 + (9)>10  <---how it works in computer memory
           a =   9    +    9    +  10    +   9
             =         18      +     19
          a  =                 37
          a  =  37
     */
        System.out.println(a);

        /*
        The code sets the variable 'a' to the value 10.
        Then, it uses the increment and decrement operators
        to modify the value of 'a' in a single statement.

        Here's a step-by-step breakdown:

        --a decrements 'a' by 1, so 'a' becomes 9
        a++ returns the current value of 'a' (9) and then increments 'a' by 1, so 'a' becomes 10
        a-- returns the current value of 'a' (10) and then decrements 'a' by 1, so 'a' becomes 9
        a++ returns the current value of 'a' (9) and then increments 'a' by 1, so 'a' becomes 10
        Adding all these together, the expression evaluates to 9 + 9 + 10 + 9, which equals 37.
                                                   solve for the a values...not the increments
         */


        //task 3

        int x = 4;
        int y = --x * 4 - x++;
        /*        3 * 4 - x++
                    12  - X++(not affecting current value, so still 3 from pre-dec)
                    12  - 3 = 9; y = 3


        */
        System.out.println("x = " + x); //4 set initially
        System.out.println("y = " + y); //9

        /*
        In this code, we have two variables, x and y.
        The value of x is initially set to 4.
        Then, we have the expression "--x * 4 - x++".
        The "--x" part decrements the value of x by 1, so x becomes 3.
        Then, we multiply this decremented value by 4, which gives us 12.
        After that, we subtract the current value of x (which is 3) from this result,
        so we get 12 - 3 which is equal to 9. Then, x is incremented by 1 because
        of the "x++" part but this increment won't affect the value used in our calculations.
        So, the final value of y will be 9.
         */

    }
}
