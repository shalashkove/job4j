package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class PhoneDictionary {
//    private List<Person> persons = new ArrayList<Person>();
//
//    public void add(Person person) {
//        this.persons.add(person);
//    }
//
//    /**
//     * Вернуть список всех пользователей, который содержат key в любых полях.
//     * @param key Ключ поиска.
//     * @return Список подощедщих пользователей.
//     */
//    public List<Person> find(String key) {
//        List<Person> result = new ArrayList<>();
//        for (Person person : persons) {
//            if (person != null) {
//                if (person.getName() != null && person.getName().contains(key)) {
//                    result.add(person);
//                } else if (person.getSurname() != null && person.getSurname().contains(key)) {
//                    result.add(person);
//                } else if (person.getPhone() != null && person.getPhone().contains(key)) {
//                    result.add(person);
//                } else if (person.getAddress() != null && person.getAddress().contains(key)) {
//                    result.add(person);
//                }
//            }
//        }
//        return result;
//    }

    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> combine = x -> x.getName().contains(key)
                || x.getSurname().contains(key)
                || x.getPhone().contains(key)
                || x.getAddress().contains(key);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }

}