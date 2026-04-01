import java.io.IOException;
import java.util.Scanner;

public class WaterOffice {
    private Customer[] customers;

    // 생성자: PPT Main에서 정확히 이렇게 호출함
    public WaterOffice(Customer[] customers) {
        this.customers = customers;
    }

    // ✅ inputData: Scanner를 한 번만 생성해서 전달
    public void inputData() throws IOException {
        Scanner scanner = new Scanner(System.in);
        for (Customer c : customers) {
            c.inputData(scanner); // 이제 Customer에 이 메서드가 있으므로 100% 통과
        }
        scanner.close();
    }

    // ✅ display: PPT와 완전 일치
    public void display() {
        System.out.println("\n=== 수도 요금 청구 내역 ===");
        System.out.println("수도번호\t이름\t유형\t사용량\t사용요금\t세금\t총청구금액");
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}