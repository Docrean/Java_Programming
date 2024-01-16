package m18_loops_part3;

public class BranchingStatementsReturn {

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            if(i == 3){
                //continue; //skips iteration 3 and JUMPS TO NEXT ITERATION OF LOOP
                //break; //JUMPS OUT OF LOOP before 3 (prints 1 and 2) but still prints anything outside loop body
                return; //exits method if if condition true (prints 1 and 2)
                        //but not same as break. JUMPS OUT OF METHOD
            }
            System.out.println(i);
        }

        System.out.println("Hello world"); //Will print with break (inside loop stop only) but not return (whole method
        System.out.println("Hello world"); //stopped including inner and outer loop once if condition becomes true)
    }
}
