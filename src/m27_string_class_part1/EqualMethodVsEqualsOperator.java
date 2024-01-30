package m27_string_class_part1;

import org.w3c.dom.ls.LSOutput;

public class EqualMethodVsEqualsOperator {

    public static void main(String[] args) {

            String str1 = "Java", //only one string object go into the string pool (shared by str1/str2
                    str2 = "Java";

            System.out.println(str1 == str2); //same object wil return true
            System.out.println(str1.equals(str2));  //checking if str1 and str2 have same characters in the same order
                                                    //if want to compare if both strings have same text or not use equals method

            String str3 = new String("Java");
            String str4 = new String("Java");

            System.out.println(str3 == str4); //same object? false since each different memory allocations in heap outside string pool
            System.out.println(str3.equals(str4)); //true since same characters in same exact order


            System.out.println(str1.equals(str3)); //true since same string of text in same order even though different memory allocations


            String str5 = "java";
            //java is case sensitive
            System.out.println(str1.equals(str5)); //false since str1 upper case J and str5 lower case j

    }
}


        /*
       Create two String objects, str1, str2 with String literal, and initialize with “Java”.
Create two more String objects, str3, str4 with a new keyword, and initialize with “Java”.
Compare them using “equals()” method and “==” operator.

        Stack                           Heap
        str1---------------|       |-----------|
                           |-------|--->"Java" |<---------String pool
        str2---------------|       |           |
                                   |-----------|
        str3------------------------>"Java"

        str4------------------------>"Java"


         */