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
        Circle Circle = new Circle(5);


        System.out.println(Circle); //generate hash without toString. Generate toString since never generated toString
                                    //in the shape or circle class.(generate in the shape class).

        Rectangle Rectangle = new Rectangle(7, 8);

        System.out.println(Rectangle);
    }
}


            //REMEMBER. WE HAVE TWO IMPLEMENTATIONS OF AREA:

            //THERE IS ONLY ONE CALCULATE AREA METHOD WHICH WAS CREATED IN THE SHAPE CLASS, HOWEVER, IT HAS
            //BEEN OVERRIDDEN IN THE CIRCLE AND RECTANGLE CLASS.
            //EACH TIME IT WAS OVERRIDDEN IN THE CIRCLE AND RECTANGLE CLASS A DIFFERENT IMPLEMENTATION WAS GIVEN.
            //WHEN THE AREA IS CALLED, ONLY ONE OF THE IMPLEMENTATIONS GETS EXECUTED..DEPENDING ON WHICH OBJECT THE
            //THE METHOD IS BEING CALLED FROM.

            //BY APPLYING THE ABSTRACTION IN THE SHAPE CLASS, WE WERE ABLE TO IGNORE ALL THE SMALL DETAILS OF THE SHAPE
            //CLASS' AREA FUNCTION. WE WERE ABLE TO HIDE THE IMPLEMENTATION DETAILS OF THE CALCULATE_ARE() METHOD...THIS
            //ALLOWED US TO FOCUS ON THE ESSENTIALS RATHER THAN ON THE SMALL DETAILS.

