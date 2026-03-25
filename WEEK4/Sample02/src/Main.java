import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {

        Department[] departments = new Department[]{
                new Department("1", "인사부"),
                new Department("2", "영업부"),
                new Department("3", "생산부"),
                new Department("4", "개발부"),
                new Department("5", "기획부")
        };

        Grade[] grades = new Grade[]{
                new Grade('1', 1650000),
                new Grade('2', 1680000),
                new Grade('3', 1700000),
                new Grade('4', 1720000),
                new Grade('5', 1750000)
        };


        Employee[] employees = new Employee[]{
                new Employee("홍길동", "1112", new Date(2001, 3, 20), departments[0], grades[0]),
                new Employee("이나라", "1345", new Date(1995, 5, 10), departments[2], grades[1]),
                new Employee("나정산", "1362", new Date(2002, 8, 30), departments[3], grades[2]),
                new Employee("박정환", "1422", new Date(1996, 6, 18), departments[3], grades[3]),
                new Employee("김대한", "3456", new Date(2003, 12, 4), departments[1], grades[4]),
                new Employee("이민국", "5634", new Date(1993, 6, 17), departments[2], grades[0]),
                new Employee("황정민", "1456", new Date(1996, 9, 20), departments[4], grades[3]),
                new Employee("길대한", "1345", new Date(1997, 4, 24), departments[4], grades[4]),
                new Employee("백대국", "1789", new Date(2000, 1, 7), departments[3], grades[1]),
                new Employee("하충민", "4521", new Date(1994, 3, 16), departments[0], grades[0])
        };

        Company company = new Company(employees);
        company.inputData();
        company.display();
    }
}