package m26_user_input_scanner;


import java.util.Scanner;

public class AgeFullName {

    public static void main(String[] args) {

        Scanner scanMu = new Scanner(System.in); //scanner object

        System.out.println("Enter your age:");
        int age = scanMu.nextInt(); //store int variable age from scanner object

        scanMu.nextLine(); //remember...need this to clear scanner memory of age in order for next scanner method fullName

        System.out.println("Enter your full name:");
        String fullName = scanMu.nextLine(); //full name includes space as well(more than one word)
                                         //next() for just one word. nextLine() for two words

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
    }
}
