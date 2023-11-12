package day06_ifStatements;

public class EvenlyDivisible {

    public static void main(String[] args) {
        //1. declare data type, variable, and value
        //2. declare boolean
                /*
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
                 */
        //3. declare number variable to check if 65 is divisible by 2, 3, 5 using % operator
        //4. if divisible than % returns 0 so need to declare == 0 in each boolean expression

        int number = 65;

        boolean isDivisibleby2 = number % 2 == 0;
            //if remainder divided by 2 equals 0, then evenly divisible by 2

        boolean isDivisibleby3 = number % 3 == 0;
            //if remainder divided by 3 equals 0, then evenly divisible by 3

        boolean isDivisibleby5 = number % 5 == 0;
            //if remainder divided by 5 equals 0, then evenly divisible by 5

            //1. declare 65 with variable (number)
            //2. write string as wanted ( + " is divisible by : ")
            //3. assign divisible variable ( + isDivisibleby2 )
        System.out.println(number + " is divisible by 2: " + isDivisibleby2 );
        System.out.println(number + " is divisible by 3: " + isDivisibleby3 );
        System.out.println(number + " is divisible by 5: " + isDivisibleby5 );


    }
}


/*
3. Create a class named EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true

            Evenly Divisible ==> remainder is zero
 */