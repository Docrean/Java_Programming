package m25_class_and_object;

public class dogClient {

    public static void main(String[] args) {

        // 1. Create reference variables for the dog objects
                //give a non-prim data type

        Dog dog1 = new Dog(); //2. initialize a value into the variable (dog into dog) Dog data type = Dog variable only
        dog1.name = "Debbie";// null argument is default constructor unless specified (same as class name)
        dog1.breed = "Husky"; //no arguments passed in the parenthesis since default deconstructor argument is null
        dog1.age = 2;         //byte, short, int, long default is 0
        dog1.color = "Brown";//INSTANCE VARIABLES initialized

        System.out.println("Name: " + dog1.name);
        System.out.println("Breed: " + dog1.breed);
        System.out.println("Age: " + dog1.age);
        System.out.println("Color: " + dog1.color);
        dog1.bark();
        dog1.eat(); //instance methods initialized from Dog.java class to this using dot. operator
        dog1.sleep();
                                    //The toString() method returns the object String representation of the OBJECT
        System.out.println(dog1);

            //if getting Hashcode in console from dog object reference variable to the print statement is because
                //have not set the 2 string methods of the dog object.
                //(m25_class_and_object.Dog@7cca494b)--this shows if not string methods set


                        //argument constructor.
        Dog dog2 = new Dog();           //. operator to access instance variables/method
        dog2.name = "Lessy";
        dog2.age = 1;
        dog2.breed = "Corgit";
        dog2.color = "red";

        dog2.bark();
        dog2.eat();
        dog2.sleep();

        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.name = "Barney";
        dog3.age = 3;
        dog3.breed = "Shepard";
        dog3.color = "silver";

        dog3.bark();
        dog3.eat();
        dog3.sleep();

        System.out.println(dog3);
                //since variables not set for dog3 will print null
                                        //.name will return null since name not set through dog object
                                            //to assign data to instance variable name, through object you need to call
                                            //the instance variable name. dog1.name =





    }


}
