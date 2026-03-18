public class ElectricCar {
    private String model;

    public ElectricCar() {
        this.model = "전기 자동차";
    }

    public void drive() {
        System.out.println(model + "가 달립니다.");
    }

    public void stop() {
        System.out.println(model + "가 멈춥니다.");
    }

    public void charge() {
        System.out.println(model + "가 충전 중입니다.");
    }
}