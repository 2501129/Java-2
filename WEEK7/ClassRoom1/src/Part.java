import java.io.IOException;

public abstract class Part {
    protected String partName;
    protected int score;

    public Part(String partName) {
        this.partName = partName;
        this.score = 0;
    }

    public String getPartName() {
        return partName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public abstract void inputData(String studentName) throws IOException;
}