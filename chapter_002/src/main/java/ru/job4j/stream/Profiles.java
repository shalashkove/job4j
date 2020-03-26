package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public List<Address> collect(List<Profile> profiles) {
        Comparator<Address> comparator = (o1, o2) -> o1.getCity().compareTo(o2.getCity());
        return profiles.stream().map(x -> x.getAddress()).collect(Collectors.toList())
                .stream().sorted(comparator).distinct().collect(Collectors.toList());
    }
}
