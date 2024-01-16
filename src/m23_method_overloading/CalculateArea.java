package m23_method_overloading;

public class CalculateArea {

    public static void main(String[] args) {

        double areaOfCircle = calculateArea(2.5);

        System.out.println("areaOfCircle = " + areaOfCircle);

        double areaOfRectangle = calculateArea(3.5, 4.5);

        System.out.println("areaOfRectangle = " + areaOfRectangle);
    }
    public static double calculateArea(double radius){
        //for calculating area of circle
        return radius * radius * 3.14;
    }

    public static double calculateArea(double length, double width){
        //for calculating the area of rectangle
        return length * width;
    }
}
