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
        List<User> list = new ArrayList<>();
        User userJohn = new User(1, "John", "NewYork");
        User userIvan = new User(2, "Ivan", "Moskow");
        User userLise = new User(3, "Lise", "Paris");
        list.add(userJohn);
        list.add(userIvan);
        list.add(userLise);
        HashMap<Integer, User> result = convert.process(list);
        HashMap<Integer, User> expect = new HashMap<>();
        expect.put(1, userJohn);
        expect.put(3, userLise);
        expect.put(1, userJohn);
        expect.put(2, userIvan);
        expect.put(3, userLise);
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
