package ru.job4j.oop;

import org.junit.Test;

public class ProfessionTest {
    @Test
    public void whenProfession() {
        Profession profession = new Profession("John",
                "Smith",
                "MGBSU",
                "25.12.1975");
        System.out.println(String.format("name: %s, "
                + "surname: %s, "
                + "education: %s, "
                + "birthday: %s",
                profession.getName(),
                profession.getSurname(),
                profession.getEducation(),
                profession.getBirthday()));
    }

    @Test
    public void whenDoctor() {
        Doctor doctor = new Doctor("John",
                "Smith",
                "MGBSU",
                "25.12.1975",
                "Magister");
        System.out.println(String.format("name: %s, surname: %s, education: %s, birthday: %s, degry: %s",
                doctor.getName(),
                doctor.getSurname(),
                doctor.getEducation(),
                doctor.getBirthday(),
                doctor.getDegry()));
    }

    @Test
    public void whenSurgeon() {
        Surgeon surgeon = new Surgeon("John",
                "Smith",
                "MGBSU",
                "25.12.1975",
                "Magister",
                0);
        System.out.println(String.format("name: %s, surname: %s, education: %s, birthday: %s, degry: %s, operations: %d",
                surgeon.getName(),
                surgeon.getSurname(),
                surgeon.getEducation(),
                surgeon.getBirthday(),
                surgeon.getDegry(),
                surgeon.getOperations()));
    }
}
