package MainCar;

import java.io.IOException;

public class MainCar {
    public static void main(String[] args) throws IOException {
        CarController ac = new CarController();
        ac.addAuto(
                "2424234523523",
                "VW",
                "Passat",
                15000);
        ac.addAuto(
                "TR22424242",
                "VW",
                "Golf",
                80000);
        ac.addAuto(
                "535352353",
                "VW",
                "Tiguan",
                12000);

        ac.addEquipment("535352353","A");
        ac.addEquipment("535352353","B");
        ac.getAllAutos();
        ac.deleteEquipment("535352353","A");
        ac.getAllAutos();
        ac.saveDataToFile("MyFile.txt");

    }
}
