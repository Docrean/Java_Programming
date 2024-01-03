package m11_operators_part1;

public class ExplicitCasting {

    public static void main(String[] args) {

    double num1 = 100.0;

    short num2 = (short)num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int num3 = 500;
        byte num4 =(byte)num3;

        System.out.println("num3 = " + num3); //num3 = 500
        System.out.println("num4 = " + num4); //num4 = -12. Data loss risk since out of smaller prims(bytes) range.k

        long num5;
        byte num6 = 52;

        num5 =(long) num6;

        System.out.println("num5 = " + num5);

        short num7 = 39;
        double num8;

        num8 = num7;

        System.out.println("num8 = " + num8);
        System.out.println("num7 = " + num7);

        float num9 = 12;
        byte num10;

        num10 =(byte) num9;

        System.out.println("num10 = " + num10);
        System.out.println("num9 = " + num9);
    }
}
