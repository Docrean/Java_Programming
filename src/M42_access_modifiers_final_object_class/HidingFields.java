package M42_access_modifiers_final_object_class;

//both method hiding and hiding fields ARE RELATED WITH INHERITANCE...CAN ONLY HAPPEN WITH INHERITANCE

        //1. create the parent class
        //2. give example of method hiding first...CREATE STATIC METHOD FIRST
class Parent{

    //What about the fields? Suppose we create a static int variable in the static class...

            public static int a = 100; //this static int variable is now inherited to the child subclass..which means..
                                       //this static int variable can be called from the parent and child class


    public static void staticMethod(){ //REMOVING THE STATIC KEYWORD = METHOD OVERRIDING
        System.out.println("Parent class' static method"); //when this method is inserted to the child class, it will be
                                                            //inherited as is. CANNOT OVERRIDE STATIC METHODS.
    }
}                                               //to give different implementations to the method in the subclass,
                                                //then need to use method hiding.

                                                //for method hiding define using the same method signature of its parent
       //V--------------------------------------//declare the staticMethod() in the extends child class.

class Child extends Parent{ //declare the staticMethod() in the child class(access modifier/return type can be same/diff does not matter)
                            //method signature must be the same(staticMethod()).

                            //Since defining staticMethod()(is the method signature of its parent class public static void staticMethod(),
                            //when the parent class method is inherited to the child class, it will be hidden.
                            //So now, the child class can be re-written as "Child class' static method" without inheritance conflict.

    public static void staticMethod(){ //this is the static method defined in the child class.
                                        //REMOVING THE STATIC KEYWORD = METHOD OVERRIDING
        System.out.println("Child class' static method");
    }

}

public class HidingFields { //concept of hiding fields is similar to method hiding

    public static void main(String[] args) { //need the main method to run code(define within the parent class)

            Parent.staticMethod();
            Child.staticMethod(); //Due to method hiding, when staticMethod() is called from the child class, we get
                                    //the new implementation "Child class' static method.

            //this static int variable a can be called from the parent and child class

        System.out.println(Parent.a);
        System.out.println(Child.a);
    }




}
