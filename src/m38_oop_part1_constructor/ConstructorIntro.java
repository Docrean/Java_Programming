package m38_oop_part1_constructor;

public class ConstructorIntro { //make sure constructor name is same as class name

    //Create constructor starting with access modifier(public) (done manually)
    //cannot give any static modifier(static) nor return types(void main)
    //Constructor name has to be the same as the class name
    public ConstructorIntro() { //no argument constructor means compiler will not give a default constructor
        System.out.println("Object is created by using no-arg constructor"); //this prints via the no argument constructor
    }

    public static void main(String[] args) { //create this main method if not using a custom class
        //write some codes and run them in this class
        //To create object from ConstructorIntro class first create the reference variable name ConstructorIntro
        //Use the new keyword.
        //Use class name with ()
        //without creating any constructor the compiler will create its own by default
        //EVERY SINGLE CLASS MUST HAVE A CONSTRUCTOR...then instantiate the class with = new ConstructorIntro() object


        ConstructorIntro obj = new ConstructorIntro(); //class object(instance). have to use a constructor that exists in that class(no argument constructor in this case)
                                                        //this is why can use the no argument constructor to create the new ConstructorIntro() object
                                                        //if the constructor passes an argument than the object will show compile error



    }
}
