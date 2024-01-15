package m21_methods_part2;

public class ParametersArgumentsIntro {

    public static void main(String[] args) {



        eligibleToVote(25); //"25" or 25.0 does not match method signature
                                //make sure it matches.

        int age = 16;
        eligibleToVote(age);

        //argument is assigned to parameter variable
        //make sure argument matches the parameter type
    }

    public static void eligibleToVote(int age) {
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }

}
