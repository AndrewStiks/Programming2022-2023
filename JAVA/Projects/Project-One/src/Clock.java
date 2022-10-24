public class Clock {
    protected String brand;
    protected int hours;
    protected int minutes;
    protected int price;

    public Clock()
    {
        this.brand = "N/A";
        this.price = 0;
        this.hours = 0;
        this.minutes = 0;
    }

    public Clock(String _b, int _p, int _h, int _m)
    {
        this. brand = _b;
        this. price = _p;
        this. hours = _h;
        this. minutes = _m;
    }

    public Clock(String _b, int _p)
    {
        this. brand = _b;
        this. price = _p;
        this. hours = java.time.LocalDateTime.now().getHour();
        this. minutes = java.time.LocalDateTime.now().getMinute();
    }

    public int getPrice()
    {
        return this.price;
    }

    public int getHours()
    {
        return this.hours;
    }

    public int getMinutes()
    {
        return this.minutes;
    }
    private void checkTime()
    {
        if (minutes > 59)
        {
            hours += minutes / 60;
            minutes %= 60;
        }
        if (hours > 23)
            hours %= 24;
    }

    public void plusTime(int _h, int _m)
    {
        hours += _h;
        minutes += _m;
        checkTime();
    }

    public void printClock()
    {
        System.out.println("" + brand + " | Price = " + price + " $");
        System.out.println("Hours = " + hours);
        System.out.println("Minutes = " + minutes);
        System.out.println("\n");
    }
}
