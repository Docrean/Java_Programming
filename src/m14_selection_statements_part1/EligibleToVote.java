package m14_selection_statements_part1;

public class EligibleToVote {

    public static void main(String[] args) {


        int age = 17;

        if (age >= 18){
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

        /*My initial solution (extra)

        int age = 18;
        boolean isEligibleToVote = true;

        if (age >= 18){
            isEligibleToVote = true;
        } else if (age <= 15) {
            isEligibleToVote = false;
        }

        System.out.println("You are eligible to vote = " + isEligibleToVote);

         */
    }
}
