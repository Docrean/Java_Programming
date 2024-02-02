package m32_arrays_part2;

public class SumOfOddNumbers {

    public static void main(String[] args) {


        int[] x = {2, 5, 7, 2, 3};
        int[] y = {3, 3, 2, 3, 2, 3};

        System.out.println(sumOfOddNumbers(x));//arguments x and y passed here
        System.out.println(sumOfOddNumbers(y));//   V
    }                       //sum of these-----------------------V
                            //                                   |
                            //                                   V
    public static int sumOfOddNumbers(int[] numbers){ //passed here to numbers variable
        int sum = 0;//     |-------------------------------------|
            //             V Used here in methods body to return the sum of odd numbers
        for (int number : numbers) {    //type numbers.for for Intellij shortcut to for each

            if(number % 2 != 0){ //if array numbers if length of 5 it iterates 5x
                sum +=number;
            }
        }                       //Iteration order of the for each? First to last element
                                //order cannot be changed.

                        //Which loop best for accessing each element? For each loop.
                        //as long as not using index numbers or making modifications to the array

        return sum; //since return method...must return a sum

    }
}
