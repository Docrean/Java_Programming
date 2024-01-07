package m11_operators_part1;

public class JD03OperatorsLab1Task2SwapValues {

    public static void main(String[] args) {

        //int num1 = 5, num2 = 10;

       // num1 = num1 + num2;
        //num2 = num1 - num2;
       // num1 = num1 - num2;

       // System.out.println("num1 = " + num1);
        //System.out.println("num2 = " + num2);


        int num1 = 10, num2 = 15;

        num1 = num1 + num2; //25
        num2 = num1 - num2; //10. num2 now swapped in this step. need num1 as num2 still
        num1 = num1 - num2; //15. num1 now swapped in this step to num2

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);






    }
}
