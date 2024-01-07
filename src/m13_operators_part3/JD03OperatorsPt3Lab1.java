package m13_operators_part3;

public class JD03OperatorsPt3Lab1 {

    public static void main(String[] args) {

        //Task 1

        int b = 2;
        boolean result = (++b == 2 || b == 2) && --b == 2;
        /*              (2(3) == 2 || 3 == 2) && 3(2) == 2;
                           (3 == 2 || 3 == 2) &&  2 == 2;
                             false || false   &&  true;
                             false   ------   &&  true;
                                  false     ------- (short-circuit)
                         result = false
                              b = 3 (short-circuited after && so no check
                                     of the --b so b remains 3 from ++b
         */
        System.out.println(result); //false
        System.out.println(b); //3 as ++b set b to 3 left to right


        /* Task 2
        Print out the eligibility of work for a given resident's birth year
        if the age is between 18 and 65 (inclusive), then the output should be "true".

        Example 1:                              Example 2:
        Input: 1985                             Input: 1957
        Output:                                 Output:
        Am I eligible to work? true            Am I eligible to work? false

         */

        int age = 38; //set int operand and variable age between 18 and 65

        boolean isEligible = age >= 18 && age <= 65;

        System.out.println("Am I eligible to work? " + isEligible);

        int age2 = 66;

        boolean isEligible2 = age2 >= 18 && age2 <= 65;

        System.out.println("Am I eligible to work? " + isEligible2);

        /* Task 3

        Declare three integer variables "appleCount", "orangeCount" and "strawberryCount".

        Write an expression that evaluates if the number of apples is less than the number of
        oranges, or the number of oranges is greater than ro equal to the number of strawberries.

        Assign the result to a "result" variable and print it on the console

         */

        int appleCount = 1;
        int orangeCount = 2;
        int strawberryCount = 3;

        boolean result2 = appleCount < orangeCount || orangeCount >= strawberryCount;

        System.out.println("result = " + result2);


        /* Task 4

        Write a program that prints out the driving permit status of a resident based
        on the given age as well as if the resident has a learner's permit and/or
        a driver's licence.
        According to the Virginia State law, in order to drive, a resident must be over
        18 and have a driver's license, or over 15 years and 6 months old and have a
        learner's permit.

            Example 1:                                          Example 2:

            Input: Mike is 15.5 years old and got                  Input: Mary is 17 years old
            learner's permit but does not have a                abd has a driver's license.
            driver's licence.                                   Output:
            Output:
            Is Mike eligible to drive? true                     Is Mary eligible to drive? false

        */
            //Example 1

            double age3 = 15.5;
            int license = 18;
            double learnersPermit = 15.5;
            //my original operands

            //added these according to lab solution
            boolean hasLearnersPermot = true;
            boolean hasDriversLicense = false;

            boolean iseligible = age3 >= learnersPermit && hasLearnersPermot || age3 >= license && hasDriversLicense;


            System.out.println("Is Mike eligible to drive? " + iseligible);

            //Example 2

            int age4 = 17;
            int license2 = 18;
            //my original operands

            //added these according to lab solution
            boolean hasDriversLicence = true;

            boolean iseligible2 = age4 >= license2 && hasDriversLicence;

            System.out.println("Is Mary eligible to drive? " + iseligible2);


    }
}
