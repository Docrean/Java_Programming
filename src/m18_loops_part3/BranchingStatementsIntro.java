package m18_loops_part3;

public class BranchingStatementsIntro {

    public static void main(String[] args) {


                        //Branching Statement

        for (char i = 'A'; i < 'E'; i++) { //What if want to break out After B and before C?
            if(i == 'C'){
                break;      //EXITS THE CURRENT LOO
            }               //forcibly terminating loop before LAST ITERATION
                            //place break under the condition of where to exit before

            System.out.print(i + " ");
        }

        System.out.println("Hello");


        System.out.println("-------------------------------------------");

                        //Continue Statement
        for (int i = 1; i < 6; i++) {
            if(i == 3){     //create if condition to specify the certain iteration
                continue;   //give before print statement so number 3 not printed
                            //JUMPS TO NEXT ITERATION
            }
            System.out.println(i);
        }
                            //if given after, will execute print then skip 3




    }
}
