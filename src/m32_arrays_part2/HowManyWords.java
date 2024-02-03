package m32_arrays_part2;

import java.util.Arrays;

public class HowManyWords {

    public static void main(String[] args) {

        String str = "In computer programming, white space refers to any character or sequence of characters" + " " +
                "that represent empty space or have no visible representation when rendered.";

        String[] words = str.split(" ");

        System.out.println(words.length);

        System.out.println("----------------------");

        char[] arr = str.replace(" ", "")
                        .replace("", "")
                                .replace(",","").toCharArray();


        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
    }
}
