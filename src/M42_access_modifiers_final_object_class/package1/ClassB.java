package M42_access_modifiers_final_object_class.package1;

public class ClassB {

    public static void main(String[] args) {
        //ClassA variables are static so can call through here. Which access modifier(s) can be called in same package?

        System.out.println(ClassA.a);
        System.out.println(ClassA.b);
        System.out.println(ClassA.c);
        //System.out.println(ClassA.d); //private not accessible in same package!
    }
}
