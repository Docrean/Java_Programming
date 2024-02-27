package m12_operators_part2;

public class ShorthandOperators {

    public static void main(String[] args) {


                    //addition: +=
        int x = 5;
        System.out.println(x);

        x += 5; // x = x + 5 where x becomes reassigned by x(increased by 5)

        System.out.println(x);

                    //subtraction: -=
        int y = 15;
        System.out.println(y);

        y -= 5; // b = b - 5 where x becomes reassigned by x (decreased by 5)
        System.out.println(y);

                    //multiply: *=

        int z = 10;
        System.out.println(z);

        z *= 5; // z = z * 5 where z becomes reassigned by z (multiplied by 5)
        System.out.println(z);

                    //division: /=

        int a = 14;
        System.out.println(a);

        a /= 2;  // a = a / 2 where a becomes reassigned by a (divided by 2)
        System.out.println(a);

                    //module: %=

        int d = 13;
        System.out.println(d);

        d %= 2; // d = d % 2 where d becomes reassigned by d (modulated by 2)
        System.out.println(d);


                    /*
                    if operands have diff data types, result is auto-casted to the type of the variable on
                    left-hand side of the assigment. shorthand is combo of operators.
                     */

                    //different data types

            int f = 4;
        System.out.println(f);
            f += 20.5;
        System.out.println(f);





    }
}
