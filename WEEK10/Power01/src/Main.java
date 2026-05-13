import java.io.File;
import java.util.ArrayList;

public static void main(String[] args){
    System.out.println("START TEST");
}

public class Main implements Constant{
    public static void main(String[] args){
        ArrayList<Customer> customers;

        File file = new File(path + fileName);
        if(file.exists()){
            FileHandler handler = new FileHandler();
            customers = handler.dataRead(file);
            PowerOffice office = new PowerOffice(customers);
            office.soreByPay();
            OutputHandler outputHandler = new OutputHandler();
            outputHandler.display(customers);
        }else {
            System.out.printf("Data File %s가 준비되지 않았습니다.",path + fileName);
        }
    }
}