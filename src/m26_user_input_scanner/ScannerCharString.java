package m26_user_input_scanner;

import java.util.Scanner;

public class ScannerCharString {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character:");
        char ch = input.next().charAt(0);         //use charAt(0) after next() to get char input

        System.out.println("Would you like to continue?");
        String answer = input.next();

        input.close();

        System.out.println("ch = " + ch);
        System.out.println("answer = " + answer); //Will only print first word specified on console. need nextline().
    }
}


        /*
        Write a program that asks the user to enter a character and then a question
        "Would you like to continue?". It should print inputs as shown on the output.

            Example:
                Input: '*', Yes
                Output:

                   Enter a character:
                   *
                   You have entered: *
                   Would you like to continue?
                   Yes
                   You have entered: Yes
         */