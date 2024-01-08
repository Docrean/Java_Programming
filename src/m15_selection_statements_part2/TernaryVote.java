package m15_selection_statements_part2;

public class TernaryVote {

    public static void main(String[] args) {

        int age = 28;

        /*
        String result; //since one single if returning same value can put into ternary
        if (age >= 18) {
            result = "you are eligible to vote";
        } else {
            result = "you are not eligible to vote";
        }

        System.out.println(result);

        */

        String result = (age >= 18) ? "you are eligible to vote" : "you are not eligible to vote";
                                //meaning: when age is true, assign first string to value result
                                        //otherwise (:) 2nd string value is assigned to string result



         /*
        for ternary:
        basic if there should be no more than 1 block
        value from every block should be same type
         */

        int y = 10;
        y *= 2 + 3;
        System.out.println(y);
    }
}