import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee[] emps = new Employee[] {
                new Employee("홍길동", "1112", new Date(2001, 3, 20), '1', '1'),
                new Employee("이나라", "1345", new Date(1995, 5, 10), '3', '2'),
                new Employee("나정산", "1362", new Date(2002, 8, 30), '4', '3'),
                new Employee("박정환", "1422", new Date(1996, 6, 18), '4', '4'),
                new Employee("김대한", "3456", new Date(2003, 12, 4), '2', '5'),
                new Employee("이민국", "5634", new Date(1993, 6, 17), '3', '1'),
                new Employee("황정민", "1456", new Date(1996, 9, 20), '5', '4'),
                new Employee("길대연", "1345", new Date(1997, 4, 24), '5', '5'),
                new Employee("박대국", "1789", new Date(2000, 1, 7), '4', '2'),
                new Employee("하충민", "4521", new Date(1994, 3, 16), '1', '1')
        };

        for (Employee e : emps) {
            System.out.print(e.getName() + " 수당: ");
            e.setExtraPay(sc.nextInt());
        }

        Company com = new Company(emps);
        com.sortByNetPayDesc();
        com.printResult();
    }
}