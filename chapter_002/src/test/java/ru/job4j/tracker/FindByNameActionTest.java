package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindByNameActionTest {

    @Test
    public void whenCheckOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));

        Tracker tracker = new Tracker();
        Item item1 = new Item("fix bug");
        Item item2 = new Item("fix bug");
        tracker.add(item1);
        tracker.add(item2);
        FindByNameAction act = new FindByNameAction(5, "=== Find Item for name ===");
        act.execute(new StubInput(new String[] {"fix bug"}), tracker);

        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(item1.getId() + " " + item1.getName())
                .add(item2.getId() + " " + item2.getName())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));

        System.setOut(def);
    }
}
