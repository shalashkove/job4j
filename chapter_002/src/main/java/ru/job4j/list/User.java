package ru.job4j.list;

import java.util.Objects;

public class User {
    int id;
    String name;
    String city;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public User(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return id == user.id
                && Objects.equals(name, user.name)
                && Objects.equals(city, user.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, city);
    }
}
