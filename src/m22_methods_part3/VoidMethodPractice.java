package m22_methods_part3;

public class VoidMethodPractice {

    public static void main(String[] args) {

        displaygrade(150); //Argument for parameter
                        //What is score 150?
    }                   //Create return statement (pre condition NESTED IF)

    public static void displaygrade(int score) { //providing parameter now requires AN ARGUMENT

        if(score < 0 || score > 100) {
            System.err.println("Invalid score: " + score);
            return; //As soon as before if condition is true, return will exit and not run other conditions
        }               //CAN ONLY BE USED FOR EXITING
        if (score >= 90) {
            System.out.println("Excellent, You made an A");
        } else if (score >= 80) {
            System.out.println("Good job, You made a B");
        } else if (score >= 70) {
            System.out.println("Good, You made a C");
        } else if (score >= 60) {
            System.out.println("No good, You made a D");
        } else {
            System.out.println("F you failed");
        }
    }

}
        /*
        Create a method named displayGrade that passes an int parameter named score
        and displays the grade of the student.


            Example:
                displayGrade(95);

                Output:
                    Excellent, You made an A
         */