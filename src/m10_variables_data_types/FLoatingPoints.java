package m10_variables_data_types;

public class FLoatingPoints {

    public static void main(String[] args) {

        float maxFloat = 3.14F;//compile error since default is double..apply f or F at end
        double maxDouble;
        //^^^^^^^^^^^^^^^^^local variables are only accessible within scope of block

        //System.out.println(maxDouble); wont work...needs to be initialized first
            //    V
        maxDouble = 3.14;//no special character needed. double is default

        System.out.println(maxFloat);
        System.out.println(maxDouble);


    }
}
