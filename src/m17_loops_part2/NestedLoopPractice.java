package m17_loops_part2;

public class NestedLoopPractice {

    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) { //for every 1x outer loop iteration the inner loop iterates 3x
            System.out.println("Outer Loop Iteration " + i);
            for (int j = 1; j < 4; j++) {
                System.out.println("i = " + i + " | j = " + j);
            }

        }



    }
}
