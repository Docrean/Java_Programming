package m15_selection_statements_part2;

public class SwitchConstants {



    public static final int OPTION_ONE = 1;
    public static final int OPTION_TWO = 2;
    public static final int OPTION_THREE = 3;
    public static void main(String[] args) {
        //when creaed switch statement the case values used can be the constants
        //they only have one fixed value of data

        int choice = 2;

        switch (choice){
            case OPTION_ONE->   //or 1. can be literal or constant
                                //can use -> lamba arrow or : if -> at first case ONLY
                                // then rest of case swtiches need ->
                                 //-> can only have 1 println if need 2 or more than use {}
                                // wont need to use break and will give error if so
                System.out.println("Option one is selected");

            case OPTION_TWO ->   //or 2. can be literal or constant
                System.out.println("Option two is selected");

            case OPTION_THREE ->
            {System.out.println("Option three is selected");
                System.out.println("Option three is selected");}
            default ->
                System.out.println("Invalid Option");

        }


    }
}




