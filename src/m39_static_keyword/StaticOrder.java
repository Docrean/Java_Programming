package m39_static_keyword;

public class StaticOrder {
        static int x = 5;

        static {
            System.out.println("Static block1 executed then...");
            x += 10; //x = 15
        }

        static {
            System.out.println("Static block2 executed then...");
            x /= 3; //x = 5 //divides 15 previous by 3 then assigns value to x
        }

        public static void main(String[] args) {
            System.out.println("Main method executed then...");
            System.out.println("x = " + x);
        }
    }

