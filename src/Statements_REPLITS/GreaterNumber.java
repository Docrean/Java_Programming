package Statements_REPLITS;

public class GreaterNumber {

    public static void main(String[] args) {

        /*
        * import java.util.*;
class Main {
  public static void main(String[] args)
    {
    //DO NOT TOUCH BELOW
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();

    //WRITE YOUR CODE HERE:

      //Written as single ifs
      if (a > b) {
        System.out.println(a + " is greater");
        }

      if (a < b) {
        System.out.println(b + " is greater");
      }

      //written as an If else. More customary
      if (a < b) {
        System.out.println(a + " is greater");
       }else {
        System.out.println(b + " is greater");
      }
        * */

        /*
* ### Use an `if statement` to determine if the given number `a` is greater than the other given number `b`.
* Print out which is the biggest in the following format:

#### $number is greater

#### Note: The two given numbers will not be equal

Main topics: if statements, primitive variables, concatenation, operators

```
Ex:
  Input:
    1
    2

  Output:
    2 is greater
```
```
Ex:
  Input:
    7
    4

  Output:
    7 is greater
*/

        /*//reverse from Scanner:
        * char var = 'a',
                bar = 'b';

        if (var > bar) {
            System.out.println(var + " is greater");
        }

        if (var < bar) {
            System.out.println(bar + " is greater");
        }
        *
        * */


        int a = 1,
                b = 2;


        if (a > b) {
            System.out.println(a + " is greater");
        } else {
            System.out.println(b + " is greater");
        }    /*
            IF WANTING TO WRITE SINGLE IF than have to
            write opposite operator (if a > b, then a < b)

            if (a > b) {
            System.out.println(a + " is greater");

            if (a < b) {
            System.out.println(b + " is greater");
            */


        int c = 2,
                d = 3;

        if (c > d) {
            System.out.println(c + " is greater");
        } else {
            System.out.println(d + " is greater");
        }       //Else will return the true value IF IF is false
        //WON'T COMPILE IF FALSE
        int e = 4,
                f = 3;

        if (e > f) {
            System.out.println(e + " is great");
        } else {
            System.out.println(d + " is great");
        }    //Else will return the true value IF IF is false

        int g = 100,
                i = 900;

        if (g < i) {
            System.out.println(i + " is greater");
            //Won't run IF FALSE.

            if (g > i) {
                System.out.println(g + " is greater");
                //WILL EXECUTE SINCE TRUE
            }

        }
    }

}






