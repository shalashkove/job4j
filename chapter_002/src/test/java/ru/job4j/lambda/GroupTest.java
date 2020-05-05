package ru.job4j.lambda;

import org.junit.Test;
import ru.job4j.stream.Profiles;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class GroupTest {

    @Test
    public void whenListStudettsThenMapResult() {
        List<Student> in = List.of(
                new Student("Tom", Set.of("Reading", "Sport")),
                new Student("Anna", Set.of("IT", "Dance")),
                new Student("Polly", Set.of("Dance", "Reading")),
                new Student("John", Set.of("Sport", "IT"))
        );
        Map<String, Set<String>> result = Group.sections(in);
        Map<String, Set<String>> expected = Map.of(
                "Dance", Set.of("Anna", "Polly"),
                "IT", Set.of("Anna", "John"),
                "Reading", Set.of("Polly", "Tom"),
                "Sport", Set.of("John", "Tom")
        );
        assertThat(result, is(expected));
    }
}
