package ru.job4j.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 *  Calculator Класс для вычисления арифметических операций + - * /.
 *  @author Evgeny Shalashkov (shalashkove@gmail.com
 *  @since  29.08.2019
 *  @version    1.0
 */
public class Calculator {
    /**
     * Method add print result addision first and second param
     * @param first
     * @param second
     */
    public static void add(double first, double second) {
        double result =  first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    public static void div(double first, double second) {
        double result =  first / second;
        System.out.println(first + " / " + second + " = " + result);
    }

    public static void multiply(double first, double second) {
        double result =  first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    public static void subtrack(double first, double second) {
        double result =  first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    /**
     * вычисление операции на основе лямбд
     * @param start
     * @param end
     * @param func
     * @return
     */
    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> result = new ArrayList<>();
        for (int index = start; index != end; index++) {
            result.add(func.apply(Double.valueOf(index)));
        }
        return result;
    }

    /**
     * Main Точка входа.
     * @param args - args.
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtrack(10, 5);
    }
}