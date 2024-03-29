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

    //naming conventions for static finals is SCREAMING UPPERCASE...ALL UPPERCASE.
    //ex: create a planet static keyword that is unchangeable for ALL THE ANIMALS.

    public final static String PLANET; //include final so this keyword is not changeable
        //reason for static is only need ONE COPY OF
        //EARTH valueis common for allanimal objects..UNCHANGEABLE WITH FINAL KEYWORD

        //Can initialize variables immediately or use the static block to initialize static variables

    static{
        PLANET = "Earth";
    }

    public Animal(String name, String breed, String gender, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public final String toString() {      //want to display the class name besides any name so when sub-classes are inherited will also get the class name
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public final void drink(){ //use final so can't be overridden. if us static than can't inherit name. will give compiler
        System.out.println(name + "is drinking water"); //how to make this implementation the same for all animal sub-classes?
    }


}
    //now that animal class is inherited to other classes...all variables, methods, are inherited as it is...now create the first subclass of animal
    //and name it Dog.
    //Animal class is declared as final....CANNOT EXTEND TO SUBCLASS--NO DEFAULT CONSTRUCTOR SINCE FINAL...NO INHERITANCE ALLOWED.


    //PUT FINAL KEYWORD IN METHOD HEADER ONLY IF DON'T WANT THE IMPLEMENTATION OF THAT METHOD TO BE CHANGED. WILL PREVENT
    //METHOD OVERRIDING.....METHOD OVERRIDING IS THE PRINCIPLE OF GIVING DIFFERENT IMPLEMENTATIONS TO THE METHOD.

    //the toString and drink methods are inherited to the dog class BUT WILL NEVER BE OVERRIDDEN DUE TO FINAL KEYWORD