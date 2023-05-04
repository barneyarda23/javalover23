package day33_constructors2;

public class CarRunner {
    public static void main(String[] args) {

        Car car1 = new Car();// used default constructor

        Car car2 = new Car("honda", "Civic");// used customized const. with two parameters.

        System.out.println(car1.model);//null
        System.out.println(car2.model);//Civic

        Car car3 = new Car("toyota", "corolla" , 2016 ,13000);

        System.out.println(car3.brand +  " " + car3.model + " " + car3.year + " " + car3.price  );

        //to print the entire object we created toString() method in the car  class

        System.out.println(car3);




        }
    }

