package m43_oop_part4_abstraction;

public interface Volume {

   double volume(); //grey is redundant because public is given by default to all variables
                                                //and methods. When created the method, if no body is given, it will be
                                                //given automatically by default.
      //THIS IS AN ABSTRACT METHOD. when creating the abstract method it is not needed to write abstract.
}
        //ONCE INTERFACE IS CREATED, WHICHEVER CLASS NEEDS THE VOLUME INTERFACE, IT CAN BE INHERITED FROM THIS INTERFACE