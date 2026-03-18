public class Main {
    public static void main(String[] args) {
        Book book = new Book("자바의 정석");

        Student student = new Student("이영희");
        Teacher teacher = new Teacher("김철수", "JAVA");

        ClassRoom classRoom = new ClassRoom(student, teacher);
        classRoom.startClass(book);
    }
}