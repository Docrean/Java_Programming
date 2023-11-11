package day04_concatenation;

public class Concatenation_vs_Addition {

    public static void main(String[] args) {

        System.out.println("32" + 1); //"321" as 1 is concat'd to 32

        System.out.println(7 + "1"); //"71"
        // CAN CONCAT AS LONG AS STRING is on LEFT or RIGHT of operand

        System.out.println("13" + "2"); // "132"

        System.out.println("---------------------------------------");

                        //in addition...need numbers on RIGHT and LEFT of operand
        System.out.println(12 + 2.5); //14.5
                                     //numbers on R and L of operand
                                    //               |---->addition
        System.out.println("---------------------------------------");
                        //ANYTHING CAN CONCAT TO A STRING

        System.out.println("The Value is " + true);



    }
}


        /*
        ALWAYS ALWAYS ALWAYS:
        FOR CONCATENATION TO HAPPEN.....
        **ALWAYS NEED A STRING on LEFT or RIGHT side OF OPERAND***
        * */