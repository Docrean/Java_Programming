package m10_variables_data_types;

public class JD02Lab1Task1 {

    public static void main(String[] args) {

        int a, b, c;

        a = 10;
        b = 20;

        c = a;
        a = b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        /*
        Set up the steps:
                                         int = a, b, c
      1. Set up the given (declarations) a = 10 b = 20
                           a        b       c
                           10       20

      2. express c = a (assign a as c)
                           a        b       c
                           10       20      10 (a is now c)

      3. express a = b (assign b as a)
                           a                   b       c
                           20(b is now a)      20      10

         */
    }
}
