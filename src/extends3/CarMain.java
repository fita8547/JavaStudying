package extends3;

import extends1.ElectricCar;
import extends1.GasCar;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();
        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillipUp();
        gasCar.openDoor();
        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();

    }
}
