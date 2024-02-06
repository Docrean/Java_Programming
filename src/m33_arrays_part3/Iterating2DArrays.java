package m33_arrays_part3;

import java.util.Arrays;

public class Iterating2DArrays {

    public static void main(String[] args) {

                                        //

        //index[]:                0               1                  2     <---3 Index #s of 2d array start from 0 1 2
        int[][] array2d = {{10, 22, 32},{23, 28, 33, 35, 28}, {17, 7, 23, 45}};
        //elements[][]:     0    1   2    0   1   2   3   4    0   1  2   3 <---Index #s of 2d array elements

        for (int i = 0; i < array2d.length; i++) { //i is #'s 0 to 3 iterating 2D array through array2d variable

          int[] each1DArray = array2d[i]; //returns every single 1D array of the 2d array as int

            System.out.println(Arrays.toString(each1DArray));

            for (int j = 0; j < each1DArray.length; j++) { //j as index # of each 1D array through each1DArray variable
                                                             //i now iterating each 2D array

                System.out.println(each1DArray[j]); //print each individual array element through each1DArray variable

            }
        }

                        //Iteration order of the for-each loop?    // array2d.for keyword using each1DArray variable

        System.out.println("------------------------------------");

        for (int[] each1DArray : array2d) { //1D array default bcuz at each index of the 2D array you have 1D arrays

            System.out.println(Arrays.toString(each1DArray));

            for (int eachElement : each1DArray) { //elements of the 1D array
                System.out.println(eachElement);

                //cannot reverse order due to for-each loop being
            }
        }


                    //Print Array in reverse use for-loop          //array2D.forr keyword

        System.out.println("------------------------------");

        for (int i = array2d.length - 1; i >= 0; i--) { //i is the index # of the 2d array. j is each index # of 1D array elements
            for (int j = array2d[i].length - 1; j >= 0; j--) { //j set to last index number of the array .length -1

                System.out.println(array2d[i][j]); //since accessing elements need 2 square brackets
                                                     //i is the index # of the 2d array. j is each index # of 1D array elements
            } //since 2d array i provided in 1st square bracket provides each single 1D array
        }

    }
}
