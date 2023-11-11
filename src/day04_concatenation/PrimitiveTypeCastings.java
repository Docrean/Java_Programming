package day04_concatenation;

import java.sql.SQLOutput;

public class PrimitiveTypeCastings {

    public static void main(String[] args) {


        //--------------Implicit Casting --------------

        byte a = 15;
        short b = a;
        // short b = (short)a. done implicitly so no need for (short)

        System.out.println(b);

        int c = a; //implicit casting

        long d = 3000L;

        float f = d; //implicit casting

        //----- Explicit Casting ----------

        int x = 100;

        byte y = (byte) x;
                //explicitly cast using cast operator (byte)
                //use same dataType with explicit cast operator

        float z = 20.8f;

        short q = (short)z; // z = 20.8
                //use dataType

        System.out.println(q);

        double n1 = 2.5;

        byte n2 = (byte) n1;

        System.out.println(n2);

        System.out.println("----------------------------");

        int num = 500;

        byte result = (byte) num;

        System.out.println(result);

        int r = 50000;

        short t = (short) r;

        System.out.println("-------------------------------");

        double u = 3000.5;

        int p = (int) u; //explicit casting

        System.out.println(p);

        int o = 100;

        double d1 = o;







    }



}
