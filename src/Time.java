//Bradley Ayers
//QAP 1
//September 24, 2024

public class Time {
    int hour, minute, second;

    // Default Constructor
    public Time() {
        this.hour = 1;
        this.minute = 1;
        this.second = 1900;
    }

    // Parameterized Constructor
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Methods
    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setDate(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        String HOUR_OUT;
        String HOUR_AS_STRING = Integer.toString(this.hour);
        int lengthHour = String.valueOf(HOUR_AS_STRING).length();
        if (lengthHour == 1) {
            HOUR_OUT = "0" + HOUR_AS_STRING;
        } else {
            HOUR_OUT = HOUR_AS_STRING;
        }
        String MINUTE_OUT;
        String MINUTE_AS_STRING = Integer.toString(this.minute);
        int lengthMinute = String.valueOf(MINUTE_AS_STRING).length();
        if (lengthMinute == 1) {
            MINUTE_OUT = "0" + MINUTE_AS_STRING;
        } else {
            MINUTE_OUT = MINUTE_AS_STRING;
        }

        return HOUR_OUT + ":" + MINUTE_OUT + ":" + getSecond();
    }

    public void nextSecond() {
        this.second += 1;
    }

    public void previousSecond() {
        this.second -= 1;
    }
}