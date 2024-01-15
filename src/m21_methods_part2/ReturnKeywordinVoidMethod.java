package m21_methods_part2;

public class ReturnKeywordinVoidMethod {

    public static void main(String[] args) {


        eligibleToVote(25);
        }

    public static void eligibleToVote(int age){
                        //can give nested if to check condition if false before body
        if(age < 0 || age > 150){
            System.err.println("Ivalid age: " + age); //If invalid don't want to execute method.
        }    return; //used for exiting the method    //use return.
                                                      //return can't return value to method if void
        /*if(age >= 18){
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }*/
    }
}

        //***If the method has a VOID return type, NO VALUE IS RETURNED-->method execution STOPS

