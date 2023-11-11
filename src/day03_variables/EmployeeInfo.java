package day03_variables;

public class EmployeeInfo {

    public static
    void main(String[] args) {

        /*
        System.out.println("Aaron");
        System.out.println("Aaron");
        System.out.println("Aaron");

        System.out.println("----------------------------------");
        String name = "Aaron";
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        */
        //to pass as variable without " "
        String employeeName = "Daniel";
        int age = 35;
        char gender = 'M';
        String companyName = "Google Inc",
                employeeId = "A19", //declare multiple strings from one string line...use comma ,
                jobTitle = "Java Developer";
        int salary = 110000;
        boolean isFulltime = true;


        //if no comma can set up as normal
        /*String companyName = "Google Inc"
          String employeeId = "A19"
          String jobTitle = "Java Developer"
         */


        System.out.println(employeeName);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(companyName);
        System.out.println(employeeId);
        System.out.println(jobTitle);
        System.out.println(salary);
        System.out.println(isFulltime);

        System.out.println("-------------------------");

        System.out.println("employeeName = " + employeeName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("companyName = " + companyName);
        System.out.println("employeeId = " + employeeId);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("salary = " + salary);





    }
}

/*
Create a class named EmployeeInfo.java
Declare the following variables with appropriate data types:
    name
    age
    gender
    companyName
    employeeId
    jobTitle
    salary
    isFullTime

 */