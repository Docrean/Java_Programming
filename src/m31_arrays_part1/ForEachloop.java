package m31_arrays_part1;

import java.sql.SQLOutput;

public class ForEachloop {

    public static void main(String[] args) {

        int[] numbers = {15, 45, 60, 75, 90};
        //regular for loop gets the index number but will have to access those index elements after

        for (int each : numbers){ //use each as each represents each element in the numbers variable
            System.out.println(each); //iteration order is fixed and left to right in for each. If want to re-arrange
                                        //or do in reverse will have to use the for loop.
        }

        System.out.println("---------------------------");

        String[] names = {"Java", "Python", "C#", "Ruby"};

        for (String name : names) {
            System.out.println(name);

        }
    }
}
