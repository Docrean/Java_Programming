package m33_java_lang_classes;

public class WrapperClassesIntro {

    public static void main(String[] args) {
        //Integer keyword. don't need to import as part of java.lang
        //.valueof since static method
        //int prim 1234 is passed into .valueOf method
        //since .valueof returns Integer wrapper class then can store in an int variable  = Integer.valueOf(1234)

        Integer num1 = Integer.valueOf(1234); //can provide an integer value or a String (wrapper converts)
        System.out.println(num1 + 1); //1235

        Integer num2 = Integer.valueOf("25"); //constructs an Integer wrapper object out of string
        System.out.println(num2 + 1); //26

        Double num3 = Double.valueOf("2.3"); //constructs a Double wrapper object out of string
        System.out.println(num3 + 2);

        Boolean bool1 = Boolean.valueOf(true); //constructs a Boolean wrapper class object
        System.out.println(bool1);

        Boolean bool2 = Boolean.valueOf("FALSE"); //Case insensitive
        System.out.println(bool2);

        //value can be the primitive being called or String since this method OVERLOADS
        //calling the value method returns an object whether an integer, boolean, etc...

        //Creating wrapper objects with new keyword has been DEPRECATED SINCE JAVA 9 so valueOf()

       // Integer n = new Integer(25); ERROR
    }
}


        /*
        valueOf() method creates a Wrapper object for a given primitive or String.

                    Method                              Return Type
            Integer.valueOf(intValue)
            Integer.valueOf(str)                         Integer

            Double.valueOf(doubleValue)
            Double.valueOf(str)                          Double

            Character.valueOf(charValue)                 Character

            Boolean.valueOf(booleanValue)
            Boolean.valueOf(str)                         Boolean

            Long.valueOf(longValue)
            Long.valueOf(str)                            Long

            Short.valueOf(shortValue)
            Short.valueOf(str)                           Short

            Byte.valueOf(byteValue)                      Byte
         */