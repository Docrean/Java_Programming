package Statements_REPLITS;

public class GreaterNumber {

    public static void main(String[] args) {

        int a = 1,
                b = 2;


        if (a > b) {
            System.out.println(a + " is greater");
        } else {
            System.out.println(b + " is greater");
        }

        int c = 2,
                d = 3;

        if (c > d) {
            System.out.println(c + " is greater");
        } else {
            System.out.println(d + " is greater");
        }

        int e = 4,
                f = 3;

        if (e > f) {
            System.out.println(e + " is great");
        } else {
            System.out.println(d + " is great");
        }

    }
}

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