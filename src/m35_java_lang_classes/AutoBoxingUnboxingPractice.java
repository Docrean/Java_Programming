package m35_java_lang_classes;

import java.util.Arrays;

public class AutoBoxingUnboxingPractice {

    public static void main(String[] args) {

        Integer[] numbers = new Integer[5];

        System.out.println(Arrays.toString(numbers)); //5 nulls as null is default value for all non prim data types

        numbers[0] = 10; //each element in the array is a wrapper class int. assigning prim value 10 to integer array
        //each element in the array is a wrapper class integer? Yes.
        //assigning prim value to integer. AUTOBOXING.
        //primitive is converted to the wrapper class object.
        //the array is the wrapper class integer. *every single element in the array IS AN INTEGER OBJECT
        //the prim 10 is CONVERTED TO THE OBJECT.....AUTOBOXING.
        //Can do the same for other INDEXES
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        System.out.println(Arrays.toString(numbers)); //20,30,40...all int numbers but assigned to Integer wrapper class

        for (Integer number : numbers) { //call each object from array. Integer as objet bcuz each element as integer in array
            int value = number; //Unboxing. int wrapper class object "number" directly assigned to prim int variable "value."

            System.out.println(value); //prints prim values after Unboxing.
        }
    }
}
