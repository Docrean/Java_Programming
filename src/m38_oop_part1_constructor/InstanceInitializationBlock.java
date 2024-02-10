package m38_oop_part1_constructor;

public class InstanceInitializationBlock { //no arg constructor can be given by default
    //instance variables
    public String name; //to set default values for these instance variables. Use instance blocks instead of no arg constructor
    public int age;

    {
        name = "unknown"; //this means: as soon as object is created from the class InstanceInitializationBlock
        age = 10;         //the name and age will be set to default.
    }

    public InstanceInitializationBlock(String name, int age) { //NO LONGER DEFAULT CONSTRUCTOR IN THE CLASS. THIS IS ASSIGNED
        this.name = name;                                   //can set any name to name object and any number to age object using CONSTRUCTOR
        this.age = age;
    }

    public static void main(String[] args) { //creat object from class InstanceInitializationBlock within main method
        /*
        InstanceInitializationBlock obj = new InstanceInitializationBlock(); //use default constructor to create the object

        System.out.println(obj.name); //print name and age objects
        System.out.println(obj.age);

         */

        InstanceInitializationBlock obj2 = new InstanceInitializationBlock("Brandon", 35);

        System.out.println(obj2.name);
        System.out.println(obj2.age);

    }


}    //constructor is still more useful than the instance block in initializing the instance variables.
     //Why? With the constructor one is able to pass parameters and take arguments to assign any data as necessary to
    //the two variables name and age as long as the data types are matching.
    //USING INSTANCE BLOCK LEAVES NO OTHER OPTIONS BUT TO ASSIGN THE DEFAULT VALUES TO THE INSTANCE VARIABLES.
    //USING CONSTRUCTOR ALLOWS TO SET DIFFERENT VALUES AND EVALUATE THE DIFFERENT VALUES FOR EACH OBJECT.


    /*
    !!!!!!!!!!!!!!!!!!!
    CONSTRUCTOR GETS EXECUTED SEPERATE FOR EVERY SINGLE OBJECT AND IF YOU HAVE DIFFERENT OBJECTS, YOU CAN STILL SET THE
    NAME AND AGE OF THE NEW OBJECT.

    INSTANCE BLOCKS CAN ONLY SET DEFAULT VALUES OF NAME AND AGE

    WHEN INITIALIZING INSTANCE VARIABLES, CONSTRUCTOR IS STILL SUPERIOR COMPARED TO THE INSTANCE BLOCK DUE TO ABILITY TO
    SET PARAMETERS AND GET ARGUMENTS BY USING THE CONSTRUCTOR.

    IF SETTING INSTANCE VARIABLES OF THE OBJECT USE THE CONSTRUCTOR.

    INSTANCE BLOCK IS ALWAYS EXECUTED BEFORE THE CONSTRUCTOR IF ANY INITIALIZER BLOCK HAS BEEN DECLARED IN THE CLASS.
     */
