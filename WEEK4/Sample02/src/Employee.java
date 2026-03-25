import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Employee {
    private String name;
    private String employeeID;
    private Date birthday;
    private Department department;
    protected Grade grade;
    protected int extraPay;

    public Employee(String name, String employeeID, Date birthday, Department department, Grade grade) {
        this.name = name;
        this.employeeID = employeeID;
        this.birthday = birthday;
        this.department = department;
        this.grade = grade;
    }

    protected void inputData() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("%s님의 수당 입력 : ", name);
            extraPay = keyboard.nextInt();
            if (extraPay >= 0 && extraPay <= 1000000) {
                break;
            } else {
                System.err.println("입력 오류");
                System.in.read();
            }
        }
    }

    private int tax() {
        int total = grade.baseSalary + extraPay;
        int tax = 0;
        if (total < 1700000) {
            tax = (int) (total * 5 / 100.0);
        } else if (total < 2300000) {
            tax = (int) (total * 8 / 100.0);
        } else {
            tax = (int) (total * 10 / 100.0);
        }
        return tax;
    }

    protected int payment() {
        return grade.baseSalary + extraPay - tax();
    }

    @Override
    public String toString() {
        return String.format("%s%s %4s %s %2c %,10d원 %,8d원 %,10d원 %,7d원 %,10d원",
                name,
                birthday,
                employeeID,
                department.name,
                grade.code,
                grade.baseSalary,
                extraPay,
                grade.baseSalary + extraPay,
                tax(),
                payment()
        );
    }
}