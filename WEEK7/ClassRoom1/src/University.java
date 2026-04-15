import java.util.ArrayList;

public class University extends Student {
    public University(String studentID, String name, ArrayList<Part> parts) {
        super(studentID, name, parts);
    }

    @Override
    public String grade(double score) {
        if (score >= 90) return "A+";
        else if (score >= 85) return "A";
        else if (score >= 80) return "B+";
        else if (score >= 75) return "B";
        else if (score >= 70) return "C+";
        else if (score >= 65) return "C";
        else if (score >= 60) return "D+";
        else if (score >= 55) return "D";
        else return "F";
    }
}