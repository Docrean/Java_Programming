package m25_class_and_object;

public class CarClient {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "Corolla";
        car1.year = 2023;
        car1.color = "Black";
        car1.price = 30_000;

        System.out.println("Make: " + car1.make);
        System.out.println("Model: " + car1.model);
        System.out.println("year: " + car1.year);
        System.out.println("color: " + car1.color);
        System.out.println("price: " + car1.price);
        car1.start();
        car1.drive();
        car1.stop();
        car1.showCurrentSpeed(65, 70);

        System.out.println(car1); //whenever passing OBJECT into the print statement it's going to look
                                    // for the toString
    }



}


      /*
      Create a car object and assign the below values to the instance variables and call the below methods:

      Make: Toyota
      Model: Corolla
      year: 2023
      color: Black
      price: $30_000

      start()
      drive()
      stop()
      showCurrentSpeed(65, 70)
       */