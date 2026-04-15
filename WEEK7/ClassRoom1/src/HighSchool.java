import java.util.ArrayList;

public class HighSchool extends Student {
    public HighSchool(String studentID, String name, ArrayList<Part> parts) {
        super(studentID, name, parts);
    }

    @Override
    public String grade(double score) {
        if (score >= 90) return "수";
        else if (score >= 80) return "우";
        else if (score >= 70) return "미";
        else if (score >= 60) return "양";
        else return "가";
    }
}