package ru.job4j.oop;

public class Programmer extends Engineer {
    private int projects;

    public Programmer(String name, String surname, String education, String birthday, int experience, int projects) {
        super(name, surname, education, birthday, experience);
        this.projects = projects;
    }

    public int getProjects() {
        return projects;
    }

    public void hardworking() {
    }
}
