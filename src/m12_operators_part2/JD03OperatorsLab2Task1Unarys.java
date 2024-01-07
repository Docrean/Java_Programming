package m12_operators_part2;

public class JD03OperatorsLab2Task1Unarys {

    public static void main(String[] args) {

        //1

       // int x = 2;
       // int y = x++;

       // System.out.println("y = " + y); //y = 2 as post-inc keeps y assigned as x as 2 then increments x
      //  System.out.println("x = " + x); //x = 3 as post-inc to 3

        /*
        In this code, the variable x is assigned the value 2.
        The variable y is assigned the value of x.
        However, the post-increment operator (++) increases the
        value of x by 1 after the value of x has been assigned to y.
        So, after these two lines of code, x will have the value 3,
        and y will have the value 2.
         */

        //2

        int z = 2;
        int w = z++;

        System.out.println("z = " + z); //z = 3 as post-inc to 3
        System.out.println("w = " + w); //w =2 post-inc keeps w assigned as z as 2 then increments z

        /*
        In this code, we are assigning the value 2 to the variable z using the "int z = 2;" line.
        Then, we are using the "int w = z++;" line to assign the current value of z to the variable
        w and then increment the value of z by 1. This means that w will store the initial value of z (2),
        and z will be incremented to 3.
        */

        //2.1

        int k = 2;

        System.out.println(k++); // k = 2 as this case console prints original assigned value
        System.out.println("k = " + k); // k = 3 after post-dec new assigned value of x is 3

        //3

        int u = 2;
        int t = --u;

        System.out.println("u = " + u); //u = 1 as pre-dec subtracts 1 immediately
        System.out.println("t = " + t); //t = 1 as pre-dec assign 1 to u then assigns to t

        /*
        In this code, we have two variables: u and t.
        The value of u is 2. Then we have the expression --u.
        The -- is the decrement operator in programming.
        So, what this line does is it decreases the value of u by 1.
        Then assigns this new value to t. So, after this line of code,
        the value of t will be 1 and the value of u will also be 1.
         */

        //3.1

        int h = 2;

        System.out.println(--h); //h = 1 as pre-dec subtracts 1 immediately
        System.out.println("h = " + h); //h = 1 expressed as pre-dec already subtracted by 1

        //4

        int r = 8;
        int s = r--;

        System.out.println("r = " + r);
        System.out.println("s = " + s);

        /*
        In this code, we are assigning the value 8 to the variable 'r'.
        Then, we are using the decrement operator '--' after 'r'.
        This means that the value of 'r' will be assigned to 's' first,
        then 'r' will be decremented by 1. So, 's' will have the value 8
        and 'r' will have the value 7 after this operation.
         */


    }

}
