import java.util.ArrayList;
import java.util.Date;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Customer> customers = new ArrayList<>();

        // 주의: Date의 month는 0부터 시작 (0=1월, 11=12월)
        customers.add(new Customer("010-3214-6778", "홍길동", new Date(2005, 4, 10), new DiscountPlan()));
        customers.add(new Customer("010-1245-5778", "장성빈", new Date(1996, 5, 12), new BasicPlan()));
        customers.add(new Customer("010-4567-5678", "경복대", new Date(2008, 5, 10), new DiscountPlan()));
        customers.add(new Customer("010-9876-5432", "이대한", new Date(1942, 2, 15), new BasicPlan()));
        customers.add(new Customer("010-3455-8768", "한민국", new Date(2005, 11, 20), new DiscountPlan()));
        customers.add(new Customer("010-7632-9771", "김대성", new Date(1996, 5, 12), new BasicPlan()));
        customers.add(new Customer("010-4554-7677", "한동기", new Date(2012, 3, 10), new BasicPlan()));
        customers.add(new Customer("010-2311-5672", "박대감", new Date(1999, 2, 15), new BasicPlan()));
        customers.add(new Customer("010-4554-7677", "정성걸", new Date(2006, 5, 10), new DiscountPlan()));
        customers.add(new Customer("010-2311-5672", "우동기", new Date(1943, 11, 15), new BasicPlan()));

        PhoneOffice office = new PhoneOffice(customers);
        office.inputData();
        office.display();
    }
}