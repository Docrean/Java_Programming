package m10_variables_data_types;

public class CharVariable {

    public static void main(String[] args) {

        char ch1 = 'a'; //single character literal
        System.out.println(ch1);
        char ch2 = 97; //ASCII decimal number for 'a'
        System.out.println(ch2);
        char ch3 = 0x61; //hexadecimal for 'a'
        System.out.println(ch3);
        char ch4 = 65_505; //max char character count
        System.out.println(ch4);

        System.out.println("-------------------------------------");

       // char x = 64;
        //char x = 0x40;
        char x = '@';
        System.out.println(x);
    }
}