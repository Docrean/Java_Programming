package m41_oop_part3_inheritance.super_keyword;

public class Person {

    public String name; //public access modifier to make the variable always accessible
    public int age;
    public String gender; //these variables made as instance so as to have different copies of these for each person object
                          //so we can store different values for name, age, gender

                          //declare as static if having value as same for ALL PERSON CLASS OBJECTS.

                          //set constructor in parent class SO NO REPEAT NECESSARY OF PARENT VARIABLES IN CHILD CLASS.

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    } //PARENT CLASS WITH CONSTRUCTOR PARAMETERS HAS TO BE CALLED MANUALLY IN THE CHILD CLASS OR ELSE COMPILER.
      //ONLY A CONSTRUCTOR CAN CALL A CONSTRUCTOR
    public static boolean ishuman;
    //not create method
    public void eat(){ //don't need to us .this since no parameter inside the eat() parentheses
        System.out.println(name + " is eating");
    }          //don't make static or else wont accept the instance variables
}
