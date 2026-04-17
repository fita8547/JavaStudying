package overriding;

import extends1.ElectricCar;
import extends1.GasCar;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        GasCar gasCar = new GasCar();
        gasCar.move();
    }
}
