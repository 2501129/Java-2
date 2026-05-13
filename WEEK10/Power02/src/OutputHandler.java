import java.util.List;
public class OutputHandler {

    protected void display (List<Customer>customers) {
        System.out.println("\\t\\t\\t 전 기 요 금");
        line(70);
        System.out.println("번호 이름 사용량 사용요금 세금 납부금액 비고");
        line(70);
        for (int i = 0;i < customers.size(); i++){
            if (i% 5 == 0 && i != 0)
                System.out.println();
            System.out.println(customers.get(i));
        }
        line(70);
    }
    private void line (int count){
        for (int i = 0;i < count;i++)
            System.out.printf("*");
        System.out.println();
    }
}
