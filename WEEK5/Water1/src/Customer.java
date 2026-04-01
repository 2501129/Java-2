import java.io.IOException;
import java.util.Scanner;

public class Customer {
    private String name;
    private String waterNO;
    private char type;
    protected float usage;
    protected final int BASIC;

    public Customer(String name, String waterNO, char type) {
        this.name = name;
        this.waterNO = waterNO;
        this.type = type;
        this.usage = 0.0f;
        this.BASIC = 1200;
    }

    protected void inputData() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("[%s] %s님의 수도 사용량 입력 : ", type(), name);
            usage = keyboard.nextFloat();

            if (usage >= 0.0f && usage <= 999.9f) {
                break;
            } else {
                System.err.println("오류 : 수도 사용량은 0 ~ 999.9 까지 입력 가능합니다.");
                keyboard.nextLine();
            }
        }
    }

    private String type() {
        switch (type) {
            case '1': return "가정용";
            case '2': return "영업용";
            case '3': return "공장용";
            case '4': return "관공서";
            case '5': return "군기관";
            default: return "기타";
        }
    }

    protected int fee() {
        int fee = BASIC;
        int use = (int) (usage + 0.5f);

        switch (type) {
            case '1': fee += use * 40; break;
            case '2': fee += use * 55; break;
            case '3': fee += use * 78; break;
            case '4': fee += use * 35; break;
            case '5': fee += use * 20; break;
        }
        return fee;
    }

    protected int tax() {
        int tax = 0;
        switch (type) {
            case '1': tax = (int) (fee() * 5.0f / 100); break;
            case '2': tax = (int) (fee() * 3.5f / 100); break;
            case '3': tax = (int) (fee() * 2.5f / 100); break;
            case '4': tax = (int) (fee() * 1.5f / 100); break;
            case '5': tax = 0; break;
        }
        return (tax / 10) * 10;
    }

    protected int charge() {
        return fee() + tax();
    }

    @Override
    public String toString() {
        return String.format("%6s %-5s %4s %8.2f %7d원 %6d원 %7d원 %s",
                waterNO,
                name,
                type(),
                usage,
                fee(),
                tax(),
                charge(),
                (type == '5' ? "일괄징수" : ""));
    }
}