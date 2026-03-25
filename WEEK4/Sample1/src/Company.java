import java.util.Arrays;
import java.util.Comparator;

public class Company {
    private Employee[] emps;

    public Company(Employee[] emps) {
        this.emps = emps;
    }

    public void sortByNetPayDesc() {
        Arrays.sort(emps, Comparator.comparingInt(Employee::getNetPay).reversed());
    }

    public void printResult() {
        int sumBase = 0, sumExtra = 0, sumTax = 0, sumNet = 0;

        for (Employee e : emps) {
            sumBase += e.getBaseSalary();
            sumExtra += e.getExtraPay();
            sumTax += e.getTax();
            sumNet += e.getNetPay();
        }

        System.out.println("================================================================================================");
        System.out.printf("%-18s %-8s %-8s %-6s %-10s %-10s %-10s %-10s%n",
                "이름(생일)", "사번", "부서", "호봉", "본봉", "수당", "세금", "실지급");
        System.out.println("================================================================================================");

        for (Employee e : emps) {
            System.out.printf("%-18s %-8s %-8s %-6s %,10d %,10d %,10d %,10d%n",
                    e.getName() + "(" + e.getBirth() + ")",
                    e.getEmpId(),
                    e.getDeptNamePublic(),
                    e.getGrade(),
                    e.getBaseSalary(),
                    e.getExtraPay(),
                    e.getTax(),
                    e.getNetPay());
        }

        System.out.println("================================================================================================");
        System.out.printf("%45s %,10d %,10d %,10d %,10d%n",
                "합계", sumBase, sumExtra, sumTax, sumNet);
    }
}