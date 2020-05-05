package ru.job4j.lambda;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Group {

    public static Map<String, Set<String>> sections(List<Student> students) {
        Map<String, Set<String>> result = students.stream().flatMap(
                // собираем объект Holder с unit и name
                e -> e.getUnits().stream().map(m -> new Holder(m, e.getName()))
        )
                .collect(// собираем карту
                //Collectors.groupingBy(t -> t.key, // определяем группировку
                Collectors.groupingBy(Group.Holder::getKey, // определяем группировку
//                        Collector.of(
//                                //HashSet::new, // аккумулятор.
//                                ??? new HashSet<String>(),
//                                (set, el) -> // как добавлять данные.
//                                        (left, right) -> { left.addAll(right); return left; } // для агрегации.
//                        )
                        Collectors.mapping(Holder::getValue, Collectors.toSet())
                )
        );
        return result;
    }

    static class Holder {
        String key, value;

        Holder(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "Holder{"
                    + "key='" + key + '\''
                    + ", value='" + value + '\''
                    + '}';
        }
    }
}
