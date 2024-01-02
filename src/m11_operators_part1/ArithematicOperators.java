package m11_operators_part1;

public class ArithematicOperators {

    public static void main(String[] args) { //main method makes class runable


        System.out.println( 10 + 5 ); //console returns 15

        System.out.println( 10 - 5 ); //console prints 5

        System.out.println( 10 / 5); //console prints 2

        System.out.println(10 / 4); //2. If both numerator&denominator are integers,
                                        //then division results as an integer(whole
                                        //number)
                                    //What if want floating point value?
                                    //numerator or denominator needs to be floating
        System.out.println(10.0 / 4); //2.5
                                    //or write D character
        System.out.println(10D / 4); //2.5

        System.out.println(10 * 5); //50

        System.out.println( 10 % 3); //1 prints the leftover
        //Algebra 10 / 3 = 3.333333.....(10 not even divisible by 3)
        //Algebra: 10 - (3*3) ==> 1

        System.out.println(10 % 2); // 0console returns 0 since 10 even divisible to 2...no remainder

        System.out.println(9 % 2); //1

        System.out.println(14 % 2); //0

        System.out.println(1234 % 10); //4 because 1234 / 10 = 123.4
                                                    //123 * 10 = 1230 - 1234 = 4

     }
}
