public class Person {
    protected String studentID;
    protected String name;

    public Person(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }
}