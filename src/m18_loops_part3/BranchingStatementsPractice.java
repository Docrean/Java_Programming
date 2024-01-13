package m18_loops_part3;

public class BranchingStatementsPractice {

    public static void main(String[] args) {

    int number = 0; //1. initialize

    while (number < 15) { //2. while loop(check condition)
                                //if number < 15 true next line
        number++; //3.number increased by 1

        if(number <= 5) { //4. if number <= 5 is true then if executes
                            //6. Once number greater than 5 (false) skips to line 19.
            System.out.println("Skipping number " + number);
            continue; //5. jumps back to while loop line 9
        }

        System.out.println("number = " + number); //7. continue here

        if (number >= 10) { //8. 6 is < 10 so false (back to while loop beginning)

            System.out.println("Breaking at " + number); //9. once number >= 10 this println runs and then breaks out
            break;
        }


    }


    }
}
