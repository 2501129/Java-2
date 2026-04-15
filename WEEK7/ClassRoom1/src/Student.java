import java.util.ArrayList;
import java.io.IOException;

public abstract class Student extends Person implements Myproject, Project {
    private ArrayList<Part> parts;

    public Student(String studentID, String name, ArrayList<Part> parts) {
        super(studentID, name);
        this.parts = parts;
    }

    public ArrayList<Part> getParts() {
        return parts;
    }

    public void inputData() throws IOException {
        for (int i = 0; i < parts.size(); i++) {
            parts.get(i).inputData(super.getName());
            System.out.println();
        }
    }

    public int getScore(int index) {
        if (index >= 0 && index < parts.size()) {
            return parts.get(index).getScore();
        } else {
            return -1;
        }
    }

    protected String subjectList() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < parts.size(); i++) {
            result.append(String.format("%6s", parts.get(i).getPartName()));
        }
        return result.toString();
    }

    @Override
    public double average() {
        int total = 0;
        int count = 0;
        for (Part part : parts) {
            if (part.getScore() > 0) {
                total += part.getScore();
                count++;
            }
        }
        return count > 0 ? (double) total / count : 0.0;
    }
}