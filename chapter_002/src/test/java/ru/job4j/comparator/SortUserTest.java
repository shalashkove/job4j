package ru.job4j.comparator;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortUserTest {

    @Test
    public void whenSimpleUserSort() {
        SortUser sortUser = new SortUser();
        Set<User> expect  = new TreeSet<>(
                Set.of(
                        new User("third", 10),
                        new User("Adam", 20),
                        new User("Eva", 30)
                )
        );
        Set<User> result  = sortUser.sort(new ArrayList<>(
                List.of(
                        new User("Eva", 30),
                        new User("third", 10),
                        new User("Adam", 20)
                )
        ));
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortByNameLength() {
        SortUser sortUser = new SortUser();
        List<User> expect = new ArrayList<>(List.of(
                new User("Eva", 30),
                new User("Adam", 20),
                new User("third", 10)
        ));
        List<User> result = sortUser.sortNameLength(new ArrayList<>(List.of(
                new User("Adam", 20),
                new User("third", 10),
                new User("Eva", 30)
        )));
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortByAllFields() {
        SortUser sortUser = new SortUser();
        List<User> expect = new ArrayList<>(List.of(
                new User("Иван", 25),
                new User("Иван", 30),
                new User("Сергей", 20),
                new User("Сергей", 25)
        ));
        List<User> result = sortUser.sortByAllFields(new ArrayList<>(List.of(
                new User("Сергей", 25),
                new User("Иван", 30),
                new User("Сергей", 20),
                new User("Иван", 25)
        )));
        assertThat(result, is(expect));
    }
}