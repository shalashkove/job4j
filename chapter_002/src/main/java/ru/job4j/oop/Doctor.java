package ru.job4j.oop;

public class Doctor extends Profession {
    private String degry;

    public Doctor(String name, String surname, String education, String birthday, String degry) {
        super(name, surname, education, birthday);
        this.degry = degry;
    }

    public String getDegry() {
        return degry;
    }

    public void diagnoseheal(Pacient pacient) {
    }
}
