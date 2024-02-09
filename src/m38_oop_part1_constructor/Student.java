package m38_oop_part1_constructor;

public class Student { //custom class Student

    public String name; //instance variables name and age declared
    public int age;

    public Student(String name, int age){ //assign this constructor argument for the instance variable public string name
        this.name = name;         //in this body.
        this.age = age;            //need to assign the parameter variable String name to the instance variable String name^
                                   //use .this keyword ^
                                    //when creating the object form the student class...need to set the instance variables name and age within the object creation
                                    //this is when we need the Constructor. If no constructor, than instance variables would need to be called
                                    // one by one THROUGH THE OBJECT. See StudentClient Class file**

                                    //Since name and age are set with the Constructor and .this keyword, no need to manually
                                    //provide the student1.age/.name code fragments in StudentClient.java to access the
                                    //Student.java instance variables.
                                    //Provide the 2 arguments(name and age) to the new Student() object in StudentClient.java
    }

}
