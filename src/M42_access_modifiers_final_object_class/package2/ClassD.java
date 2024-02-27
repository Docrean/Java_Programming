package M42_access_modifiers_final_object_class.package2;

import M42_access_modifiers_final_object_class.package1.ClassA;

public class ClassD extends ClassA {

    public static void main(String[] args) {

        System.out.println(ClassA.a); //within same as ClassA
        System.out.println(ClassA.b); //not a subclass. What if make ClassD as subclass of ClassA(use extends)-->Good.
        //System.out.println(ClassA.c);
        //System.out.println(ClassA.d);
    }
}

        //inheritance makes the difference between the protected and default access modifiers
        //protected its accessible outside the package only if its called through the subclass. not accessible if not
        //called in the subclass.
        //default not accessible outside the package.