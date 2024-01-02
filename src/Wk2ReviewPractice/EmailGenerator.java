package Wk2ReviewPractice;

import java.sql.SQLOutput;

public class EmailGenerator {

    public static void main(String[] args) {


        String firstName = "Daniel";
        int birthYear = 1985;

        System.out.println("Yahoo: " + firstName + "_" + birthYear + "@yahoo.com");
        System.out.println("Gmail: " + firstName + "_" + birthYear + "@gmail.com");
        System.out.println("Outlook: " + firstName + "_" + birthYear + "@outlook.com");




        /*
2. Create a class named EmailGenerator.

		Given the following variables:
		   - firstName
		   - birthYear

		 The program should generate emails for Gmail, Yahoo, and Outlook by combining the firstName with
		 an underscore and birthYear, followed by the domain of the email.

		 Example:
		   firstName = "Daniel"
		   birthYear = 1985

		 Output:
		   Your generated emails are:
		      Yahoo: Daniel_1985@yahoo.com
		      Gmail: Daniel_1985@gmail.com
		      Outlook: Daniel_1985@outlook.com
 */
    }
}
