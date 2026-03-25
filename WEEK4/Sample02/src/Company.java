public class Company {
    private Employee[] employees;

    // 构造器：接收 Employee[]
    public Company(Employee[] employees) {
        this.employees = employees;
    }

    // 下面的方法都保持和PPT一致：
    protected void inputData() throws Exception {
        for (int i = 0; i < employees.length; i++) {
            employees[i].inputData();
        }
    }

    private int sudangTotal() {
        int temp = 0;
        for (int i = 0; i < employees.length; i++) {
            temp += employees[i].extraPay;
        }
        return temp;
    }

    private int salaryTotal() {
        int temp = 0;
        for (int i = 0; i < employees.length; i++) {
            temp += employees[i].grade.baseSalary;
        }
        return temp;
    }

    private int paymentTotal() {
        int temp = 0;
        for (int i = 0; i < employees.length; i++) {
            temp += employees[i].payment();
        }
        return temp;
    }

    protected void sortByPay() {
        Employee temp;
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].payment() < employees[j].payment()) {
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
    }

    private void line() {
        for (int i = 0; i < 94; ++i) {
            System.out.print("*");
        }
        System.out.println();
    }

    protected void display() {
        sortByPay();
        line();
        System.out.println("이름(생일)    사번  부서  호봉   본봉      수당    급여    세금    지급액");
        line();
        for (int i = 0; i < employees.length; i++) {
            if (i != 0 && i % 5 == 0) {
                System.out.println();
            }
            System.out.println(employees[i]);
        }
        line();
        System.out.printf(" %,46d %,8d %,33d%n", salaryTotal(), sudangTotal(), paymentTotal());
        line();
    }
}