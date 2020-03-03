package ru.job4j.oop.lambda;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
                        Student::getSurname,
                        student -> student
                        )
                );
    }

    public List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .sorted()
                .takeWhile(student -> student.getScore() > bound)
                .collect(Collectors.toList());
    }

    public Map<String, Set<String>> sections(List<Student> students) {
/*        class Holder {
            String key, value;

            public Holder(String key, String value) {
                this.key = key;
                this.value = value;
            }
        }*/
        return students.stream().flatMap(
                student -> student.getUnits().stream()
                .map(unit -> new Student(unit, student.getSurname())))
                .collect(Collectors.groupingBy(
                        holder -> holder.getSection(),
                        Collectors.mapping(
                                holder -> holder.getSurname(),
                                Collectors.toSet())));
    }
}
