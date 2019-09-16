package ru.job4j.oop;

public class Builder extends Engineer {
    private int buildings;

    public Builder(String name, String surname, String education, String birthday, int experience, int buildings) {
        super(name, surname, education, birthday, experience);
        this.buildings = buildings;
    }

    public int getBuildings() {
        return buildings;
    }

    public void build() {
    }
}
