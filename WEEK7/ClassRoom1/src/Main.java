import java.util.ArrayList;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. 初始化班级
        Classroom universityClass = new Classroom("대학교 과목 성적");
        Classroom highSchoolClass = new Classroom("고등학교 과목 성적");

        // 2. 初始化学生（和PPT运行结果一致的测试数据）
        ArrayList<Student> universityStudents = new ArrayList<>();
        universityStudents.add(new University("8000139", "김경수", Setting.getUniversitySubjects()));
        universityStudents.add(new University("8000207", "이병철", Setting.getUniversitySubjects()));
        universityStudents.add(new University("8000305", "박정희", Setting.getUniversitySubjects()));
        universityStudents.add(new University("8000403", "최순실", Setting.getUniversitySubjects()));
        universityStudents.add(new University("8000501", "문재인", Setting.getUniversitySubjects()));

        ArrayList<Student> highSchoolStudents = new ArrayList<>();
        highSchoolStudents.add(new HighSchool("9000139", "김철수", Setting.getHighSchoolSubjects()));
        highSchoolStudents.add(new HighSchool("9000207", "이영희", Setting.getHighSchoolSubjects()));
        highSchoolStudents.add(new HighSchool("9000305", "박민수", Setting.getHighSchoolSubjects()));
        highSchoolStudents.add(new HighSchool("9000403", "최지은", Setting.getHighSchoolSubjects()));
        highSchoolStudents.add(new HighSchool("9000501", "문소희", Setting.getHighSchoolSubjects()));

        // 3. 添加学生到班级
        for (Student s : universityStudents) {
            universityClass.addStudent(s);
            s.inputData();
        }
        for (Student s : highSchoolStudents) {
            highSchoolClass.addStudent(s);
            s.inputData();
        }

        // 4. 打印结果（和PPT一致）
        System.out.println("=== " + universityClass.getClassName() + " ===");
        universityClass.printAllScores();

        System.out.println("\n=== " + highSchoolClass.getClassName() + " ===");
        highSchoolClass.printAllScores();
    }
}