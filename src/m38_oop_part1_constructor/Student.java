package m38_oop_part1_constructor;

public class Student { //custom class Student

    public String name; //instance variables name and age declared
    public int age;
    public String gender; //generate constructor for all 3 variables...
    public double gpa;

    public Student(){ //can set default name and age with this no arg constructor
    name = "Billy";
    age = 14; //becomes default value for whenever the instance variable age is called from student class object
    }
                    //2 constructors = 2 options when creating the student object

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age){ //assign this constructor argument for the instance variable public string name
        this(name); //CHAINED ^                //in this body.
        this.age = age;
    }

    public Student(String name, int age, String gender){
        this(name, age); //CHAINED ^ //since instance variable name already in previous constructor just call it here
        this.gender = gender;
    }

    public Student(String name, int age, String gender, double gpa) {
        this(name, age, gender); //CHAINED ^ //Use ctrl + space to get menu then click all 3 instance variables to be constructor chained here
        this.gpa = gpa;
    }
            //ONLY CALL ONE CONSTRUCTOR PER CONSTRUCTOR IN A CONSTRUCTORS BODY AT A TIME
            //CAN ONLY PLACE ONE this call in a IN THE BEGINNING OF A CONSTRUCTORS BODY

              //need to assign the parameter variable String name to the instance variable String name^
                                   //use .this keyword ^
                                    //when creating the object form the student class...need to set the instance variables name and age within the object creation
                                    //this is when we need the Constructor. If no constructor, than instance variables would need to be called
                                    // one by one THROUGH THE OBJECT. See StudentClient Class file**

                                    //Since name and age are set with the Constructor and .this keyword, no need to manually
                                    //provide the student1.age/.name code fragments in StudentClient.java to access the
                                    //Student.java instance variables.
                                    //Provide the 2 arguments(name and age) to the new Student() object in StudentClient.java

                                    //this(name) in the 3rd constructor now Chained to the 2nd constructor.


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}



           //Alt Insert for shortcut to create constructor
