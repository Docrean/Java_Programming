package m41_oop_part3_inheritance.method_overriding;

public class Employee {
                        //can set as private and then use setters and getters to have more control over data.
    public String name;
    public int age;
    public double salary;

                        //Set the constructor to set the information(name, age, salary) of the employee


    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
                        //set the toString method to be able to print the employee object whenever it's passed into the
                        //print statement

                        //in order for the toString to display the class name, replace "Employee" and concat to the toString
                        //use getClass().getSimpleName()...in this case will display Employee as class name
                        //the toString method is an overriding method...we are overriding the toString method to the Employee
                        //class.
                        //this toString originally came from the object class...which is the parent of ALL THE CLASSES.
                        //need to have this toString method as a different implementation in this employee class...thats
                        //why we need to override it so to make sure IT HAS DIFFERENT IMPLEMENTATIONS.

                        //an independent representation of the toString would give a compiler error.

                        //Going to use a different overriding example...so creat the instance method work so can use the
                        //instance variable "public string name".

                        //So create the work method.

    public void work(){ //this is the method
        System.out.println(name + " is working"); //this being the implementation given to the method
    }               //later on..when subclass is created from this Employee parent class, this same implementation will be
                    //inherited to the subclasses.

                    //for example: create 2 subclasses of Employee. 1st name Teacher


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
