package m13_operators_part3;

public class OR_Operator {

    public static void main(String[] args) {


        int x = 50;

        System.out.println( (x < 100) | (x > 0) );
        //                    true    |   true  ===> true

        System.out.println( (x < 100) || (x > 0) );
        //                    true   || -------   ===> true

        System.out.println( x > 200 || x < 0 );
        //                  false  ||  false ===> false


        //Bit wise EXCLUSIVE OR

        System.out.println(true | false); // true
        System.out.println(true | true);  // true
        System.out.println(false | false); // false

        System.out.println("---------------------");

        System.out.println(true ^ false);


    }
}
