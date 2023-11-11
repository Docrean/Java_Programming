package day05_operators;

public class UnaryOperators {

    public static void main(String[] args) {

        //pre inc/dec
            /*
            before operand
            CHANGES IMMEDIATELY
            NEW VALUE USED FIRST
            */


        int x = 10;

        System.out.println( ++x ); //11
                            //x increased by 1
                            //next souT (x) prints new value 11
        System.out.println(x);
                        //where ++ is operator & x is operand)
                        //this case is pre as ++ is before x)
                        //pre = changed immediately

        int y = 100;

        System.out.println( --y ); //99
        System.out.println(y);

        System.out.println("------------------------------------");

        //post inc/dec
              /*
              AFTER operand
              WILL NOT CHANGE IMMEDIATELY
              OLD VALUE IS USED FIRST
              */

        int a = 50;

        System.out.println( a++ ); //50. NOT IMMEDIATE.
        System.out.println(a); //will give 51

        int b = 25;

        System.out.println(b--); //25
        System.out.println(b); //24

        int n = 30;

        int m = n++; // m = 30, n =31
              //n++ assigned but since post won't pass yet
        System.out.println("n = " + n);
                            //since assigning n++ now n = 31
        System.out.println("m = " + m);
                            //passing old value of n first
                            //not immediately but eventually 31

        int z = 60;
                //z given containing value of 60;
                //give post dec z-- and assign to q
        int q = z--; //what is being assigned to q here?
                             //----->q=60 FIRST
        System.out.println("z = " + z);
                             //then z = 59
        System.out.println("q = " + q);
                             //----->q=60 FIRST


    }
}
