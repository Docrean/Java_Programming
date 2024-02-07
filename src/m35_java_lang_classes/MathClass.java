package m35_java_lang_classes;

import java.sql.SQLOutput;

public class MathClass {

    public static void main(String[] args) {

       int num1 = Math.max(100, 200); //Math. keyword
        System.out.println(num1);

       int num2 = Math.min(28, 128);
        System.out.println(num2);


        System.out.println(Math.abs(-120));
        //absolute value is always positive
        //returns 120 and can include statement in the print statement.

        int num4 = (int)Math.pow(10, 2); //cast int since pow returns double by default
        System.out.println(num4); //10 to the power of 2 is 100.

        double num5 = Math.pow(5, 3);
        System.out.println(num5);

        double num6 = Math.sqrt(100);
        System.out.println(num6); //multiplying 10 by itself gets 100 so square root 100 is 10.0 as double

        double num7 = Math.sqrt(9);
        System.out.println(num7);

        System.out.println( Math.random() ); //returns value between 0(inclusive) or 1(exclusive)

        System.out.println( Math.round(10.7) ); //11. rounds to the nearest mathematical integer +- of 5
        System.out.println( Math.round(10.3));  //10. rounds to the nearest mathematical integer +- of 5

        System.out.println( Math.floor(20.9)); //20.0 rounds DOWN to nearest mathematical integer regardless of +-5

        System.out.println(Math.ceil(20.9));  //21.0 rounds UP to nearest mathematical integer regardless of +-5

        System.out.println(Math.PI);


        /*
        Method & Constant                            Description                                        Return Type
        max(x, y)                    Returns the number with the highest value                          int, long, float, double
        min(x, y)                    Returns the number with the lowest value                           int, long, float, double
        abs(x)                       Returns the absolute value of x                                    int, long, float, double
        pow(x, y)                    Returns the value of x to the power of y                           double
        sqrt(x)                      Returns the square root of x                                       double
        random()                     Returns a random number between 0 (inclusive) and 1 (exclusive)    double
        round(x)                     Returns the value of x rounded to its nearest mathematical         integer int, long
        floor(x)                     Returns the value of x rounded down nearest mathematical integer   double
        ceil(x)                      Returns the value of x rounded up nearest mathematical integer     double
        PI                           Represents the value of pi (3.141592653589793)                     -

         */



    }
}
