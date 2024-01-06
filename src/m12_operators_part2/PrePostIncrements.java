package m12_operators_part2;

public class PrePostIncrements {

    public static void main(String[] args) {

        int x = 10;
        int y = 22;

        System.out.println(x++ + x);
        //1.                 10  + 11 = 21 where x = 11

        System.out.println(x++ + ++y);
        //2.                12  +  23 = 34 where x = 12 and y = 23
        //                 11(1.)

        System.out.println(++x % 5);
        //                  13 % 5 = 3 where x = 13

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
