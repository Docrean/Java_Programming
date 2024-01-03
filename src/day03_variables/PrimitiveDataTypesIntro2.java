package day03_variables;

public class PrimitiveDataTypesIntro2 {

    public static void main(String[] args) {

        // DataType variableName = Data;

        //char: for single character ONLY. Use ' ' instead of " "

        char a = '@'; // A, a, $, @, ! also can use number  0 to 65 535 but from the ASCII table
        char b = '!'; // single characters in single quote
        // char ab = 'ab';


        System.out.println(a);
        System.out.println(b);

        System.out.println("-----------------------------------------");

        char ch1 = 'A';
        char ch2 = 65;

        System.out.println(ch1);
        System.out.println(ch2);

        System.out.println("-----------------------------------------");

        char ch3 = 8000; //more than 127 will show characters not on ASCII (127 max)

        System.out.println(ch3);

        System.out.println("-----------------------------------------");

        int sum = 'A' + 'B';

        System.out.println(sum); // 131 because ASCII A is 65 and B is 66 so 131

        System.out.println("-----------------------------------------");

        // boolean r1 = 123;
        // boolean r2 = 2.5;
        // boolean r3 = "Java"; //compile because not true or false or comparing true false

        boolean r4 = true;
        boolean r5 = false;

        System.out.println("r4 = " + r4);
        System.out.println("r5 = " + r5);

        boolean r6 = 100 > 10; // true
        boolean r7 = 0 < -1; // false

        System.out.println(r6);
        System.out.println(r7);


        //Example variable definitions
        /*
        byte inches;
        int speed;
        short month;
        float saleCommission;
        double distance
        */

    }

}
