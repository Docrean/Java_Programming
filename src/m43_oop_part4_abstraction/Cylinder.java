package m43_oop_part4_abstraction;

public class Cylinder extends Shape implements Volume {
    @Override
    public double calculate_area() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    } //cylinder being a shape so can create extends from shape.
                        //cylinder also a multi-dimensional shape so can implements Volume
                        //Click Intellij Red Bulb to OVVERIDE.

                        //CYLINDER HAS TO OVERRIDE ARE AND VOLUME ABSTRACT METHODS.


}
