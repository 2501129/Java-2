import java.util.Scanner;
import java.io.IOException;

public class Customer extends Person {
    private String phoneNo;
    private int usageTime;
    private int message;
    private Plan plan;


    public Customer(String phoneNo, String name, Date birthDay, Plan plan) {
        super(name, birthDay);
        this.phoneNo = phoneNo;
        this.usageTime = 0;
        this.message = 0;
        this.plan = plan;

        if (birthDay.getAge() >= 80) {
            this.plan = new DiscountPlan();
        }
    }

    public int getUsageTime() { return usageTime; }
    public int getMessage() { return message; }


    protected void inputMessage() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("%s님 문자 메시지 사용 건수 : ", getName());
            message = keyboard.nextInt();
            if (message >= 0) break;
            else {
                System.err.print("ERROR : 문자 메시지 건수 오류");
                System.in.read();
            }
        }
    }


    protected void inputUsageTime() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("%s님 통화 시간 입력 : ", getName());
            usageTime = keyboard.nextInt();
            if (usageTime >= 0) break;
            else {
                System.err.print("ERROR : 통화 시간 오류");
                System.in.read();
            }
        }
    }

    private int fee() {
        if (plan instanceof BasicPlan) {
            return ((BasicPlan) plan).calculateFee(this);
        } else {
            return ((DiscountPlan) plan).calculateFee(this);
        }
    }

    private int tax() {
        if (plan instanceof BasicPlan) {
            return ((BasicPlan) plan).tax(this);
        } else {
            return ((DiscountPlan) plan).tax(this);
        }
    }

    protected int charge() {
        return fee() + tax();
    }

    @Override
    public String toString() {
        return String.format("%s %13s %6d 초 %5d 건 %s %9d원 %6d원 %9d원",
                super.toString(), phoneNo, usageTime, message,
                plan.getPlanName(), fee(), tax(), charge());
    }
}