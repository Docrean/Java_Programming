package m28_string_class_part2;

public class ReplaceTrim {

    public static void main(String[] args) {

        String str = "Apple Apple Apple";

       //str = str.replace("Apple", "Cherry"); //Cherry Cherry Cherry but did not update variable
                            //How to make an object reference variable reference a new object?
        // ......assign to str
        str = str.replaceAll("Apple", "Cherry"); //Other way to Cherry Cherry Cherry

        System.out.println(str);

        str.replaceFirst("Cherry", "Grape"); //need to re-assign variable again for replaceFirst "Grape Cherry Cherry"

        System.out.println(str);

        String = "          Cydeo School                "; //Use trim for white


    }
}
