package m14_selection_statements_part1;

public class Grade {

    public static void main(String[] args) {

        int score = 75;
        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                System.out.println("Passed with Distinction");
            } else if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

        } else {
            System.out.println("Invalid Score");

        }

    }
}
