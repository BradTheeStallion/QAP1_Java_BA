//Bradley Ayers
//QAP 1
//September 24, 2024

public class Date {
    int day, month, year;

    // Default Constructor
    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 1900;
    }

    // Parameterized Constructor
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Methods
    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        String DAY_OUT;
        String DAY_AS_STRING = Integer.toString(this.day);
        int lengthDay = String.valueOf(DAY_AS_STRING).length();
        if (lengthDay == 1) {
            DAY_OUT = "0" + DAY_AS_STRING;
        } else {
            DAY_OUT = DAY_AS_STRING;
        }
        String MONTH_OUT;
        String MONTH_AS_STRING = Integer.toString(this.month);
        int lengthMonth = String.valueOf(MONTH_AS_STRING).length();
        if (lengthMonth == 1) {
            MONTH_OUT = "0" + MONTH_AS_STRING;
        } else {
            MONTH_OUT = MONTH_AS_STRING;
        }

        return DAY_OUT + "/" + MONTH_OUT + "/" + getYear();
    }
}