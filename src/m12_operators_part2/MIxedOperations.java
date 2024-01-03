package m12_operators_part2;

public class MIxedOperations {

    public static void main(String[] args) {

        /*
        byte num1 = 100;
        short num2 = 20;

        short num3 = (short) (num1 + num2); //byte and short auto implicits to int unless cast(short in this case).

        int a = 100;
        long b = 200;

        long c = a + b;

        float f = 20;
        double g = 30;

        double j = f + g;

        long num9 = 200;
        int num10 = 2;

        long num11 = num10 + num9;

        System.out.println("num11 = " + num11);
        System.out.println("num10 = " + num10);

        double num12 = 50;
        byte num13 = 2;

        byte m = (byte) (num13 + num12);

        System.out.println("m = " + m);

        byte k = 50;
        short l = 40;
        int p = 0;
        p = k;
        l = k;
        */

        short x = 2;
        float y = 2.5f;

        float z = x * y;

        long g = 2;
        byte t = 40;

        long o = g * t;//byte implicitly cast to long to new long variable o
                        //what if byte explicitly cast to long?
        byte u = (byte)(g * t);//byte explicitly cast to long to new byte variable u


        System.out.println("o = " + o);
        System.out.println("u = " + u);

        System.out.println( 9 / 2.5 ); //3.6 Returns double since mixed operation rule casts small to large (int-->double)
        System.out.println( 9 / 3); //not a mixed operation since both same type...result is int







    }
}
