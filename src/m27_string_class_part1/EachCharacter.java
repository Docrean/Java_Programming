package m27_string_class_part1;

public class EachCharacter {

    public static void main(String[] args) {

        eachCharacter("AB");
    }

    public static void eachCharacter(String str){

        if(str == null || str.length() == 0){ //logical or as True which prints err message
            System.err.println("The text can not be null or empty");
            return; //exits the method
        }

        //the loop iterates String str index starting from i = 0 to str.length -1.(using < don't need to include -1)
        for (int i = 0; i < str.length(); i++) {  // i: indexes of the str
            System.out.println(str.charAt(i));
            
        }
        
    }
}
