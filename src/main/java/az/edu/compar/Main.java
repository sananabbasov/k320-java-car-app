package az.edu.compar;

import az.edu.compar.models.Car;

import java.util.Scanner;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Start => Write Km
        // Gas station =>
        // Report =>

        Scanner scanner = new Scanner(System.in);
        Car car = new Car();
        car.setId(1);
        car.setModel("Patrol");
        car.setBrand("Nissan");
        car.setMillage(120);
        car.setFuel(100);
        car.setMaxFuel(100);
        car.setFuelPerKm(15);

        System.out.println("1. Start");
        System.out.println("2. Gas station");
        System.out.println("3. Report");
        System.out.println("4. Exit");

        int userInput = scanner.nextInt();

        while (userInput != 4){

            System.out.println("1. Start");
            System.out.println("2. Gas station");
            System.out.println("3. Report");
            System.out.println("4. Exit");

            userInput = scanner.nextInt();

            switch (userInput){
                case 1:
                    // Start
                    System.out.println("Herekete basladiq.");
                    break;
                case 2:
                    // Gas station
                    System.out.println("Benzin doldurulur.");
                    break;
                case 3:
                    // Report
                    System.out.println("Statistika.");
                    break;
                default:
                    //
                    break;
            }
        }






    }
}