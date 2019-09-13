package ru.job4j.oop;

public class Dentist extends Doctor {
    private int teeth;

    public Dentist(String name, String surname, String education, String birthday, String degry, int teeth) {
        super(name, surname, education, birthday, degry);
        this.teeth = teeth;
    }

    public int getTeeth() {
        return teeth;
    }

    public void treatTooth() {
    }
}
