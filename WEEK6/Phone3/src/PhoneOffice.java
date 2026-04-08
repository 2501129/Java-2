import java.util.ArrayList;
import java.io.IOException;

public class PhoneOffice {
    ArrayList<Customer> customers;

    // 构造方法保持public
    public PhoneOffice(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    // 必须是 protected，和PPT一致，匹配Customer的protected方法
    protected void inputData() throws IOException {
        for (int i = 0; i < customers.size(); i++) {
            customers.get(i).inputUsageTime();
            customers.get(i).inputMessage();
        }
    }

    // 必须是 protected，和PPT一致
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

    // 冒泡排序，私有方法
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

    // 打印分隔线，私有方法
    private void line() {
        for (int i = 0; i < 102; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}