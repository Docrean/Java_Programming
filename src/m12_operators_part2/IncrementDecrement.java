package m12_operators_part2;

public class IncrementDecrement {

    public static void main(String[] args) {

        //pre-increment & pre-decrement: value is incremented/decremented immediately then result computed

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

        //post-increment & post-decrement: current value is computed first as result and then incremented/decremented

        int m = 5;

        int n = m++; // passes current operand so n = 5 as m then m = 6 (2 steps with post operators)
        System.out.println("m = " + m);
        System.out.println("n = " + n);

        int r = 10;

        int t = r--; //passes current operand so t = 10 as r then r = 9 (2 steps with post operators)
        System.out.println("t = " + t);
        System.out.println("r = " + r);



    }
}
