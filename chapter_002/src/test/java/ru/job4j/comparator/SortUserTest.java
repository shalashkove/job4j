package ru.job4j.comparator;

import org.junit.Test;
import ru.job4j.tracker.Item;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortUserTest {

    @Test
    public void whenSimpleUserSort() {
        SortUser sortUser = new SortUser();
        User one = new User("Eva", 30);
        User two = new User("Adam", 20);
        User three = new User("third", 10);
        Set<User> expect = new TreeSet<>(Arrays.asList(three, two, one));
        Set<User> result = sortUser.sort(Arrays.asList(one, three, two));
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortByNameLength() {
        SortUser sortUser = new SortUser();
        User one = new User("Eva", 30);
        User two = new User("Adam", 20);
        User three = new User("third", 10);
        List<User> expect = new ArrayList<>(Arrays.asList(one, two, three));
        List<User> result = sortUser.sortNameLength(Arrays.asList(two, three, one));
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortByAllFields() {
        SortUser sortUser = new SortUser();
        User one = new User("Сергей", 25);
        User two = new User("Иван", 30);
        User three = new User("Сергей", 20);
        User fouth = new User("Иван", 25);
        List<User> expect = new ArrayList<>(Arrays.asList(fouth, two, three, one));
        List<User> result = sortUser.sortByAllFields(new ArrayList<>(Arrays.asList(one, two, three, fouth)));
        assertThat(result, is(expect));
    }
}