public class Main {
    public static void main(String[] args) {
        Navigation navi = new Navigation();
        Car myCar = new Car();

        myCar.driveTo(navi, "서울 태릉역", "경북대학교");
    }
}