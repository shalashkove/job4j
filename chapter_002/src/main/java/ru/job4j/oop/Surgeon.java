package ru.job4j.oop;

public class Surgeon extends Doctor {
    private int operations;

    public Surgeon(String name, String surname, String education, String birthday, String degry, int operations) {
        super(name, surname, education, birthday, degry);
        this.operations = operations;
    }

    public int getOperations() {
        return operations;
    }

    public void operate() {
    }
}
