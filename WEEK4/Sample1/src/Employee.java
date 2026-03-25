public class Employee {
    private String name;
    private String empId;
    private Date birth;
    private char dept;
    private char grade;
    private int extraPay;

    public Employee(String name, String empId, Date birth, char dept, char grade) {
        this.name = name;
        this.empId = empId;
        this.birth = birth;
        this.dept = dept;
        this.grade = grade;
    }

    public void setExtraPay(int extraPay) {
        this.extraPay = extraPay;
    }

    private String getDeptName() {
        return switch (dept) {
            case '1' -> "인사부";
            case '2' -> "영업부";
            case '3' -> "생산부";
            case '4' -> "개발부";
            case '5' -> "기획부";
            default -> "";
        };
    }

    public int getBaseSalary() {
        return switch (grade) {
            case '1' -> 1650000;
            case '2' -> 1680000;
            case '3' -> 1700000;
            case '4' -> 1720000;
            case '5' -> 1750000;
            default -> 0;
        };
    }

    public int getTotalPay() {
        return getBaseSalary() + extraPay;
    }

    public int getTax() {
        int tax = (int) (getTotalPay() * 0.1);
        return tax / 100 * 100;  // 100원 미만 버림
    }

    public int getNetPay() {
        return getTotalPay() - getTax();
    }

    public String getName() { return name; }
    public String getEmpId() { return empId; }
    public Date getBirth() { return birth; }
    public String getDeptNamePublic() { return getDeptName(); }
    public char getGrade() { return grade; }
    public int getExtraPay() { return extraPay; }
}