package m18_loops_part3;

public class DoWhileLoop {

    public static void main(String[] args) {

        //BOTH GOOD FOR UNKNOWN # OF CONDITIONS
        //DO-WHILE STILL EXECUTED ONCE IF CONDITION FALSE
            //IF NEED CODE FRAGMENT EXECUTED REGARDLESS OF CONDITION..BEFORE REPEATING...USE DO-WHILE

    int n =100;

    while(n < 0){ //false. WON'T EXECUTE IF FALSE
            System.out.println("While loop: Hello World");
        }

        System.out.println("---------------------------------");


        do{ //DO BLOCK EXECUTED BEFORE CONDITION CHECKED
            System.out.println("Do-While loop: Hello World");
        } while(n < 0); //false. WILL EXECUTE IF FALSE SINCE BLOCK EXECUTED BEFORE BOOLEAN

        System.out.println("------------------------------------------");

            //Print numbers which starts from 0 and ends at 10 (inclusive).
                    // 0 1 2 3 4 5 6 7 8 9 10
        //if want to use do while loop for specific code fragment for fixed times,
        //need to give initialization before declaration...
        //can't give initialization, declaration and condition all at once

        int i = 0; //1. initialization
        do {
            System.out.print(i + " "); //3. Code fragment
            i++;//4. iteration (placed after code fragment to count to 10
        }while(i < 11); //2. condition

        //IF repetition IS UNKNOWN, don't need to set initilization or iterator just need condition
        //repeat the code fragments and at that time use while or do-while loops.



    }
}
