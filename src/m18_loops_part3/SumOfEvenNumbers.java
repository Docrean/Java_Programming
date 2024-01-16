package m18_loops_part3;

public class SumOfEvenNumbers {

    public static void main(String[] args) {


        //For loop solution:

        int sum = 0; //1. establish variable to hold sum of numbers

        for (int i = 0; i <= 10; i++) { //2. with for loop: iterate numbers 1 to 10
            if (i % 2 == 0){  //3. condition: need to find sum of even numbers (if statement)
                sum += i;           //4. if sum is divisible by 2 or == 0
            }       //5. collect sum of even numbers up to <= 10.
        }
        System.out.println("Sum of even numbers = " + sum);


        /*for loop vs. while loop
            For loop: For exact known iteration number
            While loop: Focus is on the condition
         */

        //While loop solution:
            //Don't know how many times its going to repeat
        int num = 0; //1. Create initialization from 0
        int sumEven = 0; //2. need to collect sum of even numbers starting from 0

            while (num <= 10){  //3. Set condition: iterated <= 10.  //put inside while until condition becomes false
                 if (num % 2 == 0) {
                     sumEven = sumEven + num; //5. whenever number is even(divisible to 2), collect sumEven then iterate
                 }                              //num++ to <=10
                num++; //4. increment set in while loop body. Not going to immediately increase,
            }               //need to iterate only even numbers. Set even number iteration before step
                            // 4. If num++ placed in body immediately will create an infinite loop up
                            //10 and repeating indefinitely.
        System.out.println("Sum of the nums = " + sumEven);
    }
}
