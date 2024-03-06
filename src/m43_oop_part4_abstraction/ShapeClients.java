package m43_oop_part4_abstraction;

import lombok.Data;

@Data
public class ShapeClients { //in this client we are to create the object of abstract class shape and its concete class circle.

    public static void main(String[] args) {
        //create the shape object

       // Shape shape = new Shape(); //error since shape is abstract and cannot be instantiated.
                                    //OBJECT MUST BE CREATED FROM A CONCRETE CLASS.
                                    //ABSTRACT CLASS IS NOT A CONCRETE CLASS..comment out for now
                                    //now lets try to create a circle object from circle class.
        Circle circle = new Circle(5);

        System.out.println(circle); //generate hash without toString. use lombok library


        
    }
}
