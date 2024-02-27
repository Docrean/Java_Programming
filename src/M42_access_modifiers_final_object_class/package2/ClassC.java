package M42_access_modifiers_final_object_class.package2;

import M42_access_modifiers_final_object_class.package1.ClassA;

public class ClassC {

    public static void main(String[] args) {

        System.out.println(ClassA.a); //remember to import to access members of a class in a different package
        // System.out.println(ClassA.b); //protected. not always accessible outside packages(only under special condition-->subclass)
       // System.out.println(ClassA.c); // not in same class nor same package
       // System.out.println(ClassA.d); //not in same class
    }
}
