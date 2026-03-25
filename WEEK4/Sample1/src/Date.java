public class Date {
    private int year;
    private int month;
    private int day;
    private boolean flag = false;

    public Date() {}

    public Date(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public void setYear(int year) {
        if (year >= 1940 && year <= 2016) {
            this.year = year;
        } else {
            System.err.println("ERROR : 년도 오류");
            flag = true;
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.err.println("ERROR : 월 오류");
            flag = true;
        }
    }

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public void setDay(int day) {
        if (month == 2) {
            if (isLeapYear(year) && day <= 29) this.day = day;
            else if (!isLeapYear(year) && day <= 28) this.day = day;
            else flag = true;
        }
        else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day <= 31) this.day = day; else flag = true;
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day <= 30) this.day = day; else flag = true;
        }
        if (flag) System.err.println("ERROR : 일 오류");
    }

    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }

    @Override
    public String toString() {
        return year + "년 " + month + "월 " + day + "일";
    }
}