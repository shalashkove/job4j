package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        // Создаем объект треугольник.
        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 2), new Point(2, 0));
        // Вычисляем площадь.
        double result = triangle.area();
        // Задаем ожидаемый результат.
        double expected = 2D;
        //Проверяем результат и ожидаемое значение.
        assertThat(result, closeTo(expected, 0.1));
    }

    @Test
    public void whenPointsToLineThenMinus1() {
        // Создаем объект треугольник.
        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 1), new Point(0, 2));
        // Вычисляем площадь.
        double result = triangle.area();
        // Задаем ожидаемый результат.
        double expected = -1D;
        //Проверяем результат и ожидаемое значение.
        assertThat(result, closeTo(expected, 0.1));
    }

    @Test
    public void whenNotTriangleThenMinus1() {
        // Создаем объект треугольник.
        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 1), new Point(0, 3));
        // Вычисляем площадь.
        double result = triangle.area();
        // Задаем ожидаемый результат.
        double expected = -1D;
        //Проверяем результат и ожидаемое значение.
        assertThat(result, closeTo(expected, 0.1));
    }

    @Test
    public void whenAreaSetThreePointsThenRightResult() {
        // Создаем объект треугольник.
        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 3), new Point(4, 0));
        // Вычисляем площадь.
        double result = triangle.area();
        // Задаем ожидаемый результат.
        double expected = 6D;
        //Проверяем результат и ожидаемое значение.
        assertThat(result, closeTo(expected, 0.1));
    }

}
