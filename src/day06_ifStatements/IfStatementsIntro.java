package day06_ifStatements;

public class IfStatementsIntro {

    public static void main(String[] args) {

        int number = - 100;

        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;


        if( isPositive ){
            System.out.println(number +" is positive number");
        }                //SINCE code fragment INSIDE IF BLOCK IT WILL ONLY RUN from IF CONDITION
                        //IF TRUE, IT GETS EXECUTED. ITS NOT, SO NO EXECUTION
                        //want this to be executed only if IF CONDITION IS TRUE
                        //will print -100 is positive if OUTSIDE IF BLOCK
        if( isNegative ){
            System.out.println(number +" is negative number");
        }
                        //since outside iF statement, but want to print, NEED TO DECLARE THE BOOLEAN for them
                        //since both outside of an IF condition, compiler will print them since not attached
        //                to their boolean declarations. So need Else's for them

        if( isZero ){
            System.out.println(number +" is zero");

        }

        int num = 0;

        if(num > 0){
            System.out.println(num + " is positive number");
        }

        if(num < 0){
            System.out.println(num + " is negative number");
        }

        if(num == 0){
            System.out.println(num + " is zero");
        }
    }
}
