package m40_oop_part2_encapsulation;

public class PersonClient { //<--this class can access the public string/int in Person.java through the person1 object

    public static void main(String[] args) {

        Person person1 = new Person();
        //person1.name = "Brandon"; //if put "null" or "" still valid/accessible due to public access identifier in Person.java
        //System.out.println(person1.name);

        //System.out.println(person1.name); //compiler error due to the private access modifier in Person.java
        person1.setName("Brandon");
        person1.setAge(35);
        //What if the string field is "" || "null" || "   " -->use an if statement in the setter calls body in Person.java
        //and include an err println with message "Invalid input/data for the name: " + name
        //to make sure it does not apple to the this.name call then System.exit on next line
        System.out.println(person1.getName()); //use the getter to read person1 outside the private instance variable name in Person.java class
                                            //will return null since String name not set in Person.java
        System.out.println(person1.getAge());
            //What if want to set some conditions for age? As in, only positive numbers?

    }
}
