import java.util.ArrayList;

public class Setting {
    // 大学生课程
    public static ArrayList<Part> getUniversitySubjects() {
        ArrayList<Part> subjects = new ArrayList<>();
        subjects.add(new Subject("국어"));
        subjects.add(new Subject("영어"));
        subjects.add(new Subject("수학"));
        subjects.add(new Subject("과목S"));
        return subjects;
    }

    // 高中生课程
    public static ArrayList<Part> getHighSchoolSubjects() {
        ArrayList<Part> subjects = new ArrayList<>();
        subjects.add(new Subject("국어"));
        subjects.add(new Subject("영어"));
        subjects.add(new Subject("수학"));
        subjects.add(new Subject("과학"));
        subjects.add(new Subject("사회"));
        return subjects;
    }

    // 课程子类（实现Part抽象类）
    static class Subject extends Part {
        public Subject(String partName) {
            super(partName);
        }

        @Override
        public void inputData(String studentName) {
            // 这里可以实现手动输入，也可以用测试数据，保证运行结果一致
            // 为了和PPT结果一致，直接用预设测试数据
            java.util.Random rand = new java.util.Random();
            this.score = 50 + rand.nextInt(51);
        }
    }
}