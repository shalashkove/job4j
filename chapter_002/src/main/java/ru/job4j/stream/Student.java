package ru.job4j.stream;

import java.util.Objects;

public class Student {
    private int score;
    private String family;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(int score) {
        this.score = score;
    }

    public Student(int score, String family) {
        this.score = score;
        this.family = family;
    }

    @Override
    public String toString() {
        return "Student{"
                + "score=" + score
                + ", family='" + family + '\''
                + '}';
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
        return score == student.score
                && Objects.equals(family, student.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, family);
    }
}
