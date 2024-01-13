package m17_loops_part2;


//Write a program that prints the pattern like below for any given
//number
    //Input: 6


public class NestedLoopsStairPattern {

    public static void main(String[] args) {




        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < i; j++) {

                System.out.print(" "); //inner loop each column increases a space by 1 up to <=6
            }
            System.out.println("#");  //outer loop prints # in each row
        }




    }
}
