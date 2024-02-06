package m35_java_lang_classes;

public class ParsingValues {

    public static void main(String[] args) {

        String str = "20";
        Integer.parseInt(str); //.parse is part of integer wrapper class
                        //str passed as argument
        int num = Integer.parseInt(str); //num is primitive

        Integer num1 = Integer.valueOf(str); //str returns as OBJECT...not as prim int
        //How to autobox? assign num prim to Integer wrapper class variable num1
        Integer num2 = num; //Autoboxing

        System.out.println(num); //primitive variable
        System.out.println(num1); //object variable
        System.out.println(num2); //object variable

        System.out.println("-----------------------------------");

        String s = "20.5";
        double num6 = Double.parseDouble(s); //returns primitive double so directly assign to primitive double variable num6
                               //if assigned to Wrapper class double then will AutoBox
                               //if don't want any Autoboxing then just assign to same type

        //convert to a prim data type using parse method from the double wrapper class
        //convert to a wrapper class using valueof method
        System.out.println(s + 1); //prints 20.51 original string value and concat 1
        System.out.println(num6 + 1);//prints 21.5 parsing string "20.5"

        //double num4 = Double.valueOf(s); //.valueof wrapper method returns double object not double primitive
                                          //Assign same type Double with string variable so no AutoBoxing occurs.
                                          //double object "Double.valueof(s) now stored/converted into the primitive //unboxing
                                          //Use Double as wrapper class to prevent unboxing Double wrapper to prim convert

        Double num4 = Double.valueOf(s); //Wrapper class double to get the primitive from original String
        System.out.println(num4 + 3);//num4 returns primitive as 20.5

        //Use parse method to get the primitive value


    }
}
