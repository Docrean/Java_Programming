package Variable_Scanner_REPLITS;

public class Print_Var_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        //WRITE YOUR CODE BELOW:
        /*
        * Scanner: AVOIDING HARDCODING: about reading information from outside the hardcoding...SCANNER BEING THE WAY.
			REPLIT: Inputs are different...so we can test the code based on the inputs.
			//Data is stored in the scanner variable...so writing the print statement will tell the compiler to run
			* the scanner variable containing the data...so tons of hardcode not needed.
        * */

        System.out.println("Today's word of the day is: " + word);


    }


}

/*
### Given a String variable **`word`** that has some value (from Scanner), use the variable to display the word of the day.

**Note:** You don't need to do anything with the Scanner.  Use the variable as done before.

Main topics: print statement, variables, String, concatenation, Scanner

```
Ex:
  Input:
    Java

  Output:
    Today's word of the day is: Java
```
```
Ex:
  Input:
    Apple

  Output:
    Today's word of the day is: Apple
```
*/