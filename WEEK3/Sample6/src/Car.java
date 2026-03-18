public class Car {
    private Engine engine; // Car has an Engine

    public Car() {
        this.engine = new Engine();
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving...");
    }

    public void stop() {
        engine.stop();
        System.out.println("Car has stopped.");
    }
}