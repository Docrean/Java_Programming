package m21_methods_part2;

public class ReturnOddOrEven {

    public static void main(String[] args) {

      String s1 =  returnOddOrEven(100);

        System.out.println(s1);
    }

    //when method calls will return a String method
    public static String returnOddOrEven(int number){
        if(number % 2 == 0){
            return "Even";  //this string only return if previous if condition is met
        }  else{
            return "odd";   //have to make sure a string data will return EVEN IF CONDITION NOT MET
        }
                            //one way or another ONE STRING METHOD NEED BE RETURNED.
    } //when the return type isn't void, we must return a value from the method
}
