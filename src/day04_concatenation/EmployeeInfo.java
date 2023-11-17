package day04_concatenation;

public class EmployeeInfo {

    public static void main(String[] args) {

        String name = "Daniel",
                company_name = "Google Inc",
                jobTitle = "Software Developer",
                gender = "Male";

        long age = 28,
                salary = 90000;

        System.out.println(name + " is " + age + " years old, " + "gender is " + gender + ".\n"
                + name + " works at " + company_name + " as a " + jobTitle + ".\n"
                + name + " makes $" + salary + " per year.");


    }
}
