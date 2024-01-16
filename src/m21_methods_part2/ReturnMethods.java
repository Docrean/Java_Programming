package m21_methods_part2;

public class ReturnMethods {

    public static void main(String[] args) {


      int result = addNumbers(10,20); //Since this a return method now, can assign to variable
        System.out.println(result);    //If not a return, Can't re-use sums nor store in variable
        //remember...void specifies that the function doesn't return a value

        System.out.println(addNumbers(100,200)); //Can treat as a value since its a return method
    }
                    //What if want to return value from the method? Change void to int
            //How to know if a return method is a return method? If return method is NOT VOID
                    //A return type may be a primitive type like int, float, double, reference type,
                    //or a void type
    public static int addNumbers(int num1, int num2){
        int num3 = num1 + num2;//<--data is within the method(Method executes with this data)
        return num3;   //since method is void, data stays contained within the method body
     //needs to be match return value in method   //only option is to print data to console
    }




}
                    //return method returns value at end where void does not