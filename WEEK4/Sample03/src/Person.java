import java.util.Date;

public class Person {
    protected String name;
    private Date birthday;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return String.format("%3s%s", name, birthday);
    }
}