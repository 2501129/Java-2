public class Army extends Customer {
    public Army(String name, String waterNo) {
        super(name, waterNo);
        super.type = new Type("군기관", 20, 0);
    }
    @Override
    public String toString() {
        return super.toString() + " 일괄징수";
    }
}
