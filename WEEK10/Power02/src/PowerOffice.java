import java.util.ArrayList;
public class PowerOffice {
    private ArrayList<Customer>customers;

    public PowerOffice(ArrayList<Customer>customers){
        this.customers = customers;
    }
    protected void soreByPay(){
        Customer temp;
        for (int i = 0; i < customers.size() - 1; i++)
            for (int j = i + 1;j < customers.size();j++)
                if(customers.get(j).pay() > customers.get(i).pay()){
                    temp = customers.get(j);
                    customers.set(j,customers.get(i));
                    customers.set(i,temp);
                }
    }
}
