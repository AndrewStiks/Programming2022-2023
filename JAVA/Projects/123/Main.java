package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(15, 10, "MegaTime", 910);
        clock.change_next(Interface.Strela.hours, 13);
        clock.print();
        System.out.println(clock.get_name() + "\t" + clock.get_bank());
        Sec clock_sec = new Sec();
        clock_sec.set_time(21, 30, 11);
        ShopOfClock shop = new ShopOfClock();
        shop.printAllNames();
        System.out.println(clock_sec.get_name() + "\t" + clock_sec.get_bank());
        clock_sec.print();
        System.out.println(shop.getMaxBank());
    }
}