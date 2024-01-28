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
    }

}
