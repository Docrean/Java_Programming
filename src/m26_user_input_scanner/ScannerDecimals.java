package m26_user_input_scanner;


import java.util.Scanner;

public class ScannerDecimals {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first decimal number:");
        float num1 = input.nextFloat(); //float

        System.out.println("Enter your second decimal number:");
        double num2 = input.nextDouble(); //double

        System.out.println("Enter true or false:");
        boolean r = input.nextBoolean(); //boolean

        input.close();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("r = " + r);
    }

}


        /*
        Write a program that asks the user to enter two decimal numbers and a "true/false" question. Then print user
        inputs as shown on the output.

            Example:
                Input: 1.1, 10.2, true
                Output:

                    num1 = 1.1
                    num2 = 10.2
                    r = true
         */