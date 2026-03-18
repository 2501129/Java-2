public class Car {
    public void driveTo(Navigation navigation, String start, String destination) {
        navigation.findRoute(start, destination);
        System.out.println(start + "에서 " + destination + "으로 운전을 시작합니다.");
    }
}