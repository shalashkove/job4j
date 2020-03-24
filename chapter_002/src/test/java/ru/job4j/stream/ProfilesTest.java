package ru.job4j.stream;

import org.junit.Test;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void whenProfilesThenAddresses() {
        Profiles profiles = new Profiles();
        List<Address> result = profiles.collect(List.of(
                new Profile(new Address("Moscow", "Lenin st.", 10, 20)),
                new Profile(new Address("London", "Picadili st.", 5, 120)),
                new Profile(new Address("Paris", "Arbat", 20, 50))
        ));
        List<Address> expected = List.of(
                new Address("Moscow", "Lenin st.", 10, 20),
                new Address("London", "Picadili st.", 5, 120),
                new Address("Paris", "Arbat", 20, 50)
        );
        assertThat(result, is(expected));
    }

    @Test
    public void whenProfilesThenUniqueAddresses() {
        Profiles profiles = new Profiles();
        List<Address> result = profiles.collect(List.of(
                new Profile(new Address("Moscow", "Lenin st.", 10, 20)),
                new Profile(new Address("Moscow", "Lenin st.", 10, 20)),
                new Profile(new Address("London", "Picadili st.", 5, 120)),
                new Profile(new Address("London", "Picadili st.", 5, 120)),
                new Profile(new Address("London", "Picadili st.", 5, 120)),
                new Profile(new Address("Paris", "Arbat", 20, 50))
        ));
        Comparator<Address> comparator = (o1, o2) -> o1.getCity().compareTo(o2.getCity());
        result = result.stream().sorted(comparator).distinct().collect(Collectors.toList());
        List<Address> expected = List.of(
                new Address("London", "Picadili st.", 5, 120),
                new Address("Moscow", "Lenin st.", 10, 20),
                new Address("Paris", "Arbat", 20, 50)
        );
        assertThat(result, is(expected));
    }
}
