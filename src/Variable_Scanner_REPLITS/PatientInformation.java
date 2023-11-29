package Variable_Scanner_REPLITS;

public class PatientInformation {

    public static void main(String[] args) {

    /*
    * import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //Enter your code here

    Scanner scan = new Scanner(System.in);
    String firstname, lastname, email, street,
            state, city;
    int age, zipCode;
    double height, weight;
    boolean isMarried;
    long workPhoneNumber, personalPhoneNumber;

    System.out.println("Welcome to the patient portal!\nPlease enter your personal information");

    System.out.println("Enter your first name");
    firstname = scan.next();

    System.out.println("Enter your last name");
    lastname = scan.next();


   // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = scan.next();

        scan.nextLine();//to capture Enter key press

        System.out.println("Enter your street");
        street = scan.nextLine();

     // continue for city

    System.out.println("Enter your city");
    city = scan.next();

    System.out.println("Enter your state");
    state = scan.next();

    System.out.println("Enter your zip code");
    zipCode = scan.nextInt();

    System.out.println("Enter your work phone number");
    workPhoneNumber = scan.nextLong();

    System.out.println("Enter your personal phone number");
    personalPhoneNumber = scan.nextLong();

    System.out.println("Enter your age");
    age = scan.nextInt();

    System.out.println("Enter your height");
    height = scan.nextDouble();

    System.out.println("Enter your weight");
    weight = scan.nextDouble();

    System.out.println("Are you married?");
    isMarried = scan.nextBoolean();

    String contact ="work phone number: " + workPhoneNumber + ", personal phone number: " + personalPhoneNumber + ", email: " + email;

    String fullname =firstname + " " + lastname;

    String address =street + ", " + city + ", " + state + " "+ zipCode;

    System.out.println("Patient personal information");
    System.out.println("Full name: " + fullname);
    System.out.println("Address: " + address);
    System.out.println("Contact: " + contact);
    System.out.println("Age: " + age);
    System.out.println("Height: " + height);
    System.out.println("Weight: " + weight + " pounds");
    System.out.println("Married: " + isMarried);
    * */

        /*
        * ### This program will use Scanner to get many inputs about a patient and use that information to build a summary.

- Declare nine `String` variables: `firstName`, `lastName`, `email`, `street`, `state`, `city`

- Declare two `int` variables: `age`, `zipCode`

- Declare two `double` variables: `height`, `weight`

- Declare a `boolean` variable: `isMarried`

- Declare two `long` variables: `workPhoneNumber` ,`personalPhoneNumber`

- Create a `Scanner` object named `scan`


#### Your program flow should go like this:
#### Note: anything indented is an input value from the console

```
Welcome to the patient portal!
Please enter your personal information
Enter your first name
  James
Enter your last name
  May
Enter your email
  jamesmay@gmail.com
Enter your street
  7925 Jones Branch Dr
Enter your city
  McLean
Enter your state
  VA
Enter your zip code
  22102
Enter your work phone number
  7896542314
Enter your personal phone number
  2406542314
Enter your age
  35
Enter your height
  5.10
Enter your weight
  173.2
Are you married?
  true
```

#### Take all the inputs from the above flow and combine these sections together

- Declare and assign a `contact` variable using these inputs: *work phone, personal phone and email*. Use a comma and a space to separate each value

- Declare and assign a `fullName` variable using these inputs: *first name and last name* Use a space to seperate each value

- Declare and assign an `address` variable using these inputs: *street, city, state, zip code* Use a comma and a space to separate each value

#### Display all of the information together as below

#### The final output of your program should be:
  > The first part of the outcome are the questions which are asked from the Scanner portion

```
Welcome to the patient portal!
Please enter your personal information
Enter your first name
Enter your last name
Enter your email
Enter your street
Enter your city
Enter your state
Enter your zip code
Enter your work phone number
Enter your personal phone number
Enter your age
Enter your height
Enter your weight
Are you married?

Patient personal information
Full name: James May
Address: 7925 Jones Branch Dr, McLean, VA 22102
Contact: work phone number: 7896542314, personal phone number: 2406542314, email: jamesmay@gmail.com
Age: 35
Height: 5.1
Weight: 173.2 pounds
Married: true
```

Main topics: variables, primitive datatypes, String, Scanner, concatenation
        * */
    }
}

