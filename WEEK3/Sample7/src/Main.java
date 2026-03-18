public class Main {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        SportsCar ferrari = new SportsCar();

        tesla.charge();
        tesla.drive();
        tesla.stop();

        ferrari.drive();
        ferrari.turboBoost();
        ferrari.stop();
    }
}