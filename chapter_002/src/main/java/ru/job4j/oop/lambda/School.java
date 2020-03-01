package ru.job4j.oop.lambda;


import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream()
                .filter(predict)
                .sorted()
                .collect(Collectors.toList());
    }

    public Map<String, Student> listToMap(List<Student> students) {
        return students.stream()
                .distinct()
                .collect(Collectors.toMap(
                        student -> student.getSurname(),
                        student -> student
                )
        );
    }
}
