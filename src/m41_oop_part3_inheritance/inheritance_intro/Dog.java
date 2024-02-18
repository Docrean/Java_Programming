package m41_oop_part3_inheritance.inheritance_intro;

public class Dog extends Animal {
    public Dog(String name, String breed, String gender, int age, String color) {
        super(name, breed, gender, age, color);
    } //as the dog class is created will be able to create an object from this dog class and store the data
                    //into the dog object and will be able to use the methods from the dog object.
                    //This class need to include the Animal.java class attributes (name, breed, gender, age, color as
                    //well as the eat and sleep methods as well as toString.
                    //Instead of recreating all the variables and methods in this Dog class by myself, can just inject
                    //them from the Animal.java class.
                    //If I re-create them, will have to rewrite the same amount of code as in the Animal.java class.

                    //use the extends keyword (public class Dog extends Animal)
                    //as soon as the extends keyword is included, all the fields and methods from Animal.java are included
                    //since they are PUBLIC and ACCESSIBLE.

                    //now declare methods in the dog class that would be unique for the Dog class such as Bark
public void bark(){
    System.out.println(getName() + " is barking"); //can declare name here from Animal.java as extends allows
}
                        //if bark is declared in the Animal.java class then it would be available for any other subclases
                        //in the future
}
