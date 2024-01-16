package m21_methods_part2;

public class SumOfNumbers {

    public static void main(String[] args) {

    sumOf3Numbers(10,20,30); //value or variable(containing iteger number)
                                //Implicit
            int a = 10;
            byte b = 20;
            short c = 30;

            sumOf3Numbers(a,b,c);

            int x = 10;
            long t = 20;
            long d = 30;
                                //Explicit
            sumOf3Numbers(x, (int) t, (int) d);//compiler error without explicit cast

    }
                                //every single parameter must have a data type and parameter name
    public static void sumOf3Numbers(int num1, int num2, int num3){
        System.out.println("Total is " + (num1+num2+num3));
    }
}
