package day04_concatenation;

public class Concatenation_vs_Addition {

    public static void main(String[] args) {

        System.out.println("32" + 1); //"321" as 1 is concat'd to 32

        System.out.println(7 + "1"); //"71"
        // CAN CONCAT AS LONG AS STRING is on LEFT or RIGHT of operand

        System.out.println("13" + "2"); // "132"

        System.out.println("---------------------------------------");

                        //in addition...need numbers on RIGHT and LEFT of operand
        System.out.println(12 + 2.5); //14.5
                                     //numbers on R and L of operand
                                    //               |---->addition
                                    //
        System.out.println("---------------------------------------");
                        //ANYTHING CAN CONCAT TO A STRING
                        /*
        ALWAYS ALWAYS ALWAYS:
        FOR CONCATENATION TO HAPPEN.....
        **ALWAYS NEED A STRING on LEFT or RIGHT side OF OPERAND***
        * */
        System.out.println("The Value is " + true);

        System.out.println(40 - 10); //- operand for subtraction
        //System.out.println("40" - 10);//won't work need bcuz of STRING
                                        //for arithmetic NUMBERS on BOTH SIDES of OPERAND

        System.out.println(50 / 6);
                            //denominator is int. will print int
        System.out.println(50 / 6.0);
                            //denominator is double. will print a decimal
        System.out.println(50.0 / 6);
                            //numerator is double. will still print a decimal
        System.out.println(50 / 6);
                            // two ints always print int (no decimal)
        System.out.println(50d / 6);
                            //can add d or D for double if decimal value not given
        System.out.println(2.5 / 0.5);
                        //what if convert to integer?-------------
                        //need: prioritize division operator //  |
                        //group 2.5 / 0.5 into (2.5 / 8.5)   //  \/
        System.out.println( (2.5 / 0.5) );
                        //want to cast as an int?
        System.out.println( (int) (2.5 / 0.5) );

        System.out.println( 100 % 10); //will result 0 if evenly divisible
        System.out.println( 100 % 13); //will give remainder if not evenly divisible

        System.out.println( 45 % 8);

        //ALL ARITHMETICS OPERANDS (- / * %) NEED TO APPLY TO NUMBERS EXCEPT THE +
        // + IS used for ADDITION and CONCATENATION


        /*
        * In math:
        * 20 /6 = 3.33333....
        * 9 / 0 (can't have 0 in denominator)
        *       DENOMINATOR CANNOT BE 0
        *       ALSO SAME IN JAVA
        * In java:
        * 20 / 6 = 3
        * int / int ===> int value (no remainder)
        * 20 / 6.0 ==> 3.333333.....
        * 9 / 0 ===>COMPILER ERROR (Arithmetic exception)
        *
        * int / int ===> int
        * int / double ===> double
        * double / int ===> double
        * double / double ===> double
        *
        *          //IN JAVA...TYPE MATTERS WHEN GIVEN
        *
        *   REMAINDER in MATH: numerator - (denominator * integer result
        *   10 / 3 = 3.333333
        *
        *   remainder: 10 - (3 * 3) = 1
        *                           10 % 3 = 1 (% MODULUS in java)
        *   20 / 6 = 3.3333
        *   20 - (6 * 3) = 2
        *                20 % 6 = 2  (% MODULUS in java)
        *   15 / 4 = 3.75
        *                15 % 4 = 3 (% MODULUS in java)
        *   15 - (4 * 3) = 3
        *   DON"T HAVE TO DO THIS EVERYTIME IN JAVA
        *       |--------> USE % MODULUS
        *   10 % 3
        *   20 % 6
        *   15 % 4
        *
        * */


    }
}


