package m35_java_lang_classes;

public class AutoBoxingUnboxingIntro {

    public static void main(String[] args) {

        //AutoBoxing: Prim-->Object

        int a = 100; //dont implicitly.
        Integer num1 = a; //primitive int assigned to Integer wrapper class with variable num1 referenced
                          // to Integer object with value of a as 100. Value method is being called Implicitly and the
                          //primitive data value of a passed to the value method of the Integer Wrapper Class. Then get
                          //the integer object. That integer object is now being store into the variable. AUTOBOXING.

        //Always pick the RIGHT WRAPPER CLASS FOR THAT PRIMITIVE.

        long b = 200;
        //Integer num3 = b; won't work
        Long num2 = b; //assigned prim variable b to Long wrapper clas object directly.

        byte c = 50;
        Byte num3 = 50;; //assigned prim variable c to Long wrapper clas object directly.



        //Unboxing Object-->Prim

        Integer x = 100;

        int y = x; //can directly assign wrapper class x to y as done implicitly

        long z = x; //smaller prim integer x can be implicitly assigned to long z. not allowed vice versa.

        Double m = 20.5;
        double n = m;

       // float f = m; //can be auto converted to double prim but double > float so will give compile error.


    }
}
