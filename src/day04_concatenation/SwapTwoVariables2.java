package day04_concatenation;

public class SwapTwoVariables2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        /*
        how to swap a with b and b with a without a third variable(c) as medium for switch?
        1. Computer first needs sum of a as a + b which is 25
                                a = a + b = 25
        2. Find b by - new sum of a
                    b = 25 - 15 = 10
        3. b is now switched to original a (10) as wanted
                    now how to get a switched to original b?
        4. take new sum of a(25) - b(10) = 15!
        5. Now a = b and b = a!
        */


        a = a + b; //a = 25
        b = a - b; //b = 10
        a = a - b; //a = 15

        System.out.println("a = " + a);
        System.out.println("b = " + b);


        int c = 10;
        int d = 50;

        // c = c + d = 10 + 50 = 60
        // d = c - d = 60 - 50 = 10
        // c = c - d = 60 - 10 = 50



    }
}

/*
Create a class named SwapTwoVariable21 and
declare the following variables:
            a
            b
     Write a program that swap variables x & y’ values without using any temporary variables
        Ex:
              a = 10
              b = 15
        output:
                  a = 15
                  b =
 */