package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {

    @Test
    public void whenMatrixThenList() {
        Matrix matrix = new Matrix();
        Integer[][] source = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        List<Integer> result = matrix.matrixToList(source);
        List<Integer> expected = List.of(
                1, 2, 3, 4, 5, 6
        );
        assertThat(result, is(expected));
    }
}
