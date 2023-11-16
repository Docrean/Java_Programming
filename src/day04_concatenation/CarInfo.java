package day04_concatenation;

public class CarInfo {

    public static void main(String[] args) {

        String make = "Toyota",
                model = "Camry",
                color = "Red";

        long year = 2018,
                miles = 50000,
                Price = 19000;

        System.out.println(year + " " + make + " " + model
                    + ", " + miles + " miles, " + color + ", $" + Price+ ".");

    }
}
/*
Car information is :
        2018 Toyota Camry, 50000 miles, Red, $19000.
1. Create a class named CarInfo.java
2. Declare the following variables:
        1. year
        2. make
        3. model
        4. miles
        5. color
        6. Price
3. Use concatenation to print the full info of the car in the
following format:
Year Make Model, Miles, Color, Price.
        Ex:
 */