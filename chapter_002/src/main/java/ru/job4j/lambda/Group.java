package ru.job4j.lambda;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Group {

    public static Map<String, Set<String>> sections(List<Student> students) {
        return students.stream().flatMap(
                // собираем объект Holder с unit и name
                e -> e.getUnits().stream().map(m -> new Holder(m, e.getName()))
        )
                .collect(// собираем карту
                Collectors.groupingBy(t -> t.key, // определяем группировку
                                Collector.of(
                                        HashSet::new, // аккумулятор.
                                        (set, element) -> set.add(element.value),  // как добавлять данные.
                                                (left, right) -> { left.addAll(right); return left; } // для агрегации.
                                )
                        )
                );
    }

    static class Holder {
        String key, value;

        Holder(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
