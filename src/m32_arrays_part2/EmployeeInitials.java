package m32_arrays_part2;

import java.util.Arrays;

public class EmployeeInitials {

    public static void main(String[] args) {

        String[] names = {"John Doe", "Alice Smith", "Robert Johnson"};
        //1 Create a new Array first
        //2 set the new array to same length as the names array with new variables initials = new String[names.length];
        //3 Get access to each array element
        //4 Get initials and then store into the initials array variable
        //4 Need to get index numbers so use the for loop (NO INDEX NUMBERS WITH FOR-EACH)
        //5 Use one loop to iterate both arrays at the same time
        String[] initials = new String[names.length]; //3 initials as 3 initials
        //for loop iteration accesses both arrays since they have same length
        for (int i = 0; i < names.length; i++) {      //names.fori shortcut for for loop
            //no need for variable eachName can just give array names[i]

            initials[i] = names[i].charAt(0) + "," + names[i].charAt(names[i].indexOf(" ") + 1); //initial from each name using the charAt method.

        }

        System.out.println(Arrays.toString(initials));

        System.out.println("--------------------------------------------");

        String[] names2 = {"John Doe", "Alice Smith", "Robert Johnson"};

        String[] initials2 = findInitials(names2);

        System.out.println(Arrays.toString(initials2));
    }

    public static String[] findInitials(String[] names) {
        String[] initials = new String[names.length]; //3 initials as 3 initials
        //for loop iteration accesses both arrays since they have same length
        for (int i = 0; i < names.length; i++) {      //names.fori shortcut for for loop
            //no need for variable eachName can just give array names[i]

            initials[i] = names[i].charAt(0) + "," + names[i].charAt(names[i].indexOf(" ") + 1);
        }

        return initials;
    }

}
                //use step into button on DEBUGGER FOR a METHOD CALL