package m18_loops_part3;

public class LabelPractice {

    public static void main(String[] args) {

        int counter = 0;

        outer:
        for (int i = 0; i <= 10; i++) {

            inner:
            for (int j = 4; j >= 0 ; j++) {

                if (i == j) { //1.1 skips break outer since this is false until i == j

                    break outer; //1. skips break outer since i is not yet == j
                } else {

                    counter++; //2. counter add 1
                    break inner;
                }

            }
            //3. nothing in outer loop. break go back to the beginning of outer loop

        }
        System.out.print(counter);
    }
}
