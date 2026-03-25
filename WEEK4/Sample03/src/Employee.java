import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Employee extends Person {
    private String employeeID;
    private Department department;
    protected Grade grade;
    protected int extraPay;

    public Employee(String name, Date birthday, String employeeID,
                    Department department, Grade grade) {
        super(name, birthday);
        this.employeeID = employeeID;
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
        int tax;
        if (total < 1700000) {
            tax = (int) (total * (5.0f / 100));
        } else if (total < 2300000) {
            tax = (int) (total * (8.0f / 100));
        } else {
            tax = (int) (total * (10.0f / 100));
        }
        return tax;
    }

    protected int payment() {
        return grade.baseSalary + extraPay - tax();
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
                " %7s %s %3c %,10d원 %,9d원 %,10d원 %,6d원 %,10d원",
                employeeID, department.name, grade.code, grade.baseSalary,
                extraPay, grade.baseSalary + extraPay, tax(), payment()
        );
    }
}