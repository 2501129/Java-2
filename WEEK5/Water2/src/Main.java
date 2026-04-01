import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Customer[] customs = {
                new Home("홍길동", "1365"),
                new Government("이대현", "5678"),
                new Factory("이수무", "3333"),
                new Army("김진치", "4444"),
                new Home("정필모", "5234"),
                new Business("정화현", "5567"),
                new Business("이수한", "3473"),
                new Army("김건도", "4564"),
                new Factory("정확두", "5895"),
                new Home("김이하", "5523")
        };

        WaterOffice water = new WaterOffice(customs);
        water.inputData();
        water.display();
    }
}