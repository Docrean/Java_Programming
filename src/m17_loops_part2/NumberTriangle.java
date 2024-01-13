package m17_loops_part2;

public class NumberTriangle {

    public static void main(String[] args) {

        //Write a program that prints the number triangle that starts
        //from 1 and ends at given number.
        //     Input: 5
            //since input given use it as a variable for the rows
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) { //1st row only 1, 2nd row only 2, 3rd row only 3
                System.out.print(j + " "); //need to change inner loop printing 1-5 after each iteration
            }                              //to printing 1-1, 1-2, 1-3, 1-4 so give i value to inner loop j
                                           //j = 1 so j < 1 is false so set to j <= i
                                           //inner loop will print j = 1 (numbers starting from 1) to j <= i (includes i
                                           //i value. So if i value is 1 will print 1. if 2 will print 1-2, if 3 will
                                           //print 1-3.
            System.out.println(); //after each outer loop iteration
        }                         //inner loop iteration prints from new line
    }
}
