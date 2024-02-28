package M42_access_modifiers_final_object_class.final_keyword;

public class AnimalClient {

    public static void main(String[] args) {
        //Create the dog object and set the breed, name, age and gender WITHIN THE CONSTRUCTOR
        //Constructor then takes the arguments and will then set the attributes and take

        Dog dog = new Dog("tucker", "burnese mountain dog", "Male", 12);
        //Since breed and gender are set as final, if after first initialization you try to re-assign...will give compiler.
        System.out.println(dog);
    }
}
