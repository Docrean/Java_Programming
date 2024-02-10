package m38_oop_part1_constructor;

public class InstanceBlock {

    public InstanceBlock(){ //constructor
        System.out.println("No Arg Constructor"); //Compiles 3rd (after Initializer blocks)
    }

    {
        System.out.println("Instance Block 1");  //Compiles 1st
    }   //instance blocks DO NOT TAKE ARGUMENTS. ONLY THE CONSTRUCTOR

    {
        System.out.println("Instance Block 2"); //Compiles 2nd
    }
                                 //can create as many instance blocks as wanted
                                //does not matter where constructor is placed...its always instance blocks first then
                                //constuctor

    //create main method so can to create objects of this class

    public static void main(String[] args) {

        InstanceBlock obj1 = new InstanceBlock(); //object reference variable obj with constuctor to create object new InstanceBlock()
        InstanceBlock obj2 = new InstanceBlock(); //Instance blocks then constructor executed 2x
    }
}
