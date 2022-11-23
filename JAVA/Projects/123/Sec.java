package org.example;

public class Sec extends Clock implements Interface{
    int second;
    Sec()
    {
        super();
        second = 0;
    }
    public void change_next(int h, int m, int s)
    {
        hour = (hour + h) % 24;
        minute = (minute + m) % 60;
        second = (second + s) % 60;
    }
    Sec(int h, int m, int s, String name, int bank)
    {
        super(h, m, name, bank);
        if ( s >= 0 && s <= 59)
            second = s;
        else
            throw new RuntimeException(" set_Clock(): second");
    }
    public void set_time(int h, int m, int s)
    {
        if ( h >= 0 && h <= 23)
            hour = h;
        else
            throw new RuntimeException(" set_Clock(): hour");

        if ( m >= 0 && m <= 59)
            minute = m;
        else
            throw new RuntimeException("set_Clock(): minute");

        if ( s >= 0 && s <= 59)
            second = s;
        else
            throw new RuntimeException(" set_Clock(): second");
    }
    @Override
    public void print() {
        System.out.println(((super.hour < 10) ? "0"
                + super.hour : ""
                + super.hour)+":"
                +((super.minute < 10) ? "0"
                + super.minute : ""
                + super.minute)+":"
                +(second < 10 ? "0"
                +second : ""
                +second));
    }
}
