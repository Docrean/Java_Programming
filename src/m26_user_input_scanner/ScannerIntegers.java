package m26_user_input_scanner;

    import java.util.Scanner; //can't create scanner object without importing
                                //use util.scanner hotkey
public class ScannerIntegers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //use in variable as input string
                                                //System.in used for scanner object getting input during runtime

        System.out.println("Enter your first number: ");
        byte firstRun = input.nextByte(); //byte

        System.out.println("Enter your second number: ");
        short secondRun = input.nextShort(); //short

        System.out.println("Enter your third number: ");
        int thirdRun = input.nextInt(); //int(most preferred data type)

        System.out.println("Enter your fourth number: ");
        Long fourthRun = input.nextLong(); //long

        input.close(); //need to close the scanner when done so won't be able to access keyboard anymore

        //System.out.println("Enter your third number: ");
        //int fifthRun = input.nextInt();
                                            //(Won't work as scanner closed)

        System.out.println("firstRun = " + firstRun);
        System.out.println("secondRun = " + secondRun);
        System.out.println("thirdRun = " + thirdRun);
        System.out.println("fourthRun = " + fourthRun);
    }
}

    /*
    Write a program that asks the user toe nter 4 numbers. Ue apporiate methods. Then close
    the scanner and try to read any input again. Finally, print inputs as shown on the output.

    Example:
        Input: 10, 20, 30, 40
        Output:

            First number: 10
            First number: 20
            First number: 30
            First number: 40


     */