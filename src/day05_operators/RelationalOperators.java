package day05_operators;

public class RelationalOperators {

    public static void main(String[] args) {


        int a = 1000;

        int b = 200;

        System.out.println( a > b );
        System.out.println( a < b );
        //what if you don't want print expression?

        boolean aIsGreater = a > b;
        boolean aIsLesser = a < b;
        System.out.println(aIsGreater);
        System.out.println(aIsLesser);

        System.out.println("----------------------");

        int score = 50;

        boolean passed = score >= 60;

        System.out.println(score);
        System.out.println(passed);

        System.out.println("-------------------------");

        int age = 21;

        boolean eligibleToBuyAlcohol = age >= 21;

        System.out.println(eligibleToBuyAlcohol);

        boolean eligibleToVote = age >= 18;

        System.out.println(eligibleToVote);

        System.out.println("----------------------");

        System.out.println( 100 > 100 ); //false
        System.out.println( 100 >= 100 ); //true
        System.out.println( 100 >= 185 ); //false
        System.out.println( 100 >= 85); //true

        System.out.println("--------------------------");

        // int score =
        //can't declare new var with the same name
        //so…

        score = 48;
      //assignment operator = can assign new value to variable (although already used)

        boolean failed = score > 60;
        boolean ifFailed = score <= 60;

        System.out.println(failed);
        System.out.println(ifFailed);

        System.out.println("--------------------------");

        System.out.println(100 < 2000); //true
        System.out.println(100 < 20); //false

        System.out.println(95 <= 100); //true
        System.out.println(100 <= 100); //false
                //is 100 less than or equal to 100?-->true since =
                //with <= & >= only one condition need met for TRUE

        System.out.println("--------------------------");

        //System.out.println("Java" <= "c#"); //>, <, >=, <= THESE ONLY CAN USE FOR NUMBERS
                                            //that is why compiler in this case
        System.out.println('a' > 'b');
        //                  65   66
                        //ASCII SINCE COMPARING CHAR
                            //--->ASCII TABLE---NOT LETTERS

    }

}
