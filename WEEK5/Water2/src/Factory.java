public class Factory extends Customer {
    public Factory(String name, String waterNo) {
        super(name, waterNo);
        super.type = new Type("공장용", 78, 2.5f);
    }
}
