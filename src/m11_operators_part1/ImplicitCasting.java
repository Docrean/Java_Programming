package m11_operators_part1;

public class ImplicitCasting {

    public static void main(String[] args) {

        byte num1 = 25;
        int num2 = num1; //implicit casting

        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);

        double num3;
        int num4 = 10;

        num3 = num4; //num3 is not 10.0 since double cast to the whole number now makes it decimal

        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);


    }
}
