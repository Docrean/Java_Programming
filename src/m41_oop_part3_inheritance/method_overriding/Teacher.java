package m41_oop_part3_inheritance.method_overriding;

        //for teacher to be subclass of employee...use extends to inherit the Employee parent class
            //will immediately give compiler error because the parent class contains a constructor with
            //arguments only. Since constructor contains parameters, will have to manually call the constructor in the
            //subclass
            //Use Hotkey after hovering over error (Alt Shft Enter) to call the parent class constructor
public class Teacher extends Employee {
            public Teacher(String name, int age, double salary) {
                super(name, age, salary);
            }
                //can use Intellij override feature, however, that will use the parent class implementation...

            @Override //use @Override to catch any possible errors made during override process
            public void work(){
                System.out.println("Teacher " + name + " is teaching");
            } //this being the 2nd implementation that is within this Teacher class.
              //so when called...the toString will override to print the Teacher subclass implementation.

        }
                //create the 2nd subclass of employee name is Driver.