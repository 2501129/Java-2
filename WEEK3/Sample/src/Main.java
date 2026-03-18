
class Teacher {
    private String subject;
    private String name;

    public Teacher(String subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    public void teach() {
        System.out.printf("%s 선생님(%s) : 자, 수업 시작하자!\n", subject, name);
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void study(Book book) {
        System.out.printf("학생(%s) : 네~ %s으로 공부할게요!\n", name, book.getTitle());
    }
}

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("JAVA", "김철수");
        Book book = new Book("자바의 정석");
        Student student = new Student("김영희");

        teacher.teach();
        student.study(book);
    }
}