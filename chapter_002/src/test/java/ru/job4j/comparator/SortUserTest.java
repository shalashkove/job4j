package ru.job4j.comparator;

import org.junit.Test;
import ru.job4j.tracker.Item;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortUserTest {

    @Test
    public void whenFindByIdInEmptyItems() {
        SortUser sortUser = new SortUser();
        User one = new User("Eva", 30);
        User two = new User("Adam", 20);
        User three = new User("third", 10);
        Set<User> expect = new TreeSet<>(Arrays.asList(three, two, one));
        Set<User> result = sortUser.sort(Arrays.asList(one, three, two));
        assertThat(result, is(expect));
    }
}
