package m16_loops_part1;

public class JD05ForLoopspt1Lab1to5 {

    public static void main(String[] args) {

        //Task 1. print even numbers between 0 and 10 inclusive
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("-----------------------");

        //Task 2

        System.out.print(1);  // - will be in between odd numbers

        for (int i = 3; i <=19; i++) {  //or i += 2 without if
            if (i % 2 == 1){            //or if with % 2 == 1
                System.out.print("-" + i);
            }
        }
        //Task 3 Sum of even numbers 1-10
        System.out.println();
        System.out.println("-----------------------");

            int sumEven = 0;
            int sumOdd = 0;

        for (int y = 0; y <= 10; y+=2) {
            sumEven += y;
        }

        for (int x = 1; x <= 10; x+=2) {
            sumOdd += x;
        }

        System.out.println("Sum of even number = " + sumEven);
        System.out.println("Sum of odd number = " + sumOdd);


        System.out.println();
        System.out.println("-----------------------");


        int sumEven1 = 0;
        int sumOdd1 = 0;

        for (int i = 0; i <= 10; i++) {
            if(i % 2==0){
                sumEven1 += i;
            } else {
                sumOdd1 += i;

            }

        }
        System.out.println("sum of even number " + sumEven1);
        System.out.println("sum of odd nunber " + sumOdd1);
        }



    }

