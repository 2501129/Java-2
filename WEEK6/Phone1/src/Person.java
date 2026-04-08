public class Person {
    protected String name;
    protected Date birthDay;

    public Person(String name, Date birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public String getName() { return name; }
    public Date getBirthDay() { return birthDay; }

    @Override
    public String toString() {
        return String.format("%s (%s)", name, birthDay.toString());
    }
}