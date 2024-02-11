package m39_static_keyword;

public class VariableTypes { //create the static and instance variables outside any other block within the class

    public static int count; //default value is 0. no initialization will result as 0.
    public String name; //instance variable WITHOUT THE STATIC KEYWORD. default string value is null if not given.

    public void myMethod(int number, String str){ //to create local variables need to have a block to creat in.
                            //1st create the instance method.
                            //method parameters within the () don't have default values. can only be set WHEN METHOD
                            //ARGUMENT IS GIVEN(myMethod).
                            //Can create AS MANY PARAMETER VARIABLES AS WANTED.
                            //Cannot use the local variables OUTSIDE THIS BLOCK.
    double salary = 100_000; //local variables do not have default values. NEED TO BE INITIALIZED.

    }
}
