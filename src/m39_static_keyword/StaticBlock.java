package m39_static_keyword;

public class StaticBlock {

    public static int num; //requiring more than one statement to set variables requires a static block.

    static{ //static block gets executed first whenever the class is loaded. only get executed one time.
            //can give all code fragments needed to set the static variable.
        num = 100; //this gets executed before any other methods or static blocks
        System.out.println("Static block executed 1st");
    }
        //RECOMMENDED TO USE THE STATIC BLOCK TO SET ALL THE STATIC VARIABLES IN A CUSTOM CLASS.
    public static void main(String[] args) { //call the static variable directly inside the main methods body
        System.out.println("Main method Executed 2nd");
        System.out.println(num);
    }
                //include the main method TO MAKE THE CLASS ABLE TO RUN.
                //1ST STATIC BLOCK RUNS. 2ND MAIN METHOD WITH PRINT OF NUM.
}
