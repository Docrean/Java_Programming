package M42_access_modifiers_final_object_class.package1;

public class ClassA {

    public static int a = 100;
    protected static int b = 200;
    static int c = 300; //no keyword for default access modifier. default is used in an interface.
    private int d = 400;
}
/*
Access Modifier     Description         Same Class      Same package    Sub-class       World
public              everywhere            Yes             Yes             Yes           Yes
protected     within same class/subclass  Yes             Yes             Yes            No
default
(Packageprivate)  within same package     Yes             Yes              No            No
private           only within same class  Yes             No               No            No


 */