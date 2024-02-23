package m41_oop_part3_inheritance;
        //example of static members inheritance:
        //therefore need to create some additional classes in ths java file

        //if creating multiple classes in a java file, have to make sure that the other
        //classes have a default access modifier.

        //there can only be one public class in a java file and the public class name has to match
        //with the java files name.
        //with any other classes can just give the default access modifier.

class ClassA{ //Parent ClassA

    public static int a = 100; //static int variable a

    public static void method(){ //static method
        System.out.println("Parent Classes' static method"); //static implementation given to the static class.
    }
}           //so what happens when the above static members are inherited to another class?
            //create another class

class ClassB extends ClassA{ //How to make ClassB the child of the parent ClassA?
                //extends ClassB to ClassA so all ClassA members extend to ClassB

    public static void method(){ //static method
        System.out.println("Child Classes' static method"); //static implementation given to the static class.
    }   //Cannot OVERRIDE Static methods, however, if we define a new implementation in the child class ClassB, this
        //will be executed..not the hidden one.
}



            //Since the static members are members of ClassB now and ClassA, can now call the members through either one
            //of the Classes.
            //To do so..create the main method in the static member inheritance class below and then call the static
            //members of ClassA and ClassB.
public class StaticMembersInheritance {

                public static void main(String[] args) {

                    System.out.println(ClassA.a);
                    System.out.println(ClassB.a);
                    //as long as the access modifier allows, the child class can inherit it.
                    //class members of the parent class will become members of child class.

                    //can also call the static method class ClassB extends ClassA through the ClassA and ClassB method
                    //call

                    ClassA.method();
                    ClassB.method();

                    //Unable to override(change implementations) DUE TO STATIC NATURE.
                    //If an instance method, would be able to override the method itself...
                    //But since static, cannot override.
                    //Even though cannot override, can still define a same static method in the child class.
                    //Can define a static method with the same static signature in the child class and then
                    //give the different implementation.
                    //What will happen is that the public static void method() will be hidden in the ClassB.
                    //Still inherited, but will be hidden in the child class.
                    //Method overriding must inherit the INSTANCE METHODS ONLY...BEING NOT PRIVATE AND NOT FINAL.
                }

}
