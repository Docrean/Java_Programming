package m15_selection_statements_part2;

public class Calculator {

    public static void main(String[] args) {

        double num1 = 100, num2 = 20;

        char operator = '-'; //change value here to run each switch. if an invalid is given then invalid operator

        switch (operator){      //expression here should be operator because can't calculate nums with operator

            case '+':           //case needs to be literal or constant but no variable
                System.out.println("Addition: " + (num1 + num2));
                break;

            case '-':           //must be unique. Can't use + again since first case so - used.
                System.out.println("Subtraction: " + (num1 - num2));
                break;

            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;

            case '/':
                System.out.println("Division: " + (num1 / num2));
                break;

            default:
                System.out.println("Invalid Operator"); //switch is terminated after default block
                                                        //so break no necessary
                                                        //best to give default at end
        }


    }
}
