package day06_ifStatements;

public class IfAndElsePractice {

    public static void main(String[] args) {

        int score = 35;

        if (score >= 60) {
            System.out.println("Failed");
        } else {
            System.out.println("Passed");
        }   /*
            If resolves to TRUE first code block is executed*****
            if resolves to false, second code block is run instead****
            */

            int testScore = 50;

            if (testScore >= 50) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

            int examScore = 50;
                //FIRST CONDITION MUST BE TRUE FOR COMPILE EXECUTION.
                //IF FIRST CONDITION IS FALSE IT WON'T RUN.
            if (examScore >=40) {
                System.out.println("Passed");

            if (examScore <=40) {
                System.out.println("Failed");
            }
            }

        int e = 10,
                f = 2;

        if (e > f){
            System.out.println(e + " is greater");
        }

        }
}
