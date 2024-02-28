package M42_access_modifiers_final_object_class.final_keyword;

public class Dog extends Animal {

    //compile error as no default constructor (Parent Animal class is FINAL)


        public Dog(String name, String breed, String gender, int age) { //variables inherited into Dog class from Animal
            super(name, breed, gender, age); //still gives compile error due to Parent Animal class FINAL

            //now create AnimalClient class and create the Dog object.
        }

}
