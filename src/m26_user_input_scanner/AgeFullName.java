package m26_user_input_scanner;


import java.util.Scanner;

public class AgeFullName {

    public static void main(String[] args) {

        Scanner scanMu = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scanMu.nextInt(); //store int variable age from scanner class

        scanMu.nextLine();

        System.out.println("fullName = " + fullName);
        fullName = scanMu.nextLine();

    }
}
