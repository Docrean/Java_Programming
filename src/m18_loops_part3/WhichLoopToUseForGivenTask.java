package m18_loops_part3;

public class WhichLoopToUseForGivenTask {

    public static void main(String[] args) {


        /* Which loop to choose?

            1. Print the even numbers which starts from 0 and ends at 10 (inclusive) in the same
            line with a space between the numbers



            Begin
              |
              V
          number = 0
              |
              V           false
  |------>if number < 11--------> End
  |      true |
  |           |
  |           V
  |      Print Number
  |           |
  |           |
  |           V
  |---<number = number + 1


             Answer: "For loop"--number of iterations is FIXED
            Can use while and do-while BUT have to give INITIALIZATION BEFORE
            the while and do-while loops as well as ITERATOR in LOOPS BODY
            WHY NOT the case for LOOP? because INITIALIZATION, CONDITION, AND ITERATION
            are given IN THE FOR LOOPS EXPRESSION.





          2. Write a program to find the largest number in a list of numbers


            Begin
              |
              V
maximum_number = first number of the list
              |
              V                No
  |------>if there is next-----------> Print maximum_number
  |         number  (2.)                         |
  |           |                                  |
  |        Yes|                                  V
  |           V                                 End
  |--No--next_number > maximum_number
  |           |
  |        Yes|
  |           V
  |---maximum_number = first number of the list


            Answer: "while" loop--1. number of iterations NOT FIXED
            2. Need to CHECK CONDITION BEFORE EXECUTING LOOP BODY
            Loop executed long enough to find the maximum list of numbers
            As long as there is the next number in the list, body executes.
            If 2. is 0 or no number in list, false (No), print the maximum number and ends





            3. Find Sum of numbers until user quits

            Begin
              |
              V
           sum = 0
              |
              V
  |------>Read the number (2.)
  |           |
  |           |
  |           V
 No    sum = sum + number (3.)
  |           |
  |           |
  |           V              Yes
  |---<Do you want to quit?--------> Print sum
              (4.)                      |
                                        |
                                        V
                                       End

             Answer: "do-while" loop--1. number of iterations NOT FIXED
            2. need to EXECUTE LOOP BODY at least ONCE to make sure first
            input is executed by the USER. to make sure code frag (2.) reads the
            sum number (3.) before asking do you want to quit to be executed first, have
            to place (2.) and (3.) them in the do block and then do you want to quit (4.)
            in the while block.


               Takeaways: for loop and while-loop USED MORE OFTEN than "do-while" in most
               cases.









         */





























    }
}
