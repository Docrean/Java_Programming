package m23_method_overloading;

public class MethodOverloadingIntro {

    public static void main(String[] args) {

          displayValue(10);
          displayValue((double) 10);
          displayValue(10, 20.3);
          displayValue(3.3, (int)20.5);

          displayValue(10,(double)10);

        displayValue((double)10,10);
    }

    public static void displayValue(int a) {
        System.out.println("First Method");
    }

    //compile error if both methods parameters are same
    //overloading is only way to have same methods in one class
    //Datatypes, Number and Order
    public static void displayValue(double a){
        System.out.println("Second Method");
    }

    //can be same/dif | V this is what matters in overloading
    public static void displayValue(int a, double b) {
        System.out.println("Third Method");

    }

    public static void displayValue(double a, int b){
        System.out.println("Fourth Method");
    }

}

//Overloaded methods may have different return types access modifiers