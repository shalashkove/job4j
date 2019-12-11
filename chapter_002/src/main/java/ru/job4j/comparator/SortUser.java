package ru.job4j.comparator;

import java.util.*;

public class SortUser {

    public Set<User> sort(List<User> list) {
        Set<User> result = new TreeSet<>();
        result.addAll(list);
        return result;
    }

    public List<User> sortNameLength(List<User> list) {
        List<User> result = list;
        Collections.sort(result, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });
        return result;
    }

    public List<User> sortByAllFields(List<User> list) {
        List<User> result = list;
        Collections.sort(result, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                int result = o1.getName().compareTo(o2.getName());
                if (result == 0) {
                    result = o1.getAge() - o2.getAge();
                }
                return result;
            }
        });
        return result;
    }
}
