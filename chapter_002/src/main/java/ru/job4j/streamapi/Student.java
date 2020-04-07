package ru.job4j.streamapi;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student implements Comparable<Student> {
    private String name;
    private int scope;

    public String getName() {
        return name;
    }

    public int getScope() {
        return scope;
    }

    public Student() {
    }

    public Student(String name, int scope) {
        this.name = name;
        this.scope = scope;
    }

    @Override
    public int compareTo(Student o) {
        return o.getScope() - this.getScope();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return scope == student.scope
                && Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "Student{"
                + "name='"
                + name
                + '\''
                + ", scope="
                + scope
                + '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, scope);
    }

    public List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .sorted()
                .takeWhile(x -> x.getScope() > bound)
                .collect(Collectors.toList());
    }
}
