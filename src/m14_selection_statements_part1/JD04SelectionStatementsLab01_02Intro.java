package m14_selection_statements_part1;

public class JD04SelectionStatementsLab01_02Intro {

    public static void main(String[] args) {

        //Task 1. Write an if statement that assigns 5 to x when y is equal to 20

        int x = 0;
        int y = 20;

        if (y == 10){
            x = 5;
        }

        System.out.println("x = " + x);
        /*
        This code checks if the value of y is equal to 20. If it is, then it assigns
        the value 5 to the variable x.
         */



        // Task 2.
        /*
        Write an if-else statement that assigns 1 to the variable b if a is less
        than 10 and assigns 1 to the variable c if the variable a is greater than 10.
        If the variable a is equal to 10 then the variable b and c both should be assigned
        with 0
         */

        int a = 3;
        int b = 5;
        int c = 7;

        if (a < 10){ //since condition is True rest of blocks not executed. So c prints 7
            b = 1;
        } else if (a > 10){
            c = 1;
        } else{
            b = 0;
            c = 0;
        }

        System.out.println("b = " + b);
        System.out.println("c = " + c);

        //Task 3. Write a code that returns the greatest of two given numbers (9 vs 4)

        int num1 = 9;
        int num2 = 4;

        if (num1 > num2){
            System.out.println("9 is greater");
        } else if (num2 > num1){
            System.out.println("4 is greater");
        } else {
            System.out.println("Numbers are equal");
        }


        //Task 4.
        /*
        Write a code that calculates the average of Math. Chemistry and Biology scores
        and prints the grade based on the table.
         */

        double math = 60;
        double Chemistry = 50.0;
        double biology = 70.0;

        double average = (math + Chemistry + biology) / 3;


       if (average >=90 && average <= 100){
                System.out.println("Average is " + average);
                System.out.println("Your grade is A");
            } else if (average >= 80 && average <= 90){
                System.out.println("Average is " + average);
                System.out.println("Your grade is B");
            } else if (average >= 70 && average <= 80){
                System.out.println("Average is " + average);
                System.out.println("Your grade is C");
            } else if (average >= 60 && average <= 70){
                System.out.println("Average is " + average);
                System.out.println("Your grade is D");
            } else if (average >= 0 && average <= 60) {
                System.out.println("Average is " + average);
                System.out.println("Your grade is D");
            } else {
                System.out.println("Invalid Average/Grade");
            }







    }
}
