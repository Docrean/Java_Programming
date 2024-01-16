package m17_loops_part2;

public class NestedLoopIntro {

    public static void main(String[] args) {

        /*
        for (int i = 1; i < 6; i++) {
            System.out.print(i + " ");
                //what if wanted another 1-5 line print out?
                //Can copy and paste multiple loops with println inbetween for space
        }

        System.out.println();

        for (int i = 1; i < 6; i++) {
            System.out.print(i + " ");


        }

        System.out.println();

        for (int i = 1; i < 6; i++) {
            System.out.print(i + " ");

        }

        System.out.println();

        for (int i = 1; i < 6; i++) {
            System.out.print(i + " ");

        }

        System.out.println();

        for (int i = 1; i < 6; i++) {
            System.out.print(i + " ");

        }       //obviously not efficient to repeat code 5x
                //better to create loop to repeat 5x
        */


        for (int j = 0; j < 5; j++) { //this responsible for getting each row
                                        //for every out loop execution, inner loop executed 5x
            for (int i = 1; i < 6; i++) {
                System.out.print(i + " "); //this loop for printing each number in row

            }
            System.out.println();
        }


        /*for (int i = 1; i < 6; i++) {
            System.out.print(i + " "); //move this loop into the previous loops body
                                       //need to change out loop variable since inner
                                       //loop using the i variable
        }

        System.out.println();

        */
    }
}
