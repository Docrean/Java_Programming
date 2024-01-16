package m22_methods_part3;

public class ReturnMethodPractice {


    public static void main(String[] args) {


     double result =  calculate(20.5, '*', 2);

        System.out.println(result);

    }

    //return type should be double since calculation for 2 floating numbers
    public static double calculate(double num1, char mathOperator, double num2) {
        boolean validOperator = mathOperator == '+' || mathOperator == '-' ||
                mathOperator == '*' || mathOperator == '/' || mathOperator == '%';

        if(!validOperator){
            return 0;
        }

        double result = (mathOperator == '+')? num1 + num2 :(mathOperator== '-')? num1-num2
                :(mathOperator == '-')? num1 * num2 :(mathOperator== '/')? num1-num2
                : num1 % num2;

        return result;
    }




}


            /*  Create a method named calculate that passes the following three parameters:
                        double num1
                        char mathOperator
                        double num2

                The method will return the calculation result of the wo numbers by using the given
                math operator. If the math operator is an invalid operator, then the method should
                return 0.


                                    valid operator: +, -, *, /,
             */
