package m11_operators_part1;

public class JD03OperatorsLab1Task1SwapValues {

    public static void main(String[] args) {


        int num1 = 5, num2 = 10, num3;

        //System.out.println(num1);
       // System.out.println(num2);

        //System.out.println(num3 = num2);
       // System.out.println(num2 = num1);

        num3 = num1;
        num1 = num2;
        num2 = num3;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);




    }
}
