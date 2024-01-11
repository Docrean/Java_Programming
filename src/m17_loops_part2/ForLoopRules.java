package m17_loops_part2;

public class ForLoopRules {

    public static void main(String[] args) {

        //     FOR LOOP RULES

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
                be an int. If wanted more boolean conditions for j && k than can specify
                but for now loop will be executed only 10x as i < 11(exclusive) indicates.
                Read the loop: i's value starts from 1 and ends at 10 (< 11). j starts from
                10 and k starts from 100 and both will stop when i runs from 1 (i = 1) --> i < 11.
                j will increase by 10 and k increase by 100.
                 */


            for (int i = 1, j = 10, k = 100; i < 11; i++, j += 10, k += 100) {
                System.out.println(i + " | " + j + " | " + k);
        }
        System.out.println("----------------------------------------");

            // 3. re-assigning a variable in the for loop block
                int x;
        for (x = 0; x <= 10 ; x++) {
            System.out.println(x);
        }

        System.out.println("----------------------------------------");

            // 4. loop variable cannot be used outside the for loop's body
                    //declaring the variable in the initialization sets the for loops body
                    //it cannot be used outside the for loops body or else compiler error
                    //if tried to access from outside the body.
        for (int i = 10; i <= 120; i+= 20) {
            System.out.println(i);
        }

       // System.out.println(i); compiler error. cannot initialize outside the for loop body
    }                   //   ^
}
