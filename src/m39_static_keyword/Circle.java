package m39_static_keyword;

public class Circle {

    public double radius; //make radius as an instance because each circle object could have a different radius
                          //putting static after public means each circle radius WILL BE THE SAME
                          //static would mean only one copy of the radius value stored into all objects of the class
                          //static would not allow for storing different data regardless of how many circle objects created

                          //make as an instance so that each circle copy will be able to store different data into the circle objects
    public static final double PI = 3.14; //pi as static variable because PI IS SAME VALUE FOR ALL CIRCLE OBJECTS.
                                    //use final non-access modifier as pi is a FINAL VALUE WITH NO CHANGE.
                                    //final keyword requires SCREAMING UPPER CASE for the variable.

                            //set the constructor to initialize the public double radius instance variable. the static variable
                            //only has to be initialized once and does not have to be initialized once for every single object
                            //making the constructor is only needed to initialize the instance variable.
                            //WE DO NOT INITIALIZE THE STATIC VARIABLE WITHIN THE CONSTRUCTOR because the constructor gets
                            //executed seperately for each object.


    public Circle(double radius) { //generating the constructor thus initializes the instance variable radius...not the static PI
        this.radius = radius;
    }

    public double area(){
        return radius * radius * PI; //area of circle formula
    }

    public double perimeter(){
        return 2 * radius * PI; //perimeter of circle formula
    }

    @Override                    //to string to print the information of the circle object
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area" + area() + //add area as toString did not auto populate
                ", perimeter=" + perimeter() + //add perimeter as toString did not auto populate
                '}';
    }
}
