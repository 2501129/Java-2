import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. 부서 초기화
        Department[] departments = new Department[]{
                new Department("1", "인사부"),
                new Department("2", "영업부"),
                new Department("3", "생산부"),
                new Department("4", "개발부"),
                new Department("5", "기획부")
        };

        // 2. 호봉 초기화
        Grade[] grades = new Grade[]{
                new Grade('1', 1650000),
                new Grade('2', 1680000),
                new Grade('3', 1700000),
                new Grade('4', 1720000),
                new Grade('5', 1750000)
        };

        // 3. 직원 초기화
        Employee[] employees = new Employee[]{
                new Employee("홍길동", new Date(2001, 3, 20), "1112", departments[0], grades[0]),
                new Employee("이나라", new Date(1995, 5, 10), "1345", departments[2], grades[1]),
                new Employee("나정산", new Date(2002, 8, 30), "1362", departments[3], grades[2]),
                new Employee("박정환", new Date(1996, 6, 18), "1422", departments[3], grades[3]),
                new Employee("김대한", new Date(2003, 12, 4), "3456", departments[1], grades[4]),
                new Employee("이민국", new Date(1993, 6, 17), "5634", departments[2], grades[0]),
                new Employee("황정민", new Date(1996, 9, 20), "1456", departments[4], grades[3]),
                new Employee("길대한", new Date(1997, 4, 24), "1345", departments[4], grades[4]),
                new Employee("백대국", new Date(2000, 1, 7), "1789", departments[3], grades[1]),
                new Employee("하충민", new Date(1994, 3, 16), "4521", departments[0], grades[0])
        };

        // 4. 실행
        Company company = new Company(employees);
        company.dataInput();
        company.display();
    }
}