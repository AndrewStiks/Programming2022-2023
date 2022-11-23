package org.example;
import java.util.*;
public class ShopOfClock {
    HashMap<String, Integer> times = new HashMap<String, Integer>();
    HashMap<String, Integer> print_times = new HashMap<String, Integer>();
    ArrayList<Clock> array = new ArrayList<Clock>();
    public ShopOfClock() {
        Collections.addAll(array,
                new Clock(5, 10, "Clock1", 150),
                new Clock(23, 40,  "Clock2", 301),
                new Clock(23, 40,  "Clock3", 500),
                new Clock(23, 40,  "Clock4", 799),
                new Sec(14,15,59,"FillRogers", 999),
                new Sec(14,15,59,"Luili_Lons", 101),
                new Sec(11,22,33,"Sluli_Corps", 708)
        );
    }
    public String getMaxBank() {
        Clock disc = null;
        disc = Collections.max(array, new Comparator<Clock>() {
            @Override
            public int compare(Clock o1, Clock o2) {
                return o1.get_bank() - o2.get_bank();
            }
        });

        assert disc != null;
        return "Название: "
                + disc.get_name()
                + " Цена: "
                + disc.get_bank()
                + " Время: "
                + disc.get_time_str();
    }
    public void setAllTimes(Interface.Strela type, int val) {
        for (Clock obj : array) {
            obj.change_next(type, val);
        }
    }
    public String getMoreName() {
        for (Clock obj : array) {
            if (times.containsKey(obj.get_name())) {
                int count = times.get(obj.get_name());
                times.put(obj.get_name(), ++count);
            } else {
                times.put(obj.get_name(), 1);
            }
        }
        int max = 0;

        for (Clock obj : array) {
            if (times.get(obj.get_name()) > max) {
                max = times.get(obj.get_name());
            }
        }
        String answer = "Нет часов";
        for (Clock obj : array) {
            if (times.get(obj.get_name()) == max) {
                answer = obj.get_name();
            }
        }
        return answer;
    }
    public void printAllNames() {
        int count = 0;
        ArrayList<String> temp = new ArrayList<String>();
        for (Clock obj : array) {
            if (!temp.contains(obj.get_name())) {
                temp.add(obj.get_name());
            }
        }
        for (String name : temp) {
            System.out.println(name);
        }
    }
}
