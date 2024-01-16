package m21_methods_part2;

public class OddOrEven {

    public static void main(String[] args) {

        oddOrEven(100);
        oddOrEven(45);

        //or

        int a = 304;
        oddOrEven(a);
                        //whenever there are parameters in order to call the method you need provide the argument

        //evenNumber(100);
        //oddNumber(45);
    }

    public static void oddOrEven(int number){ //<---Code fragments grouped in this method
        if(number % 2 ==0){      //parameter set so can change any number if needed just call the method.
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
    }           /*Benefit of method:
                If no method (oddOrEven, int a) then would have to create if else conditions for every
                number one by one AS BELOW VV

                */

    //Easier way to do it: create one variable for both even or odd and pass 2 method variables for both numbers
    /*public static void evenNumber(int even){//parameter is decided on the data requirement
        if(even % 2 == 0){                  //if 2 pieces of info, need two parameters
                                            //if not info, don't need to pass any parameters
            System.out.println("100 is an even number");
        } else {
            System.out.println("100 is not even number");
        }
    }

    public static void oddNumber(int odd){
        if(odd % 2 == 1){
            System.out.println("45 is an odd number");
        } else {
            System.out.println("45 is not an odd number");
       }
    }
    */





}
