package Variable_Scanner_REPLITS;

public class Phone_Number {

    public static void main(String[] args) {


        int AreaCode = 222,
                LocalNumber = 3334444,
                AreaCode2 = 111,
                LocalNumber2 = 123456,
                AreaCode3 = 555,
                LocalNumber3 = 234567;

        System.out.println("Calling number " + "(" + AreaCode + ")" + "-" + LocalNumber);
        System.out.println("Calling number " + "(" + AreaCode2 + ")" + "-" + LocalNumber2);
        System.out.println("Calling number " + "(" + AreaCode3 + ")" + "-" + LocalNumber3);

    }
}

/*
### In this task, you will need to use multiple variables and combine them together into a phone number.
```
  For example it will be something like this:
    (222)-3334444
```

1. Given two `int` variables `areaCode` and `localNumber` that are assigned a value from Scanner, combine them together into a phone number in the following format:

```
  (areaCode)-localNumber
```

Print this final message:
```
  Calling number $phoneNumber
```

```
Ex:

  Input:
    222
    3334444

  Output:
    Calling number (222)-3334444
```


Main topics: variables, primitive datatypes, Scanner, concatenation

*/