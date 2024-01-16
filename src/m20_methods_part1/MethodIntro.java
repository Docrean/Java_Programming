package m20_methods_part1;

public class MethodIntro {

    public static void main(String[] args) { //need main method to MAKE JAVA FILE RUNNABLE
//<--run option NOT AVAILABLE WITHOUT MAIN METHOD
        System.out.println("Test Started"); //1st
        eat();
        walk(); //0 parameters
        MethodIntro.play(); //5th
        System.out.println("Test completed"); //6th
    }

    public static void eat() {
        System.out.println("I am eating"); //2nd
    }

    public static void walk() {
        System.out.println("I am walking"); //3rd

    }

    public static void play(){
        walk(); //4th. how to call at same time from method body here? Use class name static modifier
        System.out.println("I am playing");
    }
}
//JAVA CODE ALWAYS EXECUTED FROM TOP TO BOTTOM
//multiple methods can be created IN SAME CLASS but in their OWN INDIVIDUAL BLOCKS