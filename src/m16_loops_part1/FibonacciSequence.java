package m16_loops_part1;





/*
write a program that generates the prints the fibonacci series up to specified numbers of terms
        each subsequent number is the sum of the two previous numbers


    example input: 9
    output: 0 1 1 2 3 5 8 13 21

        9 fibonacci sequence:

            0 + 0, 0 + 1, 1 + 1, 1 + 2, 2 + 3, 3 + 5, 5 + 8, 8 + 13,
    initial     0      1      2      3      5      8     13      21

 */



public class FibonacciSequence {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        for (int i = 1; i <= 9; i++) {

           // 1. print num1 on same line

            System.out.print(num1 + " ");

            //2. compute the next numbers in the series
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;

        }
        System.out.println();
        System.out.println("-------------");

    }
}
