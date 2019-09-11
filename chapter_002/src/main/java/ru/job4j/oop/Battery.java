package ru.job4j.oop;

public class Battery {
    private int load;

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery one = new Battery();
        one.load = 8;
        Battery two = new Battery();
        two.load = 4;
        System.out.println("было: первая батарея - " + one.load + "  вторая батарея - " + two.load);
        one.exchange(two);
        System.out.println("стало: первая батарея - " + one.load + "  вторая батарея - " + two.load);
    }
}
