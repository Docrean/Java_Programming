package m16_loops_part1;

public class QuestionsPart1 {

    public static void main(String[] args) {


        //Question 1
        //What is output of following code?

        int h = 0;

        for (h = 0; h <= 2; h++) {}

        System.out.print(" " + h);

        //1. loop cycles from 0
        //2. loop checks condition if 0 <= 2..yes (true)
        //.  Nothing to execute in loop body-->{ } then
        //3. iterator increase value by 1 since still true
        //4. loop cycles h = 1 after increment iteration
        //5. loop checks condition if 1 <= 2..yes (true)
        //6. Nothing to execute in loop body-->{ } then
        //7. iterator increase value by 1 since still true
        //8. loop checks condition if 2 <= 2..yes (true)
        //9. Nothing to execute in loop body-->{ } then
        //10. iterator increase value by 1 since still true
        //11. loop checks condition if 3 <= 2..no (false)
        //12. loop will exit due to false
        //13. Compiler executes print statement to print h = 3

        //Question 2
        //How many times will the following code print "Hello World"?

        System.out.println();
        System.out.println("-----------------");
        for (int i = 0; i < 10; i++) { //increment 1

            i++; //increment 1

            //Since iterator sets increment by 1 and the statement
            //is another increment by 1, Hello World will be printed
            //starting from 0 up to 10 in increments of 2. Mathematically,
            //2 goes into 10 5 times (2/10 = 5). So Hello World will be printed
            //5 TIMES.


            System.out.println("Hello World");
        }

        //Question 3
        //What is the output of this code?

            int k = 0;
            int m = 0;

        for (int i = 0; i <= 3; i++) {
            k++;
            if (i == 2) {
                i = 4;
            }
            m++;
        }
        System.out.println(k + ", " + m);

        /*  Visualize each step and explain:

        Initial Step: int k initialized with 0. int m initialized with 0.
                      For loop now: i initialized with 0.
        Step 1: Initialize the for loop. i value is 0 so condition is true.
                inside for loop now: k++ increases k from 0 to 1. if statement
                as if last value is o and now if says i == 2 this is false which stops
                if body initializing. next line is m++ which increases m from 0 to 1. now
                back to for loop iteration increasing i value by i++ to 1.
        Step 2: check condition if i still <= 3. true so then move to condition that k++ so k
                increase to 2. check if condition if now i == 2. false since i still 1. next line
                m++ so increasing m to 2. go back check iteration i++ now i increases to 2.
        Step 3: check condition again. if i still <= 3. true(still 2) now check condition k++ now
                k value is 2. check if statement condition if i == 2. true(i's last value was 2) so
                next condition says i value assigns to 4. next is m++ so m value increases by 1 to now
                3. go back check iteration i++ now i increases from 4 to 5.
        Step 4: check the condition again. is i <= 3. false (now 5) so compiler exits the for loop and
                now console will print k and m value with , seperation. k last value was 3 and m last
                value was 3.

                Takeaways:
                Each step represents a for loop iteration cycle to see how the values change each cycle.


                     k   |   m   |   i
    initial  step    0   |   0   |   0
        step 1       1   |   1   |   1
        step 2       2   |   2   |   2
        step 3       3   |   3   |   4 --> 5
        step 4       -   |   -   |   -
        step 5       -   |   -   |   -

         */

        //Question 4
        //What is the output of this code?


        int sum = 0;
        int j = 5;
        int i;

        for (i = 0; i < 10 && j > 0; i++, j--) {
            if(i % 3 == 0 || j % 5 == 0) {
                sum = sum + i + j;
            }
        }
        System.out.println("Sum = " + sum);
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        /* Visualize each step and explain:

                    sum  |   i   |   j
    initial  step    0   |   0   |   5
        step 1       5   |   1   |   4
        step 2       5   |   2   |   3
        step 3       5   |   3   |   2
        step 4       10  |   4   |   1
        step 5       10  |       |

        Initial step/understanding: int sum is 0, int j is 5 and int i is 0 because i = 0 i in the for loop also.
        i value is 0 and j is > 0 (with && both conditions need be true) to continue with loop. next is i++ and j--
        as i is increasing and j is decreasing so keep track of these two values.

        Step 1: Initialize the for loop.. first part i = 0 which is true and second is j is 5 which is true.
        Now inside the for loop and there is an if statement. check if statement conditions if correct. i % 3 == 0 so
        divide i with 3 if remainder is 0 that condition will be true. i value already set to 0 so if i = 0 and
        0 / 3 = 0 than 0 == 0 which is true(with || and | all true if one medicated. don't need to check J since
        truth table rule but its good practice. so j % 5 needs to == 0. so if j = 5 from original int expression
        than 5 % 5 = 1 with no remainder than % expression returns 0 so 0 == 0 resulting j(5) % 5 == 0 is true.
        since both previous conditions true than next expression executes. sum = sum + i + j which is sum = 0 + 0 + 5
        which is sum = 5. now everything in if and for loop is done. before ending loop compiler checks iteration and
        i++ increases i by 1 to value 1 and j-- decreases j by 1 to value of 4.

        Step 2: check condition again if i < 10 and j > 0 which is true then compiler enters the for loop to check if
        statement. now i % 3 == 0 is false since now i = 1 or j % 5 == 0 is also false since now j = 5 so now if
        will not execute and sum value will remain the same (5) at the end when going to iteration. compiler skips
        sum section and goes back to iteration as i++ to increase i by 1 to value 2 and as j-- to decrease j by 1 to
        value 3.

        Step 3: check condition again if i < 10 and j > 0 which is true then compiler enters the for loop to check if
        statement. now i % 3 == 0 is false since now i = 2 and remainder will not be 0 or j % 5 == 0 is also false
        since now j = 3 and remainder will not be 0. So now if will not execute and sum value will remain the same (5)
        at the end when going to iteration. compiler skips sum section and goes back to iteration as i++ to increase i
        by 1 to value 3 and as j-- to decrease j by 1 to value 2.

        Step 4: check condition again if i < 10 and j > 0 which is true then compiler enters the for loop to check if
        statement. now i % 3 == 0 is true since now i = 3 and % will return 0 or j % 5 == 0 is false since now j = 2
        and remainder will not be 0. Since first part of || truth table is true don't need to check 2nd part but can
        anyways. j % 5 == 0 since j = 2 than remainder is not 0 since 2 is not evenly divisible by 5. next expression
        executes. sum = sum + i + j as i and j will be added on top of the sum. so sum = 5 + 3 + 2 = sum = 10. compiler
        goes back to iteration as i++ to increase i by 1 to value 4 and as j-- to decrease j by 1 to value 1.

        Step 5: check condition again if i < 10 and j > 0 which is true then compiler enters the for loop to check if
        statement. now i % 3 == 0 is false since now i = 4 and remainder will not be 0 or j % 5 == 0 is also false
        since now j = 1 and remainder will not be 0. So now if will not execute and sum value will remain the same (10)
        at the end when going to iteration. compiler skips sum section and goes back to iteration as i++ to increase i
        by 1 to value 5 and as j-- to decrease j by 1 to value 0.

        Step 6: check condition again if i < 10 and j > 0 which i < 10 still true but j > 0 is false since j is now 0.
        Since using && truth expression according to its truth table the whole condition will be false. Compiler now
        moves to print statements. Will print first sum = 10 then i = 5 then j = 0 on separate lines (println).




            "AND" operators ("&" and "&&")

					Truth Table 75% False
                    FALSE IF ONE POISONED

	EXPR 1          EXPR 2          Returned value
	False           False	     	False
	False	        True            False
	True            False           False
	True            True            True    True if both medicated

            "OR" Operators ("|" and "||)

					Truth Table 75% True
					TRUE IF ONE MEDICATED

	EXPR 1			EXPR 2			Returned Value
	False			False			False	False if both poison
	False			True			True
	True			False			True
	True			True			True



        */



    }
}
