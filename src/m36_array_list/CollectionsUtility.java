package m36_array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 10, 8, 8, 8));
        System.out.println(numbers);

        // sort(list): Sorts the elements of the given list in natural order.
        Collections.sort(numbers); //re-sorts the Arraylist in ascending order.
        System.out.println(numbers);

        // binarySearch(list, element): Searches for the specified value in a sorted list in ascending order
        // using a binary search algorithm.
        int index = Collections.binarySearch(numbers, 5);
        System.out.println(index);


        // min(list): Returns the minimum element in the collection, according to the natural order.
        int min = Collections.min(numbers);
        System.out.println("min = " + min);


        // max(list): Returns the maximum element in the collection, according to the natural order.
        int max = Collections.max(numbers);
        System.out.println("max = " + max);


        // reverse(list): Reverses the order of elements in the list.
        Collections.reverse(numbers);
        System.out.println(numbers);


        // shuffle(list): Randomly shuffles (randomly reorder) the elements in the list.
        // Collections.shuffle(numbers);
        System.out.println(numbers);


        // rotate(list, distance): Rotates the elements in the list by the specified distance.
        Collections.rotate(numbers, 4);
        System.out.println(numbers);


        // replaceAll(list, oldValue, newValue): Replaces occurrences of oldValue with newValue in the list.
        Collections.replaceAll(numbers, 8, 100);
        System.out.println(numbers);


        // frequency(list, element): Returns the frequency of occurrence of a value in the collection.
        int count = Collections.frequency(numbers, 100);
        System.out.println(count);


        // fill(list, element): Replaces all elements of the list with the specified value.
        Collections.fill(numbers, 10);
        System.out.println(numbers);



        /*
        Method                                                  Explanation
        sort(list)                                  Sorts the elements of the given list in natural order.
        binarySearch(list, value)                   Searches for the specified value in a sorted list in ascending order using a binary
        search algorithm.
        min(list)                                   Returns the minimum element in the collection, according to the natural order.
        max(list)                                   Returns the maximum element in the collection, according to the natural order.
        fill(list, value)                           Replaces all elements of the list with the specified value.
        copy(list, list)                            Copies the elements from the source list to the destination list.
        reverse(list)                               Reverses the order of elements in the list.
        shuffle(list)                               Randomly shuffles (randomly reorder) the elements in the list.
        rotate(list, value)                         Rotates the elements in the list by the specified distance.
        replaceAll(list, oldValue, newValue)        Replaces occurrences of oldValue with newValue in the list.
        frequency(list, value) Returns the frequency of occurrence of a value in the collection.

         */










    }
}
