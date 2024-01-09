package m16_loops_part1;

public class ForLoop {

    public static void main(String[] args) {

        /*  Not efficient way to repeat code print
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        */

        //For loop efficient way (For loop 5 iterations--NEED TO KNOW EXACT AMOUNT)
        //will only repeat one line of code after for if no curlies

       /* for (;;){      //infinite loop if both semi colons pass without initilizatioon and boolean condition
            System.out.println("Hello World");
        }
       */

       for (int i = 0; i < 5; i++) {               //from < to <= increases number of iterations by 1
           System.out.println("Hello World");   // so if we want 5 iterations, starting from 0 -> 4 = 5
       }                                        //exclude '=' from < to not include 5 if start from 0
                                                //will print Hello world InfiniteX since no iterator
                                                //to increase initialization value above < 5 ending
                                                //loop


    }
}
