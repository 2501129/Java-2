import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler implements Constant{

    public ArrayList<Customer>dataRead(File file){
        ArrayList<Customer> customers = new ArrayList<>();
    try{
        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNextLine()){

            String line = fileScanner.nextLine();
            line = line.trim().replaceAll(",","");
            Scanner lineScanner = new Scanner(line).useDelimiter("");
            String customID = lineScanner.next();
            Customer customer;
            if (customID.charAt(0) == '9'){
                customer = new Special();
            }else
                customer = new Normal();
            customer.setCustomID(customID);
            customer.setName(lineScanner.next());
            customer.setPowerUsage(lineScanner.nextInt());
            customers.add(customer);
            lineScanner.close();
        }
        if (customers.isEmpty()){
            error("데이터가 없습니다.");
        }else
            System.out.printf("%d개의 데이터를 성공적으로 읽었습니다.\n",
                    customers.size());
        fileScanner.close();
    }catch (IOException e){
        error(e.getMessage());
    }
    return customers;
    }
}
