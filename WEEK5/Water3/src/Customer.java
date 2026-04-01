import java.io.IOException;
import java.util.Scanner;

public class Customer {
    private String name;
    private String waterNo;
    private Type type;
    protected float usage;
    private final int BASIC;

    public Customer(String name, String waterNo, Type type) {
        this.name = name;
        this.waterNo = waterNo;
        this.type = type;
        this.usage = 0.0f;
        this.BASIC = 1200;
    }

   
    protected void inputData() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("[%s] %s님의 수도 사용량 입력 : ", type.getTypeName(), name);
            usage = keyboard.nextFloat();

            if (usage >= 0.0f && usage <= 999.9f) {
                break;
            } else {
                System.err.println("Error : 수도 사용량은 0 ~ 999.9까지 임");
                keyboard.nextLine();
            }
        }
    }

  
    protected int fee() {
        int use = (int) (usage + 0.5f);
        return BASIC + (use * type.getUnitPrice());
    }

 
    protected int tax() {
        int tax = (int) (fee() * (type.getTaxRate() / 100));
        return (tax / 10) * 10;
    }

    
    protected int charge() {
        return fee() + tax();
    }

  
    @Override
    public String toString() {
        return String.format("%6s %-5s %4s %,8.2f\u33A5 %,7d원 %,6d원 %,7d원 %s",
                waterNo, name, type.getTypeName(), usage, fee(), tax(), charge(),
                (type.getTypeName().equals("군기관") ? "일괄징수" : ""));
    }
}
