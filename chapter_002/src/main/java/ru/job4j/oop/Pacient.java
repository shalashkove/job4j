package ru.job4j.oop;

public class Pacient extends Profession {
    private int sore;

    public Pacient(String name, String surname, String education, String birthday, int sore) {
        super(name, surname, education, birthday);
        this.sore = sore;
    }

    public int getSore() {
        return sore;
    }

    public void ill() {
    }

    public void cure() {
    }
}
