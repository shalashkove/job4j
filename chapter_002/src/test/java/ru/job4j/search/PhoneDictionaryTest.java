package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
//    @Test
//    public void whenFindByName() {
//        PhoneDictionary phones = new PhoneDictionary();
//        phones.add(
//                new Person("Petr", "Arsentev", "534872", "Bryansk")
//        );
//        List<Person> persons = phones.find("Petr");
//        assertThat(persons.iterator().next().getSurname(), is("Arsentev"));
//    }
//
//    @Test
//    public void whenFindByAddress() {
//        PhoneDictionary phones = new PhoneDictionary();
//        phones.add(
//                new Person("Petr", "Arsentev", "534872", "Bryansk")
//        );
//        List<Person> persons = phones.find("yans");
//        assertThat(persons.iterator().next().getAddress(), is("Bryansk"));
//    }
//
//    @Test
//    public void whenNoFinding() {
//        PhoneDictionary phones = new PhoneDictionary();
//        phones.add(
//                new Person("Petr", "Arsentev", "534872", "Bryansk")
//        );
//        List<Person> persons = phones.find("nothing");
//        assertThat(persons.size(), is(0));
//    }

    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
}
