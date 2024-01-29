package m26_user_input_scanner;


import java.util.Scanner;

public class AgeFullName {

    public static void main(String[] args) {

        Scanner scanMu = new Scanner(System.in); //scanner object

        System.out.println("Enter your age:");
        int age = scanMu.nextInt(); //store int variable age from scanner object

        scanMu.nextLine(); //remember...need this to clear scanner memory of age in order for next scanner method fullName
                            //The Scanner.nextLine() is a method in the Java Scanner class that returns a line of text
                            //that is read from the scanner object.
        System.out.println("Enter your full name:");
        String fullName = scanMu.nextLine(); //full name includes space as well(more than one word)
                                         //next() for just one word. nextLine() for two words

        scanMu.close();//once closed won't be able to use same scanner object

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
    }
}


            /*
            Write a progarm taht asks the user to enter his age and full name. Then print the
            age and full name as shown on the output.

                Example:
                    Input: 21, Mike Smith
                    Output:
                        Age = 21
                        FullName = Brandon Vernon3
             */