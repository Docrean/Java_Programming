package m40_oop_part2_encapsulation;

public class Person {

    private String name; //change to private so other classes will not be able to access
    private int age; //to ensure usability of the data generate the getters/setter to be able to write it

    //to read the name of the person outside this class will provide the getter

    public String getName(){ //getter to read the value of the private field
        if(name == null){
            System.err.println("Name cannot be null"); //creating this condition the getter now returns null in PersonCLient.java than this prints
                                                       //using the if statement == to no.
            System.exit(1); //terminates the entire program

        }
        return name; //access to the private field name
    }
        //ONLY WAY TO SET THE NAME OF THE PERSON IN PersonClient.java is to use the setter to set the name is in the Person class
        //since name is Private in Person.java and is not accessible outside the public class Person.
        //1.TO GENERATE SETTER WILL STILL USE THE public access modifier
        //2. SETTER ONLY SETS THE VALUE OF THE PRIVATE FIELD. DOES NOT NEED TO RETURN ANY VALUES AT ALL.'
        //3. THIS IS WHY ITS public "void"
        //4. method name of setter always starts with set
        //5. Use camelcase to make the setter readable. setName(intellij gives the default)
        //6. setter must take a value in the argument to make it readable. new data has to be stored into name when the
        // the setter is being called.
        //7. provide new data to the setter.
        //8. in order to store new data in the name variable, setter needs to pass the parameter and the parameter has
        // to be matching to the private fields data type.
        //9. Parameter has to be String and use same "name" data type as it should match to make it more readable so that
        // the setName argument (String name) is for setting the instance variable name.
        //10. Setter calls the variable name through this.name and assigns the given argument name.
        // when setter is called, its going to take an argument and assigns it to the instance variable name.
        //Now call the setter in the PersonClient.java class. Although there is not direct acces to the private variable
        //name, in order to write and update it use the setter.
        //Use the setter to allow the PersonClient class in PersonClient.java to access the private field name instance variable
        //set person1.setName("Brandon") where the string argument will be assigned to the private field name instance variable

    public void setName(String name){
        if (name == null || name.isEmpty() || name.isBlank()){
            System.err.println("Invalid input/data for the name: " + name);
            System.exit(1);
        }
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            System.err.println("Age cannot be negative" + age); //use serr for error print statement shortcut
            System.exit(1); //exits program to make sure to not set the negative number to the this.age call
        }
        this.age = age;
    }
//if the private field was set to public than would not be allowed to add those restrictions and conditions
        //before reading and writing the data.
        //by setting the class to private we make sure the setters and getters are the only ways to read and write the
        //private data.
        //if need to add any restrictions or conditions before reading and writing, now will be able to do so in the getter
        //and setters' blocks of code.
        //GETTERS AND SETTERS ARE MOST OFTEN USED WHENEVER CREATING CLASSES AND OBJECTS.
        //USE THE GETTER AND SETTER SHORTCUT TO WHICHEVER PRIVATE INSTANCE VARIABLE NEEDS TO SET
                //right click, generate, getter and setter.
        //then set the age in PersonClient.java as person1.setAge(10);
        //then set the print statement with the getter to read person1.getName

}
        //WHEN DEVELOPERS GENERATE CUSTOM CLASSES THEY LIKE TO MAKE THE FIELDS PRIVATE. EVEN WITHOUT ANY RESTRICTIONS OR
        //CONDITIONS IN THE BEGINNING, THEY STILL MAKE IT PRIVATE AND GENERATE GETTERS AND SETTERS AS IT MAKES CODE MORE
        //FLEXIBLE. WHAT IF CHANGES NEED TO BE MADE LATER OR NEED TO INCLUDE SOME CONDITIONS OR RESTRICTIONS? OR WHAT IF
        //CONDITIONS NEED BE GIVEN TO CERTAIN VARIABLES? CAN JUST GO BACK TO THE GETTER AND SETTER OF EACH OR BOTH VARIABLES
        //TO DO SO.