package day03_variables;

public class Rectangle2 {

    public static void main(String[] args) {

        double length = 3.5;
        double width = 4.0;

        double area = length + width;
        double perimeter = 2 * (length + width);

        System.out.println("length = " + length);
        System.out.println("width = " + width);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


    }
}


/*
 write a program that can calculate the area & perimeter of any given Rectangle
						length
						width
						area = length * width
						perimeter =  2 * (length + width)
 */