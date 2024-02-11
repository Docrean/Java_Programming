package m40_oop_part2_encapsulation;

public class PersonClient { //<--this class can access the public string/int in Person.java through the person1 object

    public static void main(String[] args) {

        Person person1 = new Person();
        //person1.name = "Brandon"; //if put "null" or "" still valid/accessible due to public access identifier in Person.java
        //System.out.println(person1.name);

        //System.out.println(person1.name); //compiler error due to the private access modifier in Person.java
        System.out.println(person1.getName()); //use the getter



    }
}
