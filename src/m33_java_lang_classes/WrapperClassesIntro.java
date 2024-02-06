package m33_java_lang_classes;

public class WrapperClassesIntro {

    public static void main(String[] args) {
        //Integer keyword. don't need to import as part of java.lang
        //.valueof since static method
        //int prim 1234 is passed into .valueOf method
        //since .valueof returns Integer wrapper class then can store in an int variable  = Integer.valueOf(1234)

       Integer num1 = Integer.valueOf(1234);
        System.out.println(num1 + 1); //1235

        Integer.valueOf("25"); //construct an integer out of this string
    }
}
