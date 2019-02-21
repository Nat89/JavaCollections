package MainCar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {
    private String vin_no;
    private String brand, model;
    private double price_basic;
    private  List<String> eq_name= new ArrayList<>(Arrays.asList("A", "B","c"));
    private  List<Double> eq_price = new ArrayList<>(Arrays.asList(5000.,10000.,12000.));
    private  List<Integer> eq_order = new ArrayList<>(Arrays.asList(0,0,0));
    private  List<List> equipment = new ArrayList<>(Arrays.asList(eq_name,eq_price, eq_order));

    public Car(String vin_no, String brand, String model, double price_basic) {
        this.vin_no = vin_no;
        this.brand = brand;
        this.model = model;
        this.price_basic = price_basic;
    }

    @Override
    public String toString() {
//        System.out.printf("%10s | %10s | %15.2f | %10s", "VIN", "Marka", "Model" , "Cena podstawowa", "Wyposażenie");
        return String.format("%10s | %10s | %10s | %10.2f | %10s", vin_no, brand, model, price_basic, getOrderedEquipmentNames(), calcFullPrice());
    }
        public double calcFullPrice() {
            double price_full = price_basic;
            for (int i = 0; i < eq_order.size(); i++) {
                if (eq_order.get(i) != 0) {
                    price_full += eq_price.get(i);
                }
            }
            return price_full;
        }
// metoda zwracajaca nazwy zamowieniowego wyposazenia dodatkowego

    public String getOrderedEquipmentNames() {
        String equipmentNames = " ";
        for ( int i = 0; i < eq_name.size(); i ++) {
            if(eq_order.get(i) != 0) {
                equipmentNames += (eq_name.get(i) + ",");
            }
        }
        return equipmentNames;
    }
    public String getVin_no() {
        return vin_no;
        }
    }

