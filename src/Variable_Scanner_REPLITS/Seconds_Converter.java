package Variable_Scanner_REPLITS;

public class Seconds_Converter {

    public static void main(String[] args) {

        /*
        * import java.util.*;

//import com.sun.tools.javac.parser.Scanner;

class Main {
  public static void main(String[] args) {
    //WRITE YOUR CODE BELOW:
    //start from least(easiest) to greatest(Hardest)(hours being last with most seconds)
    //1. Declare Scanner to draw out imported data java.util
    //2. Declare print statement Enter seconds:
    //3. Declare the Ints using Scanner method =input.nextln();
    //4. Declare hours first since takes most amount of seconds
    //5. Need to then extract seconds from the int hour statement (3600) from the inputSeconds         scanner input. This shows as int hours = inputSeconds / (60 * 60) or 3600
    //6. Find the remainder using %= shorthand or long version %(longer version)
            //inputSeconds %= 3600 or long version: inputSeconds = inputSeconds % 3600
            //shorthand operator %= shortens
    Scanner input = new Scanner(System.in);
    System.out.println("Enter seconds:");
    int inputSeconds = input.nextInt();

    int hours = inputSeconds / 3600; // or can declare (60 * 60) then divide that by inputSeconds. ^-->Put 60 * 60 in parenthesees so compilar does not / first but * first.

    inputSeconds %= 3600; //inputSeconds =% 3600 or long version: inputSeconds = inputSeconds % 3600 //at this point inputSeconds is 95                       3600. //shorthand operator =% shortens
    int minutes = inputSeconds / 60; //to find how many seconds in a minute (60)..then find remainder of that.
    inputSeconds %= 60;
    //at this point inputSeconds is 35

    System.out.println(hours + " hours, " + minutes + " minutes, and " + inputSeconds + " seconds");

    //Data is extracted from the scanner inputSeconds starting with the variable hours which is the largest value.
    * Work greatest value to the least value to find remainder...starting with 3600 and finding out first the remainder how many is left from scanner input 3695.
    * Need to extract out the remainder of inputSeconds / 3600 which will be 95 since 1 3600 can go into 1 3695.
    * This is expressed using the shorthand operator %= or long version inputSeconds = inputSeconds % 3600.
    * Now inputSeconds contains the remainder 95 and now need to extract how many minutes are in 95 and get the remainder of that...so inputSeconds / 60 and then remainder inputSeconds %= 60 or inputSeconds = inputSeconds % 60.
    * Now left over seconds is 35. Now express in print statements final output with extracted defined data.
        * */
    }
}
