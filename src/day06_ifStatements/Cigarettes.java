package day06_ifStatements;

public class Cigarettes {

    public static void main(String[] args) {

        int age = 45;

        if (age >= 21 && age < 100){
            System.out.println("You are eligible to buy cigarettes");
        }

                //needs to be || operator since can't be less than 21 and greather than 100 at same time
        if(age < 21 || age > 100){
            System.err.println("You are not eligible to buy cigarettes");
        }


    }
}

/*
1. Create a class named Cigarettes.java
2. A variable named age is declared and given, Write a program that can check if the person is eligible to buy cigarettes
	Ex:
		age = 20
	     output:
		    You are not eligible to buy Cigarettes
 */
