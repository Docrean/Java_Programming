package m43_oop_part4_abstraction;

public class Circle extends Shape { //want to set the circle object, then calculate radius and area later on.
                      //make circle object child of shape parent.
                      //Before make circle the child of shape parent, need to give unique variables and methods of circle

    public double radius; //want to be able to set the radius of the circle as soon as circle object is created...
                          // GENERATE CONSTRUCTOR...so to set it once the object is instantiated.


    public Circle(double radius) { //after this set, need to make the circle class the child of shape (put extends Shape
        this.radius = radius;      // at end of class header.--MAKE SURE TO MAKE CHILD CLASS AS ABSTRACT OR ELSE WON'T
                                   //INHERIT FROM THE PARENT ABSTRACT CLASS.(compiler error).
                                   //Should this be the solution though? If circle class is abstract, then cannot create
                                    //an object from the circle.
                                    //ANY ABSTRACT CLASS CANNOT BE INSTANTIATED.
                                    //SHAPE CLASS CANNOT BE INSTANTIATED SINCE ITS ABSTRACT...NOW CIRCLE CANNOT BE
                                    //INSTANTIATED SINCE ITS ABSTRACT.--need to create circle objects later so CIRCLE
                                    //CANNOT BE ABSTRACT.---circle NEEDS TO STAY AS CONCRETE TO MAKE OBJECTs late on.
                                    //once abstract is removed from circle...get compile error...SO ONLY WAY TO GET RID
                                    //OF ERROR IN CIRCLE CLASS IS BY GIVING A BODY TO THE ABSTRACT METHOD THAT IS
                                    //INHERITED TO THE CIRCLE CLASS---THROUGH OVERRIDING.
                                    //abstract methods are meant to be overridden in the concrete classes.
                                    //if the concrete class is extending the abstract class, then the concrete class must
                                    //override all the abstract methods of the abstract class.
                                    //when overriding, the access modifier needs to be the same or more visible.
    }                               //DO NOT GIVE THE ABSTRACT KEYWORD ANYMORE SINCE IT IS GOING TO HAVE A BODY AND
                                    //RETURN TYPE. return type and method signature need to be the same.

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + calculate_area() +'}';
    }

    public double calculate_area() {
        return Math.PI * radius * radius; //implementation of the area method in the circle class.
                                          //Remember...only one calculate_are() method has been created in the shape
                                            //class...and we just override it in the circle class when it was inherited.
                                            //Now create the object of the circle to see if we can calculate the area of
                                            //the circle.
                                            //create new class ShapeClient




    }



}
