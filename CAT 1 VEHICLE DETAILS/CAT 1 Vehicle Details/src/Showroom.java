
//REAGAN TZISAGA CT100/G/22492/24.

import java.util.Scanner;

class Vehicle{

    String brand;
    String model;
    int year;

    Vehicle(String brand, String model, int year) {
        this.brand=brand;
        this.model=model;
        this.year=year;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);

    } 

}

class Car extends Vehicle{
    String fuelType;
    Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);
        this.fuelType=fuelType;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class Showroom{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the brand of the car:");
        String brand = sc.nextLine();
        System.out.println("Enter the model of the car:");
        String model = sc.nextLine();
        System.out.println("Enter the year of the car:");
        int year = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.println("Enter the fuel type of the car:");
        String fuelType = sc.nextLine();

        Car myCar = new Car(brand, model, year, fuelType);
        System.out.println("\nCar Details:");
        myCar.displayDetails();
        
        sc.close();
    }
}
