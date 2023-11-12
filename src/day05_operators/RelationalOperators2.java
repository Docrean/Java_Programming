package day05_operators;

public class RelationalOperators2 {

    public static void main(String[] args) {

        //== returns == ONLY IF BOTH VALUES EQUAL

        System.out.println(1000 == 2000);

        System.out.println("Java" == "Java");

        System.out.println("java" == "Java");
                            //Java is case sensitive so FALSE

        System.out.println("Brandon" == "Good guy");
                            //Different strings so FALSE

        System.out.println( true == false );
                            //booleans not equal so FALSE

        System.out.println("-----------------------------------");

        // != returns != ONLY IF BOTH VALUES ARE FALSE
                    // != opposite of ==

        System.out.println(1000 != 2000);

        System.out.println("Java" != "Java");

        System.out.println("java" != "Java");

        System.out.println("Brandon" != "Good guy");

        System.out.println( true != false );


    }
}
