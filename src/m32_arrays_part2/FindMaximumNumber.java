package m32_arrays_part2;

public class FindMaximumNumber {

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

        int max = numbers[0]; //assuming..not final value yet

        for (int number : numbers) {

            if (number > max){
                max = number;
            }

        }
        return max;
    }

}


