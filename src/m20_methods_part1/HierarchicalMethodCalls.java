package m20_methods_part1;

public class HierarchicalMethodCalls {

    public static void main(String[] args) {

        //read();
        //write();
        learn(); //this method call is calling read and write from the learn methods body
                  //as a Hierarchical call
    }

    public static void read() {
        System.out.println("I am reading");
    }

    public static void write() {
        System.out.println("I am writing");
    }

    public static void learn() {
        read(); //a method call
        System.out.println("I am learning");
        write();
    }
}
