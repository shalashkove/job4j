package ru.job4j.stream;

import org.junit.Test;
import java.util.*;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SchoolTest {

    @Test
    public void whenStudentsInAClass() {
        School school = new School();
        List<Student> students = List.of(
                new Student(1),
                new Student(20),
                new Student(30),
                new Student(40),
                new Student(50),
                new Student(60),
                new Student(70),
                new Student(80),
                new Student(90),
                new Student(100),
                new Student(110)
        );
        Predicate<Student> predicate = x -> x.getScore() >= 70 & x.getScore() <= 100;
        List<Student> result = school.collect(students, predicate);
        List<Student> expected = List.of(
                new Student(70),
                new Student(80),
                new Student(90),
                new Student(100)
        );
        assertThat(result, is(expected));
    }

    @Test
    public void whenStudentsInBClass() {
        School school = new School();
        List<Student> students = List.of(
                new Student(1),
                new Student(20),
                new Student(30),
                new Student(40),
                new Student(50),
                new Student(60),
                new Student(70),
                new Student(80),
                new Student(90),
                new Student(100),
                new Student(110)
        );
        Predicate<Student> predicate = x -> x.getScore() >= 50 & x.getScore() < 70;
        List<Student> result = school.collect(students, predicate);
        List<Student> expected = List.of(
                new Student(50),
                new Student(60)
        );
        assertThat(result, is(expected));
    }

    @Test
    public void whenStudentsInCClass() {
        School school = new School();
        List<Student> students = List.of(
                new Student(1),
                new Student(20),
                new Student(30),
                new Student(40),
                new Student(50),
                new Student(60),
                new Student(70),
                new Student(80),
                new Student(90),
                new Student(100),
                new Student(110)
        );
        Predicate<Student> predicate = x -> x.getScore() > 0 & x.getScore() < 50;
        List<Student> result = school.collect(students, predicate);
        List<Student> expected = List.of(
                new Student(1),
                new Student(20),
                new Student(30),
                new Student(40)
        );
        assertThat(result, is(expected));
    }
}
