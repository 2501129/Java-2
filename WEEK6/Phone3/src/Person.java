import java.util.Date;
import java.util.Calendar;

public class Person {
    private String name;
    private Date birthday;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    // 计算年龄
    public int getAge() {
        Calendar birthCal = Calendar.getInstance();
        birthCal.setTime(birthday);
        Calendar nowCal = Calendar.getInstance();
        int age = nowCal.get(Calendar.YEAR) - birthCal.get(Calendar.YEAR);
        // 生日未过则减一岁
        if (nowCal.get(Calendar.MONTH) < birthCal.get(Calendar.MONTH) ||
                (nowCal.get(Calendar.MONTH) == birthCal.get(Calendar.MONTH) &&
                        nowCal.get(Calendar.DAY_OF_MONTH) < birthCal.get(Calendar.DAY_OF_MONTH))) {
            age--;
        }
        return age;
    }

    @Override
    public String toString() {
        return name;
    }
}