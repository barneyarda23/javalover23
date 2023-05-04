package day33_constructors2;

public class Car {

    String brand;
    String model;
    int year;
    int price;

    public Car(){};// Default const.

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;


    }

    public Car(String brand, String model, int year, int price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    @Override // to be able to print the entire object we created toString()
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
