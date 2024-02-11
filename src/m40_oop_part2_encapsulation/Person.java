package m40_oop_part2_encapsulation;

public class Person {

    private String name; //change to private so other classes will not be able to access
    private int age; //to ensure usability of the data generate the getters/setter to be able to write it

    //to read the name of the person outside this class will provide the getter

    public String getName(){ //getter to read the value of the private field
        return name;
    }



}
