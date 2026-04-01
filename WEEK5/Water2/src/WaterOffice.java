import java.io.IOException;

// ✅ 注意：这里不要写 extends Customer！
public class WaterOffice {
    private Customer[] customs;

    // 构造器：只需要传入 Customer 数组
    public WaterOffice(Customer[] customs) {
        this.customs = customs;
    }

    // 批量输入所有用户的用水量
    public void inputData() throws IOException {
        for (Customer c : customs) {
            c.inputData(null);
        }
    }

    // 批量显示所有用户的账单
    public void display() {
        System.out.println("\n=== 수도 요금 청구 내역 ===");
        System.out.println("수도번호  이름    유형     사용량     사용요금   세금     총청구금액");
        for (Customer c : customs) {
            System.out.println(c);
        }
    }
}