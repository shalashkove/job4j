package ru.job4j.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserConvertTest {
    @Test
    public void when3ElementsThen3() {
        UserConvert convert = new UserConvert();
        List<User> list = new ArrayList<>(List.of(
                new User(1, "John", "NewYork"),
                new User(2, "Ivan", "Moskow"),
                new User(3, "Lise", "Paris")
        ));
        HashMap<Integer, User> result = convert.process(list);
        HashMap<Integer, User> expect = new HashMap<>();
        expect.put(1, new User(1, "John", "NewYork"));
        expect.put(3, new User(3, "Lise", "Paris"));
        expect.put(1, new User(1, "John", "NewYork"));
        expect.put(2, new User(2, "Ivan", "Moskow"));
        expect.put(3, new User(3, "Lise", "Paris"));
        assertThat(result, is(expect));
    }

    @Test
    public void when0ElementsThen0() {
        UserConvert convert = new UserConvert();
        List<User> list = new ArrayList<>();
        HashMap<Integer, User> result = convert.process(list);
        HashMap<Integer, User> expect = new HashMap<>();
        assertThat(result, is(expect));
    }
}
