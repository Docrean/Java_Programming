package m39_static_keyword;

public class CircleClients {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5); //separate copy of Circle.java radius instance
                                              //static PI same for both objects
        Circle circle2 = new Circle(7); //separate copy of Circle.java radius instance
                                              //static PI same for both objects
        System.out.println(circle1);
        System.out.println(circle2);

        System.out.println(Circle.PI); //to call the static PI has to be through the class name
        System.out.println(circle1.PI); //gives warning if called through object

        //since static and if not final, if set to different data within one object,
        //the other object would still have same data of PI

        //below example is Circle.java public static double PI without the final keyword

        //call PI from the first circle object and assign 5.4
        //meaning if PI value called from circle1 prints it should print 5.4 because its
        //reassigned to 5.4 due to TAKING OUT OUT THE FINAL KEYWORD.
        //If final keyword still given then COMPILER ERROR GIVEN IF TRIED TO RE-ASSIGN

       // circle1.PI = 5.4;

      //  System.out.println(circle1.PI); //prints 5.4
     //   System.out.println(circle2.PI); //will it give 3.14 or 5.4? Since 5.4 is now re-assigned to circle1.
                                        //So what is the value or pie called from circle2 now? Still 5.4.....
                                        //Reason: Since PI is declared as static, means THERE IS ONLY ONE COPY SHARED BY
                                        //CIRCLE ONE AND CIRCLE TWO. REGARDLESS IF CALLING FROM CIRCLE ONE OR CIRCLE TWO,
                                        //THEY ARE STILL POINTING TO THE SAME VALUE, THE SAME COPY OF PIE. IF CHANGES ARE
                                        //ARE MADE TO THE PI, REGARDLESS OF WHICH OBJECT CALLING FROM, ALL OBJECTS OF THE
                                        //CIRCLE CLASS WILL SHARE THE SAME COPY OF PI....AS LONG AS THE CHANGE IS MADE,
                                        //THAN ALL OBJECTS WILL SEE THE EFFECT...REGARDLESS OF WHERE IT IS CHANGED.
                                        //SO IF THE VALUE IS CHANGED AT LINE 25...ALL CIRCLE OBJECTS AFTER LINE 25 WILL
                                        //HAVE THE NEW VALUE OF 5.4...BECAUSE STATIC MEANS ALL THE OBJECTS WILL HAVE THE
                                        //SAME VALUE OF THAT VARIABLE SINCE ONLY ONE COPY.


        //IF ONE COPY OF THE SPECIFIC VARIABLE OR METHOD IS NEEDED, THAN VARIABLE OR METHOD NEEDS TO BE MADE STATIC.
        //IF MULTIPLE COPIES ARE NEEDED FOR THE VARIABLES AND METHODS FOR MULTIPLE OBJECTS, THEN VARIABLES OR METHODS
        //NEEDS TO BE MADE AS INSTANCES.


    }
}
