package day03_variables;

public class VariableNamingRules {

    public static void main(String[] args) {

        /*
        Variable name rules:
        1. Unique all the time
        2. readable, understandable, and meaningful
        3. MUST BE UNIQUE
            PRIMITIVES:
            int: default for integer numbers
            double: for decimal numbers
            char: for single character ''
            boolean: for True or False expressions
            String: sequence of characters, surrounded by double quote ("")
        */

        // age of student is 28
        // salary of person is $10000

        int age = 28; //why on use x, y, z? needs to be meaningful
        int salary = 10000; //UNIQUE

        //int age = 32; //variable name must be UNIQUE

        /*poop
        * first character: a-z, A-Z, _ or $ (no numbers)
        * after first character: a-z, A-Z, _ or $ (no numbers)
        * CANNOT INCLUDE SPACES
        * can not have special characters other than _ and $
        * cannot start with digits
        * Cannot be java reserved words
        */

        int phoneNumber = 12121212; //camel case if more than one word

        double salaryBeforeTax = 100000.5;

        double salary_after_tax$ = 80000.5;

        System.out.println("---------------------------");

        int number1 = 10;
        int number2 = 20;
        int number3 = 30; //why compiler? line 39 & 40 are not unique

        int num1 = 20;
        int num2 = 30;
        int num3 = 40; //no compiler since variable are unique

       // double abstract = 5.5; //why? can't use java reserved words
       // double final = 85.5;

        System.out.println("-----------------------------");

        //gender is male. Use string for sequence of CHARACTERS

        String gender = "Male";

        String fullName = "Cydeo School";

        System.out.println(gender);
        System.out.println(fullName);


    }

}
