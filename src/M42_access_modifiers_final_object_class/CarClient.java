package M42_access_modifiers_final_object_class;


public class CarClient { //create the object of the CarObjectClass

    public static void main(String[] args) {

        CarObjectClass car = new CarObjectClass(); //compiler creates constructor by default if not manually generated

        System.out.println(car);  //pass the variable car as reference variable
        //car.finalize(); //car is unreferenced so it is garbage collected.
        car = null; //object now eligible for garbage collection using null keyword(not
                    //since eligible for garbage collection, garbage collector calls finalize method implicitly
    }


}
