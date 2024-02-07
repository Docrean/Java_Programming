package m36_array_list;

import java.util.ArrayList; //all collection frameworks are preseted in this util package.
import java.util.Arrays;

public class ArrayListIntro {

    public static void main(String[] args) {

        //Compare Array vs. ArrayList

        System.out.println("-----------Array-------------");

        int[] array = new int[5]; //not dynamic. fixed.

        System.out.println(Arrays.toString(array)); //50's as int default is 0

        int[] array2 = {10, 20, 30, 40, 50};

        System.out.println("-----------ArrayList----------");
                                //new keyword to instantiate the ArrayList object
        ArrayList<Integer> list1 = new ArrayList<>(); //don't have to specify in 2nd angle brackets as first
                            //can use int inside <> as ArrayList DOES NOT SUPPORT NON PRIMS
                            //Use wrapper class Integer instead.

        System.out.println(list1); //won't print any elements just []. need to add elements

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50)); //asList method is from arrays utility class
                                                        //array of elements 10, 20...converts to the asList and then the asList elements
                                                        //are added to the array list2 through the Arraylist constructor during object
                                                        //creation.

        System.out.println(list2);




    }

}
