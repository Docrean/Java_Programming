package m43_oop_part4_abstraction;

public class Dishwasher implements Volume {

    public static final boolean HAS_VOLUME = true; //since final, has to be initialized right away
@Override                                          //cannot have static block in interface..that's why this variable
    public double volume() {                       //has to be initialized while declaring it.
        return 0;
    }
}
