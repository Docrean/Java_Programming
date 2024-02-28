package M42_access_modifiers_final_object_class.final_keyword;

public class AnimalClient {

    public static void main(String[] args) {
        //Create the dog object and set the breed, name, age and gender WITHIN THE CONSTRUCTOR
        //Constructor then takes the arguments and will then set the attributes and take

        Dog dog = new Dog("tucker", "burnese mountain dog", "Male", 12);
        //Since breed and gender are set as final, if after first initialization you try to re-assign...will give compiler.
        System.out.println(dog);

        dog.drink();

        //dog.breed = "Corgi";
        //dog.gender = "Female"; final keyword set these won't run
                //static variable will inherit to the dog class

        //Dog.PLANET //through the dog class name can access PLANET in Animal.java
    }               //cant change since declared as final
}
            //can make the toString method as final so can't be overridden by a child class3...has to use the same implementation
