package day05_operators;

import java.sql.SQLOutput;

public class LogicalOperators {

    public static void main(String[] args) {
         //Logical AND && 75% false
        /*
        &&: both (ALL FALSE IF POISONED)
        expr 1       expr 2          Returned value
        false        false	     	 false
        false	     true            false
        true         false           false
        true         true            true
                (COMPILER DIES (Won't compile after poisoned)
        */

        double salary = 90000;
        int creditScore = 500;
        int age = 25;


                                //1st condition     //2nd condition
        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >= 18 ;
                    //                 true       &&     false          &&   true   --->false (poisoned)
                    //Use logical && since BOTH value NEED MET for BOOLEAN
                    //Since this is logical && only TRUE if BOTH VALUES MET for LOAN

        System.out.println(eligibleForLoan);


        System.out.println("----------------------------------------------------------");

        char grade = 'B';
        //logical && or ||?
        //not comparing values (&&)...its either or...so logical or ||
        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D';
        //ANY ONE TRUTH OUTPUTS TRUE FOR LOGICAL ||
        System.out.println(passedTheExam);
        //use Or. Grades are not same
        //If && then FALSE. NO GRADES EQUAL. POISONED
        //Logical or || 75% true
        /*
        II: either (ALL TRUE IF MEDICATED)
        expr 1       expr 2          Returned value
        false        false	     	 False
        false	     true            true
        true         false           true
        true         true            true
                (COMPILER LIVES (Won't compile after medicated)
        */

        String answer = "maybe"; //If "no", then COMPILE true since boolean answer "no"
                                 //If "yes", then COMPILE ture since boolean answer "yes"
                                    //false         //false   --->Compiles false
        boolean validAnswer = answer == "yes" || answer == "no";
                                        //can't use &&..Yes never equal to No
                                        // || for Yes OR(||) No

        System.out.println(validAnswer);

        System.out.println("-----------------------------------------");

        String a = "yes";

        boolean yes = a == "yes"; //true
        boolean no = !yes;  //false

        System.out.println("yes = " + yes);
        System.out.println("no = " + no);

        System.out.println("-----------------------------------------");

        int score = 65;

        boolean passed = score >= 60; //if true, then 2nd expression false (!= operator)
        boolean failed = !passed;

        System.out.println("failed = " + failed);
        System.out.println("passed = " + passed);
                    //only one is true. can't have both with
        //                  true == true      false == false    true not equal to false
        System.out.println( true == !false && false == !true && true != !true);
        //                           true  &&          false &&         true
        //                                      && medicine returns TRUE

    }
}
