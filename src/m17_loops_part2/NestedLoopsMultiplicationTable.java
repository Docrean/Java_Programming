package m17_loops_part2;

 /*
 Write a program that prints the multiplication table as shown below:

 1 * 0 = 0  ... 1 * 9 = 9
 2 * 0 = 0  ... 2 * 9 = 18
 3 * 0 = 0  ... 3 * 9 = 27
 ...            ...
 9 * 0 = 0  ... 9 * 9 = 81
  */
            //set up three num variables to represent 3 different number columns
public class NestedLoopsMultiplicationTable {

    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) { //<=9 rows starting from 1 increasing by 1 to 9
            for (int j = 0; j <= 9; j++) { //<=9 columns(print()) starting from 0 increasing by 0 to 9

                System.out.print(i + " * " + j + " = " + (i * j));
                System.out.print("\t"); //Inner loop will not print side by side columns as its only
            }                             //dealing with across values
                System.out.println();   //Outer loop will provide space after each <=9 column
        }

    }
}
