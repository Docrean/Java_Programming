package m25_class_and_object;

public class Dog { //This custom class used as custom template
                    //Used for custom objects so don't make main method
                    //main method used to run a class not custom objects in a class
                    //instance variables declared in the class but outside any other class

    public String breed; //this instance variable. if dog class has 10 variables this also will have 10 different names
    public String name;
    public String color; //if color not included in the class then later when declaring dog object cannot set this
    public int age;       //variable

    public void bark(){ //if adding static each object will not have a seperate copy meaning the method will belond to
        System.out.println(name + " is barking");//the class and not the object. Static method belonds to a class
    }   //instance methods belong to an object
    public void eating(){
        System.out.println(name + " is eating");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public String toString(){ //mosst of the time the toString method contains all the attributes of the correct class
        return "name: " + name; //SHORTCUT: right click in the custom class (outside main method brackets but inside
                                //custom class: click generate. look for toString. look for which attributes to include
    }                           //if want to print all atributes can select all. for now, uncheck instert @override
    //if getting Hashcode in console from dog object reference variable to the print statement is because
    //have not set the 2 string methods of the dog object.
    //(m25_class_and_object.Dog@7cca494b)--this shows if not string methods



}       //what is in the custom class fields and methods will determine state and behavior of the object

        /*
        Create a "Dog" class and define the below instance fields and methods

        Fields:
        String bread
        int age
        String color
        String name

        Methods:
        bark()
        eat()
        sleep()


         */