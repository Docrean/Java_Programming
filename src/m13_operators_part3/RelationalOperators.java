package m13_operators_part3;

public class RelationalOperators {

    public static void main(String[] args) {

        int x = 0;

        System.out.println(x < 1);
        //                 0 < 1 ==> true

        System.out.println(x > 0);
        //                 0 > 0 ==> false

        System.out.println(x >= 0);
        //                 0 >= 0 ==> true

        System.out.println(x <= 10);
        //                 0 <= 10 ==> true

        System.out.println(x >= 25);
        //                 0 >= 25 ==> false

        System.out.println(x <= -10);
        //                 0 <= -10 ==> false

        System.out.println(x == 0);
        //                 0 == 0 ==> true

        System.out.println(x == 100);
        //                 0 == 100 ==> false

        System.out.println(x != 0);
        //                 0 != 0 ==> false

        System.out.println(x != 100);
        //                 0 != 100 ==> true

        System.out.println("Cydeo" == "Java"); // false

        System.out.println("Java" == "Java"); // true

        System.out.println("Java" != "Python"); // true

    }
}
