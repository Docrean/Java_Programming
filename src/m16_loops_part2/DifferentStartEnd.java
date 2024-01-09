package m16_loops_part2;

public class DifferentStartEnd {

    public static void main(String[] args) {

        for (int i = 5; i < 21; ++i) {
            System.out.print(i + " ");
        }

        System.out.println();
                                                        //i's in each loop contained so no compile error
        System.out.println("----------------------");

        for (int i = 20; i > 10; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("----------------------------");


        for (int i = 10; i <= 100 ; i += 10) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("--------------------------------");


        for (int i = 50; i > 10; i -= 4) {
            System.out.print(i + " ");
        }


        System.out.println();

        System.out.println("---------------------------------");

        for (int i = 5; i < 10; i++) {
            System.out.println("Hello");
        }



    }
}


    /*
    1. Print the numbers which start from 5 and end at 20 (inclusive)
        in the same line with a space between the numbers.
    2. Print the numbers which start from 20 and ends at 10 (exclusive).
    3. Print the numbers which start from 10 and ends at 100 (inclusive)
        with an increment of 10.
    4. Print the numbers which start from 50 and ends at 10 (exclusive) with
        a decrement of 4.
    5. Print "Hello" five times.
     */