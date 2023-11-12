package day06_ifStatements;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 45;

        boolean isEven = number % 2 == 0;  //when we divide a number by 2, if remainder 0 then number is even

  //    boolean isOdd = number % 2 != 0; //when we divide a number by 2, if remainder is NOT 0 then number is ODD

        boolean isOdd = !isEven; //if number is not even, than its odd

        System.out.println(number + " is an even number: " + isEven );
        System.out.println(number + " is an odd number: " + isOdd );



    }
}

/*
1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false

        Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)

        even: 2, 4, 6, 8, 10 ...

        odd: 1, 3, 5, 7, 9 ...

 */