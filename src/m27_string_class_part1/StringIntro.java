package m27_string_class_part1;

public class StringIntro {

    public static void main(String[] args) {
        //string pool is a special storage space in heap memory where string literals are stored
        //2 identical string literals ONLY 1 IF STORED IN HEAP. That one object references both identical string literals
        String s1 = "Wooden spoon"; //String literal
        String s2 = "Wooden spoon"; //String literal
        //Only 1 of these referenced in heap33
        //Whenever a string literal is created, the compiler checks the String pool. If it encounters the same string,
        //it returns the same instance of the existing string to the variable.
        System.out.println(s1 == s2);
        // == operator checks if both are same. Compiler will print true if true

        String s3 = new String("Wooden spoon"); //new object in the heap(outside string pool)
        //Using "new" keyword creates a new object in the heap memory.
        String s4 = new String("Wooden spoon"); //new object

        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        System.out.println(s3 == s4); //returns false although same identical strings but referencing different objects
                                      //due to "new" keyword creating different locations in the heap outside the string
                                      //pool.

        //String pool contains UNIQUE STRING LITERALS. If both string literals identical only 1 is allocated in string
        //pool but shared by both variables referencing them.
        //using "new" keyword allocates memory OUTSIDE THE STRING POOL.

        System.out.println(s1 == s3); //false since both string literals in different memory locations
    }
}
