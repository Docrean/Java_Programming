package m41_oop_part3_inheritance.method_overriding;

public class EmployeeClient {

    public static void main(String[] args) {
        //Now create the object of the teacher and driver.
        //Store Teacher into reference variable teacher and create new Teacher object with parent class constructor
        //variables name, age, and salary
        Teacher teacher = new Teacher("Brandon", 17, 1_000_000_000);
        //Now create the Driver object by storing Driver into reference variable driver and create new Driver object
        //with parent class constructor variables name, age, and salary.
        Driver driver = new Driver("Peggy", 47, 1_000_000_000);

        System.out.println(teacher);
        System.out.println(driver);

        //Now create the Developer object by storing Driver into reference variable driver and create new Driver object
        //with parent class constructor variables name, age, and salary.
        Developer developer = new Developer("Kepler", 5, 1_000_000_000);
        //Now print Teacher, Driver and Developer objects to make sure all the instances are set.
        System.out.println(developer);
        //Now call the work method from the developer object in the developer class
        developer.work();
        //Remember...the toString is overriding from the object class in the Employee parent class...that's how its goin
        //to print the Teacher and Driver class names. Whenever the employee object is passed the child class names print
        //instead of the parent class name Employee printing(Overrides) and then the variable attributes.
        //the toString is inherited to the toString and driver.

        //So what if the work() method is called from the teacher and driver class?

        teacher.work();
        driver.work();


        //Now re-run the program...
        //the work() method prints the child class Teacher and Driver names with the " is working" implementation
        //inherited as is.
        //But what if want a different implementation for each Teacher and driver subclass? (Teacher is teaching, Driver
        //is driving)...
        //Will then have to override the work method in the subclasses Teacher and Driver by following the method overriding
        //rules:

        /*
        Method Signature: The overriding method in the subclass must have the same method name
        and parameters as the method in the superclass.--must be same( work() in this case)

        Access Modifiers: Overriding methods cannot have more restrictive access modifiers than the
        methods they override.--if parent class is public, use public to override(most visible).

        Return Type: The return type of the overriding method must be compatible with the return type
        of the overridden method.--must be compatible or the same(void in this case).

        Primitive Type -> Must be the same
        Reference Type -> Must be the same type or sub type (covariant type)

         */
    }
}
