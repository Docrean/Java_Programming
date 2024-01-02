package m11_operators_part1;

public class Addition_VS_Concatenation {
    public static void main(String[] args) {

        System.out.println(3 + 5); //8--console adds together to print 8

        System.out.println(3 + 5 + "Cydeo" + 3 + 5);
        //                  8 + "Cydeo" + 3 + 5
        //                  "8Cydeo" + 3 + 5
        //                  "8Cydeo3" + 5
        //                  "8Cydeo35"

        //from left to right ALWAYS

        System.out.println(3 + 5 + "Cydeo" + (3 + 5));
        //                  3 + 5 + "Cydeo" + 8
        //                      8 + "Cydeo" + 8
        //                         "8Cydeo" +8
        //                         "8Cydeo8"

    }

}
