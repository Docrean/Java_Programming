package QuizzesAnswers;

public class LoopsAndMethods {

    public static void main(String[] args) {

        //Question 6.
        //How many times will the following loop print Hello World!?
        /*
      correct:  5
                4
                10
    my answer:  9

            loop counts up to 9 but prints Hello World 5x

         */
        for (int i = 0; i < 10; i++) {
            i += 1;
            System.out.println("Hello World!");

        }
    }
}
