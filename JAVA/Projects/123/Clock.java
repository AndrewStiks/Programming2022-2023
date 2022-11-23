package org.example;
import java.util.Scanner;
public class Clock implements Interface{
    protected int hour;
    protected int minute;
    private String name = "";
    private int bank;
    public Clock()
    {
        hour = 12;
        minute = 0;
        name = "Time";
        bank = 100;
    }
    public Clock(int h, int m, String name, int bank){
        this.name = name;
        this.bank = bank;
        if ( h >= 0 && h <= 23)
            hour = h;
        else
            throw new RuntimeException(" Clock(): hour");

        if ( m >= 0 && m <= 59)
            minute = m;
        else
            throw new RuntimeException(" Clock(): minute");
    }
    @Override
    public int get_bank(){ return bank;  }
    @Override
    public String get_name(){
        return name;
    }

    public void change_next(Interface.Strela type, int val)
    {
        if (type == Strela.hours)
        {
            hour = (hour + val) % 24;
        }
        else
        {
            minute = (minute + val) % 60;
        }
    }
    public void set_time(int h, int m)
    {
        if ( h >= 0 && h <= 23)
            hour = h;
        else
            throw new RuntimeException(" set_Clock(): hour");

        if ( m >= 0 && m <= 59)
            minute = m;
        else
            throw new RuntimeException("set_clock(): minute");
    }
    public String get_time_str()
    {
        return ((hour < 10) ? "0"
                + hour : ""
                + hour)+":"+((minute < 10) ? "0"
                + minute : ""
                + minute);
    }
    @Override
    public void print() {
        System.out.println(((hour < 10) ? "0"
                + hour : "" + hour)
                +":"+((minute < 10) ? "0"
                + minute : ""
                + minute));
    }
}