package m26_user_input_scanner;


import java.util.Scanner;

public class MistakeNext {

    public static void main(String[] args) {

    Scanner scanMe = new Scanner(System.in); //Vernon left here in scanner memory without nextLine(next())
    String firstName, lastName;                 //nextLine by default takes what's left over in scanner Memory

        System.out.println("Please write your name?");
        firstName = scanMe.next(); //Brandon then Enter(amy next method other than nextLine won't be read

        scanMe.nextLine(); //clears scanner memory of first name Brandon  and re-admits Vernon

        System.out.println("Please write your last name?");
        lastName = scanMe.nextLine();   //only nextLine can read the enter key

        scanMe.close();

        System.out.println(firstName + " " + lastName);

    }
}                   //if both nextLine() used in both statements then don't have to admit
                    //scanMe.nextLine();

