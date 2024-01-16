package m20_methods_part1;

public class PassByValue {

    public static void main(String[] args) {

        int a = 5; //value not changed since pass by value update new copy ONLY IN METHOD
                        // does not change this int a value

        displayCube(a);

        System.out.println("a = " + a);
    }

    public static void displayCube(int num){//when this method executes this parameter variable is updated
        System.out.println("The number is: " + num);    //Java is pass by value: when argument passed a new copy is then
        num = num * num * num; //don't use additional variable just assign num =  //passed to the method
        System.out.println("Cube is: " + num);
    }
}
