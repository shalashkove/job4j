package ru.job4j.streamapi;

import org.junit.Test;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StudentTest {

    @Test
    public void when4InThen2out() {
        ru.job4j.streamapi.Student input = new ru.job4j.streamapi.Student();
        List<ru.job4j.streamapi.Student> list = List.of(
                new Student("Иванов", 10),
                new Student("Петров", 50),
                new Student("Сидоров", 60),
                new Student("Кузнецов", 90)
        );
        List<Student> result = input.levelOf(list, 50);
        List<Student> expected = List.of(
                new Student("Кузнецов", 90),
                new Student("Сидоров", 60)
        );
        assertThat(result, is(expected));
    }
}
