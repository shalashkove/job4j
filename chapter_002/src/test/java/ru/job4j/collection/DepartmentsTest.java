package ru.job4j.collection;

import org.junit.Test;
import java.util.Collections;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> expect = List.of(
                "k1",
                "k1/sk1"
        );
        List<String> result = Departments.fillGaps(List.of(
                "k1/sk1"
        ));
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> expect = List.of(
                "k1",
                "k1/sk1"
        );
        List<String> result = Departments.fillGaps(List.of(
                "k1",
                "k1/sk1"
        ));
        assertThat(result, is(expect));
    }

    @Test
    public void whenDirectOrder() {
        List<String> expect = List.of(
                "K1",
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1/SK2",
                "K2",
                "K2/SK1",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2"
        );
        List<String> result = Departments.fillGaps(List.of(
                "K1/SK1",
                "K1/SK2",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K2",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2"
        ));
        assertThat(result, is(expect));
    }

    @Test
    public void whenReverseOrder() {
        List<String> expect = List.of(
                "K2",
                "K2/SK1",
                "K2/SK1/SSK2",
                "K2/SK1/SSK1",
                "K1",
                "K1/SK2",
                "K1/SK1",
                "K1/SK1/SSK2",
                "K1/SK1/SSK1"
        );
        List<String> result = Departments.fillGaps(List.of(
                "K1/SK1",
                "K1/SK2",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K2",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2"
        ));
        Collections.sort(result, new DepDescComp());
        assertThat(result, is(expect));
    }
}
