import java.util.Scanner;
import java.io.IOException;
import java.util.Date;

public class Customer extends Person {
    private String phoneNo;
    private int usageTime; // 초 단위
    private int message;
    private Plan plan;

    public Customer(String phoneNo, String name, Date birthday, Plan plan) {
        super(name, birthday);
        this.phoneNo = phoneNo;
        this.usageTime = 0;
        this.message = 0;
        this.plan = plan;
        // 80세 이상 자동으로 할인 요금제 적용
        if (plan.isOld(this)) {
            this.plan = new DiscountPlan();
        }
    }

    // Getter
    public int getUsageTime() {
        return usageTime;
    }

    public int getMessage() {
        return message;
    }

    public Plan getPlan() {
        return plan;
    }

    // 입력 메서드
    protected void inputUsageTime() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("%s님 통화 시간 입력: ", getName());
            usageTime = keyboard.nextInt();
            if (usageTime >= 0) {
                break;
            } else {
                System.err.print("ERROR: 통화 시간 오류");
                System.in.read();
            }
        }
    }

    protected void inputMessage() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("%s님 문자 메시지 사용 건수 입력: ", getName());
            message = keyboard.nextInt();
            if (message >= 0) {
                break;
            } else {
                System.err.print("ERROR: 문자 건수 오류");
                System.in.read();
            }
        }
    }

    // 요금 계산 메서드
    private int fee() {
        if (plan.isOld(this)) {
            plan = new DiscountPlan();
        }
        return plan.calculateFee(this);
    }

    protected int charge() {
        return fee() + plan.tax(this);
    }

    @Override
    public String toString() {
        return String.format("%s %13s %6d 초 %5d 건 %10s %9d원 %6d원 %9d원",
                super.toString(), phoneNo, usageTime, message,
                plan.getPlanName(), fee(), plan.tax(this), charge());
    }
}