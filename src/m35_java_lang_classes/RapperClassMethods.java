package m35_java_lang_classes;

public class RapperClassMethods {

    public static void main(String[] args) {

        char ch ='%';

       boolean isDigit = Character.isDigit(ch); //Character wrapper class isDigit

        System.out.println("isDigit = " + isDigit); //assign isDigit boolean variable to print true or false


        boolean isLetter = Character.isLetter(ch); //Character wrapper class isletter

        System.out.println("isLetter = " + isLetter);

        boolean isUpperCase = Character.isUpperCase(ch); //Character wrapper class isUpperCase

        System.out.println("isUpperCase = " + isUpperCase);

        boolean isLowerCase = Character.isLowerCase(ch); //Character wrapper class islowerCase

        System.out.println("isLowerCase = " + isLowerCase);

        boolean isSpecialChar = !Character.isLetterOrDigit(ch); //Character wrapper class isLetterOrDigit
                                                                  //! logical not operator to check if special character other than letterorDigit
        System.out.println("isSpecialChar = " + isSpecialChar);

        System.out.println("--------------------------------------");

        String str = "a1b2z3e4*^%"; //How to only display digits of this String?
                                    //1st get access to every single char/character of the string
                                    //2nd check if the character is digit
                                    //then can pass the character into every single digit method of the character upper class method
                                    //will return either true or false.
                                    //once returns true than can print that character that is the digit.
                                    //1st. pass char to get every single character one by one as char
                                            //call the toChar method


        for (char each : str.toCharArray()) {//each represents every single character of the char array constructed from the string.
            if (Character.isDigit(each)) { //for loop checks for if condition digits
                System.out.println(each);


            }                 //once char method array called then for each loop to get every char character
        }                   // use str.char to call str.toCharArray() then type str.toCharArray().for to get for each loop


        System.out.println("--------------------------------------");

        System.out.println(Integer.MIN_VALUE); //Integer.MIN wrapper keyword for minimum value of Integer
        System.out.println(Integer.MAX_VALUE); //Integer.MAX wrapper  keyword for minimum value of Integer

        System.out.println(Short.MIN_VALUE); //Short.MIN wrapper keyword for minimum value of Integer
        System.out.println(Short.MAX_VALUE); //Short.MAX wrapper keyword for minimum value of Integer



    }
}
