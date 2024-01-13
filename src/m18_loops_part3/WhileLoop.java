package m18_loops_part3;

//Print the numbers which starts from 0 and ends at 10 (inclusive)
//0 1 2 3 4 5 6 7 8 9 10
public class WhileLoop {

    public static void main(String[] args) {

        //Complete using the FOR LOOP

        for (int i = 0; i < 11; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        //for loop always preferred if SPECIFIC ITERATION KNOWN

        //Complete using the WHILE LOOP
            //Extra steps:

        //since only condition accepted for while loop, give variable beforehand

        int j = 0; //if j value not updated will go on indefinite (0 repeated after reaching < 11)
                    //need iteration increasing j's value by 1

        while(j < 11){ //while loop terminated when 11 reached but repeated if still <
            System.out.print(j + " ");
            j++; //need given after the statement (while loop structure) then increase j by 1 each iteration

        }

        System.out.println();




    }
}
