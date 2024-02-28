package M42_access_modifiers_final_object_class.final_keyword;

public class Animal { //if put final keyword in class header CANNOT BE EXTENDED TO ANY OTHER CLASS.

    public String name;
    public final String breed; //apply final keyword to the instance variable breed to make it immutable
    public final String gender; //when object of Animal is created the BREED and GENDER will be unchangeable
                                //compiler error happens when final keyword given. final removes the default value
                                //will have to initialize them WHEN NEW OBJECT IS CREATED
                                //can initialize them in Animal class but since this is parent class...it will be same
                                //in all world sub-classes.
                                //CREATE A CONSTRUCTOR: takes an argument to initialize the final instance variables breed/gender
                                //GENERATE THE CONSTRUCTOR (right click within the class, generate, constructor(will by default
                                //include the final instance variables breed/gender.
    public int age;             //Once constructor is created, the compiler errors are gone because the constructor is
                                //created AS SOON AS THE OBJECT IS CREATED THE INSTANCE VARIABLES BECOMES SET....so when
                                //called...can use them now.


    public Animal(String name, String breed, String gender, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
    }
}
