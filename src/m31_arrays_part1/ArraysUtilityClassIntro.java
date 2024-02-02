package m31_arrays_part1;

import java.sql.SQLOutput;
import java.util.Arrays; //WITHOUT THIS ARRAY UTIL WILL NOT BE ABLE TO USE ANY ARRAY METHODS

public class ArraysUtilityClassIntro {

    public static void main(String[] args) {


        //toString(arrVar) Returns a string representation of the contents of this array.
        int[] numbers = {43, 12, 4, 1, 3, 5};

        System.out.println(numbers); //hash return on compiler (need to call the toString method from Arrays utility class)

        System.out.println(Arrays.toString(numbers)); //need to call the toString method from Arrays utility class then
                                                        //pass the array (numbers).

        //equals(arrVar1, arrVar2) Returns boolean, checks if both the arrays are equal or not.

        int[] n1 = {4, 5, 6, 10, 100}; //although both are same THEY ARE DIFFERENT OBJECTS IN MEMORY
        int[] n2 = {4, 5, 6, 10, 100};

        System.out.println(n1 == n2); //false since two different memory allocations
        System.out.println(Arrays.equals(n1, n2)); //true. elements and order of elements need to be the same


        //sort(arrVar) Sorts the elements of an array in ascending order
        int[] scores = {95, 85, 90, 65, 55, 75};
        String[] languages = {"Zulu", "Spanish", "Italian", "English", "Polish", "Arabic"};

        Arrays.sort(scores);     //void method. does not return any data.
        System.out.println(Arrays.toString(scores));

        Arrays.sort(languages); //call array method sort
        System.out.println(Arrays.toString(languages)); //Uppercase and lowercase letters have different ASCII values
                                                        //Sorting follows based on ASCII table from small to large


        //binarySearch(arrVar) Searches for the specified element in the array with the help of the Binary Search
        //Algorithm. The array must be sorted in ascending order

        int[] numX = {4, 6, 18, 7, 10, 55}; //binarySearch requires ASCENDING ORDER SORTING BEFORE BinarySearch

        Arrays.sort(numX); //call array method sort
        System.out.println(Arrays.binarySearch(numX, 7));



        // copyOf(arr, length): Copies the specified array (truncating or padding with default values if necessary)
        // and returns a new array.
        double[] d1 = {2.3, 4.5, 12.4};
        double[] d2 = d1; //not copied. only assigning d1 to second variable d2 here. not reassigning d1.
                            //one object ONLY.
        System.out.println(d1 == d2); //true both are same a d1 assigned as d2

        double[] d3 = Arrays.copyOf(d1, d1.length); //new array made(assign as d3 variable). d1.length is copy of entire array length
                                                    //d3 array now same as d1 variable in values and length.

        //double[] d3 = Arrays.copyOf(d1, 10); //although d1 is only 3, the 7 will print default value 0.0 7x

        System.out.println(Arrays.toString(d3)); //print d3 array variable using toString
        System.out.println(d1 == d3); //false. copyOf creates a new element in memory with new array d1.length



        // copyOfRange(arr, from, to): copies the specified range of the specified array, and returns new array
        int[] nums = {0, 1, 2, 3, 4, 5, 6}; //end index is excluded in the copyOfRange method
        int[] newNums = Arrays.copyOfRange(nums, 2, 5); //returns a new array. assign to variable int[] newNums

        System.out.println(Arrays.toString(newNums)); //print array using toString method.


        //fill(arr, value): Assigns the specified value to each element of the specified array.
        int[] nums2 = new int[5];

        Arrays.fill(nums2, 20); //call array method fill

        System.out.println(Arrays.toString(nums2));


        //Default value of int data type? 0

        //toString IS OVERLOADED...USE WITH ANY DATA TYPE


    }

}
