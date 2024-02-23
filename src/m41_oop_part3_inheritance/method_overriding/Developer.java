package m41_oop_part3_inheritance.method_overriding;

public class Developer extends Employee {

    public Developer(String name, int age, double salary) {
        super(name, age, salary);

        //the Intellij generate shortcut will still generate the parent class work() method's implementation by default


    }
    //will have to use the Intellij generate override method and change the implementation


    @Override
    public void work() {
        System.out.println("Developer " + name + " is coding");
    }
        //Now create the developer object in the EmployeeClient to print

}
