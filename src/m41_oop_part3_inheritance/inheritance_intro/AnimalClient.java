package m41_oop_part3_inheritance.inheritance_intro;
        //did not create any constructors in the animal class to set the arributes
        //the Constructor works differently in the inheritance
        //After learning the super keyword, then will be able to create the constructor that can set all the fields
        //at once. This method below is being created without the constructor.
        //created the objects below by using the default constructor.
public class AnimalClient {

            public static void main(String[] args) {

                Dog dog = new Dog("Tucker", "Burnese Mountain Dog", "Male",4, "Black"); //dog object from dog class to call methods
                //dog.get = "Tucker";
                //dog.breed = "Bernese Mountain Dog";
                //dog.setName("Tucker");
                //dog.setAge(5);
                //dog.setBreed("Burnese Mountain Dog");
                //both of these are created by using the default constructor from compiler
                Cat cat = new Cat("Booders", "Tabby", "Male", 3, "Red"); //cat object from cat class to call methods
                //cat.name = "Booders";
                //cat.breed = "Tabby";
                //cat.setName("Booders");
                //cat.setBreed("Tabby");
                System.out.println(dog);
                System.out.println(cat);

                dog.eat();
                dog.sleep();
                dog.bark();

                cat.eat();
                cat.sleep();
                //cat.bark();
                cat.scratch();
            }    //How to make sure to print dog and cat from each method rather than print Animal for both from the
                //Animal.java class reference? GO back and edit the toString in the Animal.java class
        }       //use the getClass() object then add getSimpleName() object will get the name of the class only.

