package day03_variables;


public class PrimitiveDataTypesIntro {

    public static void main(String[] args) {


        // Datatype  variableName = Data;

        // byte a = "Java"; // byte ONLY accepts integer values (-128 ~ 127)
        // byte a = 28.5; //byte cannot take decimal numbers
        // byte a = 2000; // out of Byte's range (-128 ~ 127)
        byte a = 20;


        //price of the car is $17500 (to large for byte)

        short p = 17500;

        System.out.println("p");
        System.out.println(p);

        //salary is $95000

        int s = 95000; // PREFERRED

        System.out.println(s);

        // int n = 9999999999;
        long n =  9999999999l; // compiler defaults to int which is out of this range even though within longs range
                                //add L or l to signify

        // gpa is 3.5
        double gpa = 3.5; //preferred datatype for decimals

        float gpa2 = 3.5F; //double is preferred. set float with F or f.

    }

}
