package m17_loops_part2;

public class ForLoopRules {

    public static void main(String[] args) {

        /*/ 1. Avoid infinite loops
        //If initialization and condition not specified loop runs indefinitely
        //even with two semicolons given

            1st example
        for(;;) {
            System.out.println("Cydeo");
        }
        */
          /*
            //how to read the loop:
            //Initialization set to 0
            //Condition set i > -1
            //When loop executes from initialization i = 0, the i > -1 condition confirms
            //the initialization i = 0 as being true so then the loops body gets executed
            //and then iterator i++. In this case since iterator will increase the initializer
            //by 1 by every loop cycle above the boolean condition i > -1, the loop will print
            //indefinitely. In this case "cydeo" will be printed indefinitely.

            2nd example
        for (int i = 0; i > -1; i++) {
             System.out.println("Cydeo");
        }
        */

            /*
            With no iterator the initializer int i = 1 will not decrease/increase to match the boolean
            condition  i < 11 making the expression false and exiting the loop, thus creating another
            indefinite loop scenario.
            
            3rd example
            for (int i = 1; i < 11;) {
                System.out.println("Cydeo")
            }
             */

            // 2. Multiple variations of same type can be given in initialization
                /*
                Can assign another number column j = 10 as an initializer and then have
                it iterated j++ so that it will increase along with the other iteration
                i++ until I < 11...rendering the loop false and compiler exits. In order
                to increment j by 10 rather than by 1 (j++), use the add assign operator
                +=. As many variables can be assigned in the initializer, however, they
                must be the same data type or else compiler error. In this case, must
                be an int.
                 */
            for (int i = 1, j = 10, k = 100; i < 11; i++, j += 10, k += 100) {
                System.out.println(i + " | " + j);
        }
        
        
    }
}
