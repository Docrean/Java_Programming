package m33_arrays_part3;

import java.util.Arrays;
import java.util.Enumeration;

public class TwoDimensionalArrays {

    public static void main(String[] args) {

        //2d arrays for storing multiple 1d arrays
        //2d arrays are "Arrays of Arrays"

        int[] array1 = {10, 20, 30}; //1st 1d array
        int[] array2 = {40, 50, 60, 70}; //2nd 1d array
        int[] array3 = {80, 90}; //3rd 1d array

                        //instantiate new
        int[][] nums = new int[3][]; //Index 0, 1, 2
                                        //1st [] number of 1d arrays (rows) (must give)--2d array "Arrays of Arrays
                                        //2nd [] number of columns (optional)--only if same # of elements
        nums[0] = array1; //Single bracket accesses 2d array nums from 1d array numbers[]
        nums[1] = array2; //2D array called from index 1 in nums variable
        nums[2] = array3; //3D array called from index 2 in nums variable
        //nums = 2d array variable
        //System.out.println(Arrays.toString(nums)); //toString only works with 1d arrays
        System.out.println(Arrays.deepToString(nums)); //deepToString only works with 2d arrays

        System.out.println(Arrays.toString(nums[1])); //[1] Array variable from 2d array. Since 1d array use toString

        System.out.println(nums[1][3]);
        System.out.println(nums[2][1]);

        System.out.println("---------------------");
            //instantiate an array with 2d curly braces
        //index[]:                0               1              2
        int[][] array2d = {{10, 22, 32},{23, 28, 33, 35, 28}, {17, 7}};
        //elements[][]:     0    1   2    0   1   2   3   4    0   1
        System.out.println(array2d.length);

        System.out.println(Arrays.deepToString(array2d));

        //deepToString converts multidimensional arrays to strings

        System.out.println(Arrays.toString(array2d[1]));

        //toString prints 1d arrays

        System.out.println(array2d[1][2]);

        //What if want to update element [0][2]?
        //1st Call element
        array2d[0][2] = 3000;
        //2nd assign new value
        System.out.println(Arrays.deepToString(array2d));

        //What if want to update element [2][0]?
        //1st call element
        array2d[2][0] = 2800;
        //2nd assign new value
        System.out.println(Arrays.deepToString(array2d));


        //formula for all multi-dimensional arrays

        //n dimensional array is container (n-1) dimensional arrays
        //2d array is container for 1d arrays
        //3d array is containder for 2d arrays
    }
}
