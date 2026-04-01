import java.io.IOException;
import java.util.Scanner;

public class Customer {
    private String name;
    private String waterNo;
    private Type type; // Has-a 관계: 고객이 타입을 가짐
    protected float usage;
    private final int BASIC = 1200;

    // 생성자: (이름, 수도번호, 타입) → PPT Main에서 정확히 이렇게 호출함
    public Customer(String name, String waterNo, Type type) {
        this.name = name;
        this.waterNo = waterNo;
        this.type = type;
        this.usage = 0.0f;
    }

    // ✅ inputData: Scanner를 매개변수로 받아서 WaterOffice와 호환
    public void inputData(Scanner scanner) throws IOException {
        while (true) {
            System.out.printf("[%s] %s님의 수도 사용량을 입력하세요: ",
                    type.getTypeName(), name);
            usage = scanner.nextFloat();

            if (usage >= 0.0f && usage <= 999.9f) {
                break;
            } else {
                System.err.println("Error: 사용량은 0~999.9 사이로 입력해주세요!");
            }
        }
    }

    // 요금 계산
    public int fee() {
        int use = (int) (usage + 0.5f); // 반올림
        return BASIC + (use * type.getUnitPrice());
    }

    // 세금 계산
    public int tax() {
        int tax = (int) (fee() * (type.getTaxRate() / 100));
        return (tax / 10) * 10; // 10원 단위 절삭
    }

    // 총 청구금액
    public int charge() {
        return fee() + tax();
    }

    // 출력 (PPT와 완전 일치)
    @Override
    public String toString() {
        return String.format("%6s %-6s %4s %,8.2f\u33A5 %,7d원 %,6d원 %,7d원 %s",
                waterNo, name, type.getTypeName(), usage, fee(), tax(), charge(),
                (type.getTypeName().equals("군기관") ? "일괄징수" : ""));
    }
}