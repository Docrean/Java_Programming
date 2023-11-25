package Variable_Scanner_REPLITS;

import java.sql.SQLOutput;

public class Time {

    public static void main(String[] args) {

        int hour = 12,
                minute = 24,
                second = 33;

        String amOrPm = "PM";

        System.out.println(hour + ":" + minute + ":" + second + " " + amOrPm);

    }
}

/*
*  ### In this task, you will need to use multiple variables and combine them together into the time of the day.
```
  For example it will be something like this:
    12:24:33 PM
```


1. In the beginning of the code, declare three `int` variables: `hour, minute, second` and declare a `String` variable: `amOrPm`.
> You only need to declare, no assignment.

2. In the middle of the code, the variables will be assigned a value using Scanner.
> Do not touch anything in this section.

3. In the end of the code, use the variables to put together and print the time of the day using the following format:

  ```
  hours:minutes:seconds amOrPm
  ```
*
* */

