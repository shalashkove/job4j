package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicates2ThenArrayWithoutDuplicate() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        ArrayDuplicate array = new ArrayDuplicate();
        String[] source = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = array.remove(source);
        String[] expect = {"Привет", "Мир", "Супер"};
        assertThat(result, is(expect));
    }

    @Test
    public void whenRemoveDuplicates3ThenArrayWithoutDuplicate() {
        ArrayDuplicate array = new ArrayDuplicate();
        String[] source = {"Привет", "Мир", "Привет", "Супер", "Мир", "Супер"};
        String[] result = array.remove(source);
        String[] expect = {"Привет", "Мир", "Супер"};
        assertThat(result, is(expect));
    }

    @Test
    public void whenRemoveDuplicates5ThenArrayWithoutDuplicate() {
        ArrayDuplicate array = new ArrayDuplicate();
        String[] source = {"Привет", "Привет", "Привет", "Привет", "Привет", "Привет"};
        String[] result = array.remove(source);
        String[] expect = {"Привет"};
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate array = new ArrayDuplicate();
        String[] source = {"Привет"};
        String[] result = array.remove(source);
        String[] expect = {"Привет"};
        assertThat(result, is(expect));
    }

}


