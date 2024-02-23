package m41_oop_part3_inheritance.method_overriding;

//for teacher to be subclass of employee...use extends to inherit the Employee parent class
//will immediately give compiler error because the parent class contains a constructor with
//arguments only. Since constructor contains parameters, will have to manually call the constructor in the
//subclass
//Use Intellij Hotkey after hovering over error (Alt Shft Enter) to call the parent class constructor
public class Driver extends Employee  {

    public Driver(String name, int age, double salary) {
        super(name, age, salary);
    }

    public void work(){
        System.out.println("Driver " + name + " is driving");
    } //this being the 2nd implementation that is within this Teacher class.
    //so when called...the toString will override to print the Teacher subclass implementation.

}

            //Now Teacher and Driver subclasses created

            //Now create the object of the Teacher and Driver and see what the implementation of the
            //work() method in the Employee parent class.

            //the work method is inserted to both the Teacher and Driver. When calling the work method,
            //it is going to give the implementation of the work() method (name + " is working") since it is the
            //only one the work() method has.

            //Now create another class method named employee client.