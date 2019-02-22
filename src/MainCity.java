public class MainCity {
    public static void main(String[] args) {
        CityController cc = new CityController();
        cc.insertIntoCity("Grudziądz", 95000., 59.1);
        cc.insertIntoCity("Bydgoszcz", 320000., 100.1);
        cc.insertIntoCity("Toruń", 200000., 70.1);
        cc.selectFromCity();
        cc.selectFromCityById(1);
        cc.selectFromCity();

    }
}
