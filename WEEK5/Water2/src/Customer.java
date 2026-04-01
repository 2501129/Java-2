import java.io.IOException;
import java.util.Scanner;

public class Customer extends Person {
    private String waterNo;
    protected Type type;
    protected float usage;
    protected final int BASIC;

    // 생성자
    public Customer(String name, String waterNo) {
        super(name);
        this.waterNo = waterNo;
        this.usage = 0.0f;
        this.BASIC = 1200;
    }

    protected void inputData(String type) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("[%s] %s님의 수도 사용량 입력 : ", type, super.getName());
            usage = keyboard.nextFloat();

            if (usage >= 0.0f && usage <= 999.9f) {
                break;
            } else {
                System.err.print("Error : 수도 사용량은 0 ~ 999.9까지 임");
                keyboard.nextLine();
            }
        }
    }

    protected int fee() {
        int use = (int) (usage + 0.5f);
        int fee = BASIC + (use * type.unitPrice);
        return fee;
    }

    protected int tax() {
        int tax = (int) (fee() * (type.taxRate / 100));
        tax = (tax / 10) * 10;
        return tax;
    }

    protected int charge() {
        return fee() + tax();
    }

    @Override
    public String toString() {
        return String.format("%6s %s %3s %,8.2f\u33A5 %,7d원 %,6d원 %,7d원",
                waterNo, super.toString(), type.typeName, usage, fee(), tax(), charge());
    }
}