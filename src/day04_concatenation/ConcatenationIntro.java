package day04_concatenation;

import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;

public class ConcatenationIntro {

    public static void main(String[] args) {

        String name = "Brandon"; //---------------------------------
                                                                 // |
        int age = 35;                                            // |
                // |                                             // |
        int salary = 85_000;                                     // |
        //|     // |                                             // |
        //|     // |                                             // \/
        System.out.println("Hello " + name + "," ); //declare first dataType (String name)
        //|     // |        //order-->
        //|     // |        //string-->variable-->string-->variable-->string
        //|     // |        //variables are passed OUTSIDE the " "
        //|     // |        //strings are passed INSIDE the " "
        //|     // |
        System.out.println("You are " + age + " years old."); //declare second dataType (age)
        //|     // |---------------------------------------------/\
        //|
        System.out.println("Your Salary is " + salary + " USD");
        //|-------------------/\ //declare third dataType Salary
                                // ANY VALUE CAN BE LINKED TO A STRING AFTER EACH STRING

        int number = 10_000_000;

        System.out.println("number = " + number);
                           //string concat's the variable AUTOMATICALLY using SOUTV





    }
}
