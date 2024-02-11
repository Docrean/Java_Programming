package m39_static_keyword;

import org.w3c.dom.ls.LSOutput;

public class MyClass {

    public static int staticVar;
    public int instanceVar;

    public static void main(String[] args) {

        System.out.println(staticVar);

        staticMethod(); //able to call this static method from below into this main methods body(a static body)
        //InstanceMethod(); //instance method from calling the non static method below...still get same error...Non-static field 'instanceVar' cannot be referenced from a static context
        //System.out.println(instanceVar); //Instance variable call..Non-static field 'instanceVar' cannot be referenced from a static context
    }   //these two^ belong to the object..not the class...static method can only

            //STATIC METHODS ONLY ACCEPT STATIC VARIABLES

    public void InstanceMethod(){ //instance method
                                  //if try to call this method in the main methods body(a static method), won't work. static only accepts static.
                                  //the class won't share what the object has.
                                  //the static members cannot access the object members.
        System.out.println(staticVar); //static variable...able to call.
        System.out.println(instanceVar); //non static variable...able to call

            //INSTANCE METHODS ACCEPT BOTH STATIC AND INSTANCE VARIABLES
    }


    public static void staticMethod(){


    }
}
