package MainCar;

import java.util.ArrayList;
import java.util.List;

public class CarController {
    private List<Car> ordered_autos = new ArrayList<>();

    public void addAuto(String vin_no, String brand, String model, double price_basic) {
        Car a = new Car(vin_no, brand, model, price_basic);
        ordered_autos.add(a);
        System.out.println("Zamówienie przyjęte!" + a);
    }
    public void getAllAutos() {ordered_autos.forEach(car -> System.out.println(car));

    }
}
