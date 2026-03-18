public class SportsCar {
    private String model;

    public SportsCar() {
        this.model = "스포츠 카";
    }

    public void drive() {
        System.out.println(model + "가 달립니다.");
    }

    public void stop() {
        System.out.println(model + "가 멈춥니다.");
    }

    public void turboBoost() {
        System.out.println(model + "가 터보 부스트를 사용합니다.");
    }
}