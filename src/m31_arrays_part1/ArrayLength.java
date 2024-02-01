package m31_arrays_part1;

public class ArrayLength {

    public static void main(String[] args) {

        String[] names = {"Brandon", "Brandon", "Aaron", "Hazel"};

        int lengthOfArray = names.length;

        System.out.println("lengthOfArray = " + lengthOfArray);

        //What is the last index number of this array of strings? 3 (0, 1, 2, 3)

        //How can you determine the last index number of an array? What is the formula? Length -1 (Same for String)

        int lastIndex = lengthOfArray - 1;

        //How can you access an element in an array? use [] brackets to contain last index number

        System.out.println(names[lastIndex]);


        System.out.println("-------------------------------");

        //Processing Array With Loops

        //Why prefer using a for loop over a while loop when processing an array?
        //For loop PREFERRED WHEN ITERATIONS KNOWN IN ADVANCE

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        /*
        for (int i = 0; i < numbers.length; i++) { //numbers.length includes length -1 (if 10 than length -1 is 9)
            System.out.println(numbers[i]);     //using the loop to get the elements of the array of numbers
        */  //^iterated the array from first the last. WHAT ABOUT LAST TO FIRST?

      /*  for (int i = numbers.length-1; i >= 0; i--) {   //1. i starts from end of numbers length (length -1)
                                                        //2. iterates until >= 0 since iterating in reverse towards 0
                                                        //3. i-- iterates in reverse direction down to 0.
            System.out.println(numbers[i]);
       */

        //best way to iterate numbers in one statement is use the numbers variable with the . operator
        //left to right: numbers.fori
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
        System.out.println("-------------------------------------------------");
        //right to left: numbers.forr

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }



        }
        }











