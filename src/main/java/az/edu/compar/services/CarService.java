package az.edu.compar.services;

import az.edu.compar.models.Car;

public class CarService {


    public void start(Car car, double km){
        // 100 - 15
        // x - 100
        double checkFuel = km * car.getFuelPerKm() / 100;
        if (car.getFuel() - checkFuel < 0){
            System.out.println("YDM-a gedin.");
        }else{
            car.setMillage(car.getMillage()+km);
            car.setFuel(car.getFuel() - checkFuel);
        }
    }


    public  void gasStation(Car car, double fuel){
        if (car.getFuel()+ fuel > car.getMaxFuel()){
            System.out.println("Bu qeder benzin doldura bilmezseen.");
        }else{
            car.setFuel(car.getFuel()+ fuel);
        }
    }
}
