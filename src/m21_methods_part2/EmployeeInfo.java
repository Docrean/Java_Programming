package m21_methods_part2;

public class EmployeeInfo  {

    public static void main(String[] args) {

        displayEmployeeInfo("James", 29, "New York");

        //ARGUMENT order must MATCH PARAMETER ORDER (3 parameters in this case 1st name, 2nd age, 3rd city)
        //ARGUMENT: Means passing a value...NOT a VARIABLE
        System.out.println("------------------------------------");
        //What if want to pass variables as arguments to the below method?

        String name = "Isabella";
        int age = 26;
        String city = "Los Angeles";
        //Now call the method signature to assign/display the method variables

        displayEmployeeInfo(name, age, city);
    }

    public static void displayEmployeeInfo(String name, int age, String city){
        System.out.println("Employee name is " + name);
        System.out.println(name + " 15 " + age + " years old");
        System.out.println(name + " is from " + city);
    }
}


//every single parameter must have a data type and parameter name
