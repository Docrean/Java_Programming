package m12_operators_part2;

public class IncrementDecrement {

    public static void main(String[] args) {

        int x = 5;

        int y = ++x; //pre-increment of x = 6 (immediately changes value)
                     //y = 6 where pre-increment of x is stored in y
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int a = 10;

        int b = --a; //pre-decrement of a = 9 (immediately subtracts value)
                     //b = 9 where pre-decrement of a is stored into b
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //post-increment & decrement:

        int m = 5;

        int n = m++; // passes current operand n = 5 then m = 6 (2 steps with post operators)
        System.out.println("m = " + m);
        System.out.println("n = " + n);

        int r = 10;

        int t = r--; //passes current operand t = 10 then r = 9 (2 steps with post operators)
        System.out.println("t = " + t);
        System.out.println("r = " + r);



    }
}
