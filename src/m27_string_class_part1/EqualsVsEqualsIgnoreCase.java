package m27_string_class_part1;

import java.sql.SQLOutput;

public class EqualsVsEqualsIgnoreCase {

    public static void main(String[] args) {

        String str1 = "CYDEO";
        String str2 = "cydeo";

        System.out.println(str1 == str2); //false as two different string literals in pool(not same as one)
        System.out.println(str1.equals(str2)); //false. only true if same characters in same order
        System.out.println(str1.equalsIgnoreCase(str2)); //true as same characters with ignored case.
    }


}
