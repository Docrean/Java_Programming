package m43_oop_part4_abstraction;

public class Cube extends Shape implements Volume { //have to still override the abstract methods of the interface
                                  //generate the override after implementing the Volume interface
                                  //Volume interface can be inherited to other shape classes via the volume method.
    //before extending the cube from the shape class, first include common variables of the cube.
    //every single cube has a side.
    //create an instance variable side for the cube.
    //whenever the cube object is created, need to set the instance variable side...GENERATE THE CONSTRUCTOR..
    public double side;
    //Generate the constructor whenever the cub

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculate_area() {
        return 6 * Math.pow(side, 2); //Once overridden from Shape abstract class, not give implementation.
    }            //Give equation to calculate_area() method in the cube class.

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }
    //Cube calculation in Java is 6 * Math.pow(sides, 2)
                //Since cube is multidimensional, we need to calculate Volume.

                //SINCE WE ARE GOING TO NEED TO CALCULATE THE VOLUME FOR OTHER SHAPES BUT NOT FOR EVERY SHAPE...
                //NEED TO CREATE AN INTERFACE VOLUME CLASS. CREATE THE VOLUME CLASS AND MAKE SURE TO SELECT INTERFACE


    //cube needs to have area and we need to calculate the area of the cube.
    //Parent shape class already has the calculate area method.
    //JUST NEED TO INHERIT ALL THE METHODS AND VARIABLES FROM THE SHAPE CLASS TO CUBE CLASS..EXTENDS KEYWORD.

}

    //Cube class in concrete. A concrete class cannot inherit an abstract class. Every single method in the concrete
    //class must have a body.

    //Cube concrete class MUST OVERRIDE THE ABSTRACT CLASS.

