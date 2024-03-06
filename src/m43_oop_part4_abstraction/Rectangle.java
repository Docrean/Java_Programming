package m43_oop_part4_abstraction;

public class Rectangle extends Shape {
        //create unique variables of rectangle
    public double width;
    public double length;

    //To create the rectangle object, we need to set the width and length at the same time.
    //To do this we need to generate the constructor(will initialize the fields) to do it for us.
    //NEED TO GENERATE THE CONSTRUCTOR AS SOON AS OBJECT IS CREATED(MANUAL OR BY DEFAULT BY COMPILER)

    //The rectangle class can also have area...use the area function from the shape class by extending the shape class

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        //after this set, need to make the rectangle class the child of shape (put extends Shape
        //at end of class header.--MAKE SURE TO MAKE CHILD CLASS AS ABSTRACT OR ELSE WON'T
        //INHERIT FROM THE PARENT ABSTRACT CLASS.(compiler error).
        //Should this be the solution though? If circle class is abstract, then cannot create
        //an object from the rectangle.
        //ANY ABSTRACT CLASS CANNOT BE INSTANTIATED.
        //SHAPE CLASS CANNOT BE INSTANTIATED SINCE ITS ABSTRACT...NOW RECTANGLE CANNOT BE
        //INSTANTIATED SINCE ITS ABSTRACT.--need to create rectangle objects later so RECTANGLE
        //CANNOT BE ABSTRACT.---rectangle NEEDS TO STAY AS CONCRETE TO MAKE OBJECTs late on.
        //once abstract is removed from rectangle...get compile error...SO ONLY WAY TO GET RID
        //OF ERROR IN RECTANGLE CLASS HEADER IS BY GIVING A BODY TO THE ABSTRACT METHOD THAT IS
        //INHERITED TO THE RECTANGLE CLASS---THROUGH OVERRIDING.
        //ABSTRACT METHODS ARE MEANT TO BE OVERRIDDEN IN THE CONCRETE CLASSES.
        //IF THE CONCRETE CLASS IS EXTENDING THE ABSTRACT CLASS, THEN THE CONCRETE CLASS MUST
        //OVERRIDE ALL THE ABSTRACT METHODS OF THE ABSTRACT CLASS.
        //EVERY SINGLE METHOD IN THE CONCRETE CLASS MUST HAVE A BODY.
        //when overriding, the access modifier needs to be the same or more visible.
        //DO NOT GIVE THE ABSTRACT KEYWORD ANYMORE SINCE IT IS GOING TO HAVE A BODY AND
        //RETURN TYPE. return type and method signature need to be the same.

        //Intellij is smart. Put the mouse cursor over the class header and click the first suggested solution "Implement
        //methods". It will then override the calculate area of the shape (default return is 0--so in this case for
        //rectangle just need to provide the unique rectangle variables length and width to calculate area of rectangle.



    }


    @Override
    public double calculate_area() {
        return length * width;
    }
    //provide the toString so that we can print all the fields of the rectangle.


    @Override
    public String toString() { //show rectangle width and length and area as well.
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calculate_area() +'}';
    }
}
        //Now that we have the rectangle class, we now can create the rectangle object in the ShapeClients class to print
