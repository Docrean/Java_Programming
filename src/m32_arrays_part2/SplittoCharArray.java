package m32_arrays_part2;

import java.util.Arrays;
public class SplittoCharArray {

    public static void main(String[] args) {

        String str = "Apple, Banana, Orange, Cherry, Strawberry"; //4 spaces will create 5 elements so 5 string elements

       String[] fruits = str.split(", ");

        System.out.println(Arrays.toString(fruits));

        System.out.println("-------------------------------");

        String str2 = "hello";

        char[] charArray = str2.toCharArray();

        System.out.println(Arrays.toString(charArray));
    }
}
