package m43_oop_part4_abstraction;

public abstract class Shape { //this will be the parent class for all shapes. must contain common features all of subclasses.

    public final String name = getClass().getSimpleName(); //instance variable name. name always set to class name. class name shape, then shape. if circle, then circle
                        //can set the name right away to get the simple class name.
                        //gets the class name then assigns it the variable name.
                        //How to make sure the variable never changes? give the final keyword.
                        //Don't make as static since not all shapes name are the same.
                        //circle should be circle, square should be square, rectangle should be rectangle, etc.
                        //if made static, then name will be the same across all classes.
    public abstract double calculate_area(); //take out the body of the method to focus on just the essential of providing the method.
                                    //will give compiler error because IN ORDER TO MAKE A METHOD WITHOUT ITS BODY IN JAVA
                                    //NEED TO MAKE IT ABSTRACT IN JAVA...include the abstract keyword.
                                    //ABSTRACT CANNOT BE CREATED IN A REGULAR CLASS..MUST BE IN AN ABSTRACT CLASS OR INTERFACE.
                                    //MUST INCLUDE ABSTRACT WITHIN THE CLASS TO MAKE ABSTRACT CLASS.
                                    //By making the class abstract we only then need to focus on what is needed for ALL
                                    //CHILD CLASSES.
                                //If not applying abstraction, need to give an implementation to this method.
                                //But is there a common formula to calculate the area of all the shapes regardless if
                                //shape is square, circle or rectangle? is there a common formula to calculate the area
                                //of any shape? The implementation is not common right? There is not one formula that
                                //can calculate the area of all the shapes? The way to calculate can be different from
                                //one shape to another right? Area of circle is different from square which is differnt
                                //from rectangle. There will be different implementations that will be required for this
                                //method in the subclasses. Should we focus on all these small details? On how the method
                                //is done and how to complete the functionality? If all these details are focused on, we
                                //cannot complete the parent. INSTEAD...FOCUS ON WHAT IS NEEDED--calculate area method
                                //and the method that is needed for all the subclasses.

                                //after this create now the subclasses of the shape.


    @Override
    public String toString() { //by default it will only include the name of the shape (return "Shape"{")
        return name + "{" +       //we need to print the area of circle so replace "Shape with name(which is the circle object)
                "area='" + calculate_area() + '\'' + //then replace "name='" with "area='" and then replace name concated to
                '}';                     //to calculate_area() object to print the area numerical values.

    }                   //this toString method is inherited as is to the circle class. So printing the ShapeClients object
                        //again will print the circle area as is...although still did not include the radius still...since in the
                        //shape class we do not have a radius field included, however, can still override the toString method
                        //in the Circle class if you generate the toString method in the Circle class it will allow you to
                        //include the radius. Once the toString is made in the Circle class for radius, can then cancat
                        //the area object. After doing this, once again running ShapeCLients will provide the circle radius
                        //and area.
}
