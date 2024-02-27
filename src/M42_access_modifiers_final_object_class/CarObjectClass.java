package M42_access_modifiers_final_object_class;

public class CarObjectClass { //right click...generate...IntelliJ gives options to override methods.
        //Object class by default extends so do not have to write out extends(compiler error result)
        //this is why override methods are able to override


    public String make, model;
    public int year;
    public String color;
    public double price;
    //including these methods in the toString allows the Car class object to pass the variables into the print statement
    //use IntelliJ to pass the variable attributes into the toString.

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + //use the GetClass method to inherit parent class name to all subclasses(as subclasses may have diff names)
                "make='" + make + '\'' + //getClass provides ful info of the parent class to subs. if just want the simple name, call the simpleName method
                ", model='" + model + '\'' + //so now when passing the CarObjectClass into the print statement the toString prints all this (create CarClient)
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }



   /* @Override
    public String toString() {
        return super.toString(); //can include anything needed to override the toString (such as variable attributes)
    */


    }

