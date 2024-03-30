package az.edu.compar;

import az.edu.compar.models.Car;
import az.edu.compar.services.CarService;

import java.util.Scanner;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Start => Write Km
        // Gas station =>
        // Report =>

        Scanner scanner = new Scanner(System.in);
        CarService carService  = new CarService();
        Car car = new Car();
        car.setId(1);
        car.setModel("Patrol");
        car.setBrand("Nissan");
        car.setMillage(120);
        car.setFuel(100);
        car.setMaxFuel(100);
        car.setFuelPerKm(15);

        int userInput = 0;

        while (userInput != 4){

            System.out.println("1. Start");
            System.out.println("2. Gas station");
            System.out.println("3. Report");
            System.out.println("4. Exit");

            userInput = scanner.nextInt();

            switch (userInput){
                case 1:
                    System.out.println("Yolu daxil edin");
                    double userKm = scanner.nextDouble();
                    carService.start(car, userKm);
                    break;
                case 2:
                    // Gas station
                    System.out.println("Benzin doldurun.");
                    double userFuel = scanner.nextDouble();
                    carService.gasStation(car, userFuel);
                    break;
                case 3:
                    // Report
                    System.out.println("Statistika.");
                    System.out.println("Millage: " + car.getMillage());
                    System.out.println("Fuel: " + car.getFuel());
                    break;
                default:
                    //
                    break;
            }
        }






    }
}