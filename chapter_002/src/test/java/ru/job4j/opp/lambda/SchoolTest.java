package ru.job4j.opp.lambda;

import org.junit.Test;
import ru.job4j.oop.lambda.School;
import ru.job4j.oop.lambda.Student;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class SchoolTest {

    private School school = new School();
    private List<Student> studentsScore = List.of(
            new Student(100),
            new Student(89),
            new Student(57),
            new Student(90),
            new Student(34),
            new Student(10),
            new Student(75)
    );

    private List<Student> studentSurnameAndScore = List.of(
            new Student("Kolobok", 100),
            new Student("Lisa", 89),
            new Student("Volk", 57)
    );

    private List<Student> studentSurnameUnits = List.of(
            new Student("Lisa", Set.of("1.Как поймать колобка.", "2.Как уйти от всех.", "3.Как cъесть колобка.")),
            new Student("Kolobok", Set.of("2.Как уйти от всех.")),
            new Student("Volk", Set.of("2.Как уйти от всех.", "3.Как cъесть колобка."))
    );

    @Test
    public void whenStudentScoreRange0To50() {
        List<Student> result = school.collect(studentsScore, student -> student.getScore() > 0 && student.getScore() < 50);
        List<Student> expect = List.of(
                new Student(10),
                new Student(34));
        assertThat(result, is(expect));
    }

    @Test
    public void whenStudentScoreRange50To70() {
        List<Student> result = school.collect(studentsScore, student -> student.getScore() >= 50 && student.getScore() < 70);
        List<Student> expect = List.of(new Student(57));
        assertThat(result, is(expect));
    }

    @Test
    public void whenStudentScoreRange70To100() {
        List<Student> result = school.collect(studentsScore, student -> student.getScore() >= 70 && student.getScore() <= 100);
        List<Student> expect = List.of(
                new Student(75),
                new Student(89),
                new Student(90),
                new Student(100));
        assertThat(result, is(expect));
    }

    @Test
    public void whenListToMap() {
        Map<String, Student> result = school.listToMap(studentSurnameAndScore);
        Map<String, Student> expect = Map.of(
                "Kolobok", new Student("Kolobok", 100),
                "Lisa", new Student("Lisa", 89),
                "Volk", new Student("Volk", 57));
        assertThat(result, is(expect));
    }

    @Test
    public void whenLevelOf() {
        List<Student> result = school.levelOf(studentSurnameAndScore, 70);
        List<Student> expect = List.of(
                new Student("Kolobok", 100),
                new Student("Lisa", 89));
        assertThat(result, is(expect));
    }

    @Test
    public void whenSections() {
        var result = school.sections(studentSurnameUnits);
        var expect = Map.of(
                "1.Как поймать колобка.", Set.of("Lisa"),
                "2.Как уйти от всех.", Set.of("Kolobok", "Lisa", "Volk"),
                "3.Как cъесть колобка.", Set.of("Lisa", "Volk")
        );
        assertThat(result, is(expect));
    }
}
