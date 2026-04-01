import jdk.jshell.spi.ExecutionControl;

import java.io.IOException;

public class WaterOffice {
    private Customer[] customer;

    public WaterOffice(Customer[] customer) {
        this.customer = customer;
    }

    protected void inputData() throws IOException {
        for (int i = 0; i < customer.length; i++)
            customer[i].inputData();
    }
    private float usedTotal() {
        float use = 0.0f;
        for (int i = 0; i < customer.length; i++) {
            use += customer[i].usage;
        }
        return use;
    }
    private int taxTotal(){
        int tax = 0;
        for (int i = 0; i < customer.length; i++) {
            tax +=customer[i].tax();
        }
        return tax;
    }
    private int feeTotal() {
        int fee = 0;
        for (int i = 0; i < customer.length; i++)
            fee += customer[i].fee();
    return fee;
    }
    private int chargeTotal(){
        int charge = 0;
        for (int i = 0; i < customer.length; i++)
            charge += customer[i].charge();
        return charge;
    }
    protected void sortByCharge(){
        Customer temp;
        for (int i = 0; i <= customer.length; ++i) {
            for (int j = i + 1; j < customer.length; ++j){
                if (customer[i].charge() < customer[j].charge()) {
                    temp = customer[i];
                    customer[i] = customer[j];
                    customer[j] = temp;
                }
            }
        }
    }
    private String total() {
        return String.format("\t 사용량 합계 : %,9.2f\u33A5\n\t 요금 합계 : %,9d 원" +
                "\n\t 세금합계: %,9d 원\n\t 수납합계: %,9d 원",
                usedTotal(), feeTotal(), taxTotal(), chargeTotal());
    }
    protected void display(){
        sortByCharge();
        System.out.println("\n\t\t\t\t\t\t 수 도 요 금");
        line();
        System.out.println("  번호 이름 구분 사용양 사용금액 TAX    납부액 비고");
        line();
        for (int i = 0; i < customer.length; i++) {
            System.out.println (customer[i]);
        }
        line();
        System.out.println(total());
        line();
    }
    private void line(){
        for (int i = 0; i < 68; i++)
            System.out.print("-");
        System.out.println();
    }
}
