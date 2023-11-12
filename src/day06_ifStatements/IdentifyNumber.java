package day06_ifStatements;

public class IdentifyNumber {

    public static void main(String[] args) {
        //1. assign data type, variable and value
        //2. assign boolean conditions

        int number = 200;

        boolean isPositive = number > 0; //if # is > 0, then its +
        boolean isNegative = number < 0; //can't use !isPositive since also could be 0
        //boolean isZero = number == 0; //if the number is equal to zero, then it's zero

        boolean isZero = !isPositive || isNegative; //if number is Not positive and Not negative, then its 0

        System.out.println(number + " is positive number: " + isPositive);
        System.out.println(number + " is negaive number: " + isNegative);
        System.out.println(number + " is zero: " + isZero);

    }
}


/*
2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */