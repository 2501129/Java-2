import java.io.IOException;

public class WaterOffice {

    private Customer[] customers;

  
    public WaterOffice(Customer[] customers) {
        this.customers = customers;
    }

   
    public void inputData() throws IOException {
        for (int i = 0; i < customers.length; i++) {
            customers[i].inputData();
        }
    }

   
    public void display() {
        System.out.println("==============================================");
        System.out.println("수도번호   이름     유형      사용량   사용요금   세액   총청구금액");
        System.out.println("==============================================");

        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i]);
        }
    }
}
