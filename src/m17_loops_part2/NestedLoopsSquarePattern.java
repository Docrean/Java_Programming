package m17_loops_part2;

    /*
    1. Create a class named Rectangle. Use a loop to print the following shape on the console:

			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
			* * * * * * * *
     */


public class NestedLoopsSquarePattern {

    public static void main(String[] args) {

        //int star = 9; if you want i and j <= to each other use variable int star

        for (int i = 1; i <= 9; i++) { //rows
            for (int j = 1; j <= 8; j++) { //stars/columns
                System.out.print("* "); //remove ln to print across
            }
            System.out.println(); //outer if to print rows and new line after finishing inner loop
        }


    }
}
