package m28_string_class_part2;

public class SubString {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        String firstWord = str.substring(0, str.indexOf(" ")); //either space 6 or use indexOf string

        System.out.println("firstWord = " + firstWord);

        String secondWord = str.substring(str.indexOf(" ") + 1); //no need for lastIndex as given by default

        System.out.println("secondWord = " + secondWord);

        //String r = str.substring(10, 0); Won't work backwards
        //String r = str.substring(5, 25); Range index to large(stops at around 12)

        //play attention to index numbers in reference to string. if in wrong order or out of range it will give
        // IndexOutOfBoundsException that an index related to a string is out of range.
    }

}
