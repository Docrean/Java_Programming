package m27_string_class_part1;

public class ConcatLowerCaseUpperCase {

    public static void main(String[] args) {

        String str = "Cydeo"; //this object is immutable(unchangeable)

        str.concat("School"); //this line does not modify str but only references it
                                    //no variable referencing this object "Cydeo school"
                                    // -->no reference variable=garbage collected

        str = str.concat(" School"); //NOW REASSIGNED and concat to original "Cydeo"

        System.out.println(str);//"Cydeo School". Remember: "Cydeo" as new object on line 9 has not been reassigned
                                                  // to a new variable until line 12.

        String LowerCase = str.toLowerCase(); //"cydeo school"

        System.out.println("LowerCase = " + LowerCase);

        String UpperCase = str.toUpperCase();

        System.out.println("UpperCase = " + UpperCase);
    }
}
