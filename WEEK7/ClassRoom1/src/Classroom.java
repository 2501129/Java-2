import java.util.ArrayList;

public class Classroom {
    private String className;
    private ArrayList<Student> students;

    public Classroom(String className) {
        this.className = className;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getClassName() {
        return className;
    }

    public void printAllScores() {
        System.out.println("학번\t이름\t" + students.get(0).subjectList() + "\t평균\t학점");
        for (Student s : students) {
            System.out.printf("%s\t%s\t", s.getStudentID(), s.getName());
            for (int i = 0; i < s.getParts().size(); i++) {
                System.out.printf("%6d", s.getScore(i));
            }
            double avg = s.average();
            System.out.printf("\t%.1f\t%s%n", avg, s.grade(avg));
        }
    }
}