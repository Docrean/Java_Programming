package m41_oop_part3_inheritance.inheritance_intro;

public class Animal { //parent class of dog, cat or any other animal classes so all common properties of methods and
                      //animals will be placed within this animal class.
                      //IF THERE IS A PROPERTY THAT IS NOT COMMON FOR ALL THE ANIMALS THAN IT SHOULD NOT BE PLACED
                      //IN THE SUPER CLASS.
                      //SUPER CLASS/PARENT CLASS IS MEANT TO CONTAIN THE COMMON PROPERTIES OF ALL SUBCLASSES ONLY
                      //IF THERE IS ANYTHING THAT IS NO COMMON FOR ALL THE SUBCLASS, EVEN THOUGH COMMON FOR 90% OF THE
                      //SUBCLASS BUT NOT FOR THE REMAINING 10% SUBCLASS, IT SHOULD NOT BE CREATED UNDER THE PARENT CLASS.
                      //PARENT CLASS SHOULD ONLY CONTAIN THE COMMON PROPERTIES OF ALL SUBCLASSES ONLY.
    //public is always accessible to any subclass
    //if private will have to reset the getters and setters
    private String name, breed, gender; //declared as instance so as to store values for each object.
    private int age; //this included as is common for all the animal classes.
    private String color; //these instances are ALL PUBLIC so to get a good understanding of inheritance.
                        //can change to private later and generate getters and setters.

    public Animal(String name, String breed, String gender, int age, String color) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setColor(color);
    }

    public void eat(){ //reason for the eat method is want to be able to use one of the instance variables in the method
                          //make the method as NON STATIC so to have access to the instance variables
        System.out.println(name + " is eating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public void sleep(){
        System.out.println(name + " is sleeping");


    }
}
        //this way the variables and methods do not have to be created IN ANOTHER CLASS like dog, cat, etc... Can just
        //inherit them to the other animal classes by using the extends keyword.

        //Include fly? No because it's NOT COMMON for ALL subclasses.

        //This class contains 5 fields and 3 methods.

        //Next create the subclass of the animal class. yyyyyy