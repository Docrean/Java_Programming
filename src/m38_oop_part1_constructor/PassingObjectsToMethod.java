package m38_oop_part1_constructor;

import org.w3c.dom.ls.LSOutput;

class Apple{ //class created within file PassingObjectsToMethod
    String color = "Red"; //instance variable color set. Meaning..if object is created from the class Apple the default
                            //color will be red.
}                           //CONSTRUCTOR will be constructed by default since not made manually.


public class PassingObjectsToMethod { //can create multiple classes in a file but can ONLY HAVE ONE PUBLIC CLASS
                                      //THAT MUST MATCH THE FILE NAME.
    //create custom method within this class and want any new object created within this custom class to work with any
    //object of the Apple class. To be able to call that method within the body of the main method, MAKE THE CUSOME METHOD
    //a STATIC METHOD. VVVVV
    //As for return type, want method to change the color of any given apple object. So no values need be returned, so
    //the return type can be VOID.VVVVV
    //For the method name, give same name AS SHOWN IN PRESENT SLIDE "Passing objects to Methods"

    public static void main(String[] args) { //call the custom method below through this main method
        // In order to call the custom method, WILL NEED TO PASS AN APPLE OBJECT.

        Apple apple1 = new Apple(); //object referenced by variable apple1.
        System.out.println(apple1.color);

        changeApple(apple1); //pass same new Apple() object in this method to change color of the new Apple() object.
        //new Apple(); passed to this new argument apple1.
        //this means...the new Apple(); object is now passed into the below changeApple(Apple apple) parameter variable

        System.out.println(apple1.color); //print apple1.color object again will print White. WHY?
                                          //Answer: the changeApple(apple1) method changed the value of variable color
                                         //of the apple object. Since only one new Apple(); object created in the heap, and
                                         //the object is referenced by the Apple apple1 reference variable, which is also referenced

                                         //by the Parameter variable changeApple(Apple apple) below because the parameter variable
                                         //contains the address of the new Apple(); object as well.
                                         //Whenever the color is called from the parameter variable below (apple.color = "white"), it will call the instance variable
                                         //color from the given object changeApple(Apple apple){ which is the new Apple(); object.
    }                                    //THIS IS JAVA PASSING BY VALUE
    public static void changeApple(Apple apple){ //need to be able to change color of apple class. assign Apple parameter data type.
        apple.color = "White";  //access instance variable color from the object in order for this method to change color of the apple(given object paremter).
    }                   //assign new color.


        /*PASS BY VALUE:
        When objects are passed to the methods as an argument, the address of that object will be stored INTO THE
        PARAMETER VARIABLE. This is how the color was changed of the apple1 object created.
         */


}
