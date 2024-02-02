package m32_arrays_part2;

public class FindMaximumNumber {


    public static void main(String[] args) { //this calls the custom method(array) into the main methods body

        int[] x = {10, 2, 3, 40, 20};

        System.out.println(maxValue(x)); //call th custom method into the print statements body because its a return
                                        //method.
                                                    //CAN CHECK CUSTOM METHOD maxValue WITH ANOTHER Array as y

        int[] y = {11, 30, 40, 50, 5};

        System.out.println(maxValue(y)); //y is the argument
    }



    public static int maxValue(int[] numbers) { /* numbers as parameter
    apply if statement to check if array is null or array length is 0
                                                1. Make sure methods body is not empty nor null
                                                array object(numbers) must be provided to the method
                                                won't be able to apply the loop to iterate elements of the array
                                                */
        if (numbers == null || numbers.length == 0) {
            System.out.println("Array is empty");
            return 0;
        }
        //{10, 2, 3, 40, 20<---->Array variable x
        int max = numbers[0]; //10

        for (int number : numbers) { //1st iteration 10. 2nd iteration 2.
            if (number > max){ //is 10 greater than the current maximum number 10?
                max = number;
            }
                //^ OPERATION TO GET A MAX NUMBER FROM AN ARRAY
        }
        return max;
    }

}


