package m31_arrays_part1;

import java.util.Arrays;

public class DeclareArray {

    public static void main(String[] args) {
                                //to declare an array, define the variable type with square brackets
        int[] scores;           //instantiate the array or won't be able to use scores variable nor store
        scores = new int[4];                          //and access elements from the scores variable
                                //new keyword initializes new object. array type is int(object is int)
                                //specify the size of the array.
                                //Array size is FIXED.
                                //Default value of int is 0, so [4] 0's are specified.

        scores[0] = 85;
        scores[1] = 70;
        scores[2] = 95;
        scores[3] = 90;

       // System.out.println(scores); //Why hashcode prints when passing an object in the print statement?
        System.out.println(Arrays.toString(scores));//twoString method needs to be executed automatically whenever an object is
        System.out.println(scores[0]);   //How to print first 0. call the array scores with []
                            //returns element at 0 from the array
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        //System.out.println(scores[4]); //compiler error. only 4 elements in array.

                                        // passed in the print statement. need to call the twoString with Array as its not
                                        //passed automatically.
                                        //CALL THE toSTRING to print the ARRAY OBJECT
                                    //The arrays class included toString() method that converts an array into a string
                                        //representation.


        System.out.println("----------------------------------------");

       // String[] names = new String[5]; //will return 5 nulls as no names given to variable
                                        //only use this way of declaring when not knowing the elements
        String[] names = {"Java", "Python", "C#", "Ruby", "C++"}; //use {} if exact elements are known.
                        //curly brace initiation(set to 5 string elements)

        System.out.println( Arrays.toString(names));

        /*int[] numbers;
        numbers = {10, 20, 30, 40}; This won't work has to be within same line as one statement
        */

    }
}
