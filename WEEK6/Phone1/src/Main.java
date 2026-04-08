import java.util.ArrayList;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer("010-3214-6778", "홍길동",
                new Date(2005, 5, 10), new DiscountPlan()));
        customers.add(new Customer("010-1245-5778", "장성범",
                new Date(1996, 6, 12), new BasicPlan()));
        customers.add(new Customer("010-4567-5678", "정복대",
                new Date(2008, 6, 10), new DiscountPlan()));
        customers.add(new Customer("010-9876-5432", "이대환",
                new Date(1942, 3, 15), new BasicPlan()));
        customers.add(new Customer("010-3455-8768", "한민국",
                new Date(2005, 12, 20), new DiscountPlan()));
        customers.add(new Customer("010-7632-9771", "김대성",
                new Date(1996, 6, 12), new BasicPlan()));
        customers.add(new Customer("010-4554-7677", "한동기",
                new Date(2012, 4, 10), new BasicPlan()));
        customers.add(new Customer("010-2311-5672", "박대감",
                new Date(1999, 3, 15), new BasicPlan()));
        customers.add(new Customer("010-4554-7677", "정성길",
                new Date(2006, 6, 10), new DiscountPlan()));
        customers.add(new Customer("010-2311-5672", "우동기",
                new Date(1943, 12, 15), new BasicPlan()));

        PhoneOffice office = new PhoneOffice(customers);
        office.inputData();
        office.display();
    }
}