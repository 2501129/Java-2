import java.util.ArrayList;
import java.io.IOException;

public class PhoneOffice {
    ArrayList<Customer> customers;


    public PhoneOffice(ArrayList<Customer> customers) {
        this.customers = customers;
    }


    protected void inputData() throws IOException {
        for (int i = 0; i < customers.size(); i++) {
            customers.get(i).inputUsageTime();
            customers.get(i).inputMessage();
        }
    }


    protected void display() {
        sortByName();
        line();
        System.out.println("이름(생일)    나이    전화번호        통화시간    문자건수    요금제    사용요금    세금    납부금액");
        line();
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
        line();
    }


    private void sortByName() {
        for (int i = 0; i < customers.size() - 1; i++) {
            for (int j = 0; j < customers.size() - 1 - i; j++) {
                if (customers.get(j).getName().compareTo(customers.get(j + 1).getName()) > 0) {
                    Customer temp = customers.get(j);
                    customers.set(j, customers.get(j + 1));
                    customers.set(j + 1, temp);
                }
            }
        }
    }


    private void line() {
        for (int i = 0; i < 102; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}