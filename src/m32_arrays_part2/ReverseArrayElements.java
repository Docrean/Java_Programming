package m32_arrays_part2;

import java.util.Arrays;

public class ReverseArrayElements {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int[] result = reverseArray(numbers);
        System.out.println();

        System.out.println(Arrays.toString(result));
    }

    public static int[] reverseArray(int[] array){ //{0, 1, 2, 3, 4, 5} //need the array itself to reverse the method
                                            //argument given needs a parameter to pass(int[]) in this case
                                            //elements in the custom method must match elements in the array
        int[] reverseArray = new int[array.length];//1. need to create array that matches the method array and its argument parameter

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) { //index of last array length - 1 given to new variable j = 0
          reverseArray[j] = array[i];                                    //everytime index number decreases, j index should increase from 0, 1, 2, 3
        }

        return reverseArray;                    //METHOD OVERLOADING LETS YOU USE the SAME METHOD

    }                                   //how to know if array will be enough size to contain all elements of given array in custom method?
}                                               //...Need to instantiate the array. when instantiating, need to set the last of the array
                                                //which determines how many elements the array can have.

                                                //is it possible to use the for-each loop to access elements of an array in reverse order?
                                                    //not best in this case as it only excutes left to right

                                    //1 Create Array custom method reverseArray
                                    //2 pass the reversedArray to custom method array by instantiation
                                    //3 create for loop to count in reverse order from array.length -1 to j = 0 by iterating
                                        //i-- and j++ through reversedArray[j] = array[i].
                                    //4 return array from the method through return reverseArray.
                                    //5 return type reverseArray of the int[] array matches value returning from the method
                                    //6 call the method in the main methods body
                                    //7 create array variable with int data to which the custom reverse method will reverse iterate(10, 20, 30, 40, 50;
                                    //8 call the reverseArray under the array numbers variable and add the argument numbers
                                    //9 assign reversedArray(numbers) to int[] result variable